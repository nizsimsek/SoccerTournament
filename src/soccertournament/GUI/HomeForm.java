/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccertournament.GUI;

import javax.swing.*;
import java.io.IOException;

/**
 *
 * @author Nizamettin
 */
public class HomeForm extends javax.swing.JFrame {

    /** Creates new form HomeForm */
    public HomeForm() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        // Variables declaration - do not modify//GEN-BEGIN:variables
        JButton btnReadFile = new JButton();
        JButton btnStartTournament = new JButton();
        JButton btnShowSquad = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReadFile.setText("Dosya Oku");
        btnReadFile.addActionListener(this::btnReadFileActionPerformed);

        btnStartTournament.setText("Turnuvaya Başla Sonuçları göster");
        btnStartTournament.addActionListener(evt -> {
            try {
                btnStartTournamentActionPerformed();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        btnShowSquad.setText("Kadro Göster");
        btnShowSquad.addActionListener(this::btnShowSquadActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShowSquad, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnStartTournament, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(btnReadFile, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnReadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnStartTournament, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnShowSquad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadFileActionPerformed
        FileForm FileForm = new FileForm();
        FileForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReadFileActionPerformed

    private void btnStartTournamentActionPerformed() throws IOException {//GEN-FIRST:event_btnStartTournamentActionPerformed
        LeagueResultForm tournamentResult = new LeagueResultForm();
        tournamentResult.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnStartTournamentActionPerformed

    private void btnShowSquadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowSquadActionPerformed
        ShowTeamForm showSquad = new ShowTeamForm();
        showSquad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnShowSquadActionPerformed

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
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new HomeForm().setVisible(true));
    }

    // End of variables declaration//GEN-END:variables

}
