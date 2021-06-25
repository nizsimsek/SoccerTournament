/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccertournament.GUI;

import soccertournament.Classes.Team;
import soccertournament.Classes.Tournament;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
/**
 *
 * @author Nizamettin
 */
public class ShowTeamForm extends javax.swing.JFrame {

    /** Creates new form ShowSquad */
    public ShowTeamForm() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JComboBox<String> cmbTeamList = new JComboBox<>();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        JButton btnBackToMenu = new JButton();
        JScrollPane jScrollPane1 = new JScrollPane();
        tblShowSquad = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBackToMenu.setText("Ana Menüye Dön");
        btnBackToMenu.addActionListener(this::btnBackToMenuActionPerformed);
        jScrollPane1.setViewportView(tblShowSquad);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbTeamList, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(btnBackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTeamList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackToMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();

        cmbTeamList.addItem("Takım");
        Tournament tournament = FileForm.tournament;
        for (Team team: tournament.GetResultsForTable()) {
            String teamNames = team.getTeamName();
            cmbTeamList.addItem(teamNames);
        }

        String[] header = new String [] {
                "Ad", "Soyad", "Numara", "Seviye"
        };
        ItemListener itemListener = e -> {
            int state = e.getStateChange();
            String [][] data =  new String [11][4];
            if(state == ItemEvent.SELECTED) {
                Team team = tournament.GetResultsForTable().stream()
                        .filter(item -> item.getTeamName().equals(e.getItem())).findFirst().orElse(null);
                for(int i = 0; i < 11; i++) {
                    assert team != null;
                    data[i][0] = team.getPlayerList().get(i).getName();
                    data[i][1] = team.getPlayerList().get(i).getSurname();
                    data[i][2] = team.getPlayerList().get(i).getNumber();
                    data[i][3] = String.valueOf(team.getPlayerList().get(i).getLevel());
                }
            }

            tblShowSquad.setModel(new javax.swing.table.DefaultTableModel(data, header));
        };
        cmbTeamList.addItemListener(itemListener);

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToMenuActionPerformed
        HomeForm HomeForm = new HomeForm();
        HomeForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackToMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowTeamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ShowTeamForm().setVisible(true));
    }

    private javax.swing.JTable tblShowSquad;
    // End of variables declaration//GEN-END:variables

}
