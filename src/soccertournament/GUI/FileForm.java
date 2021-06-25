/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccertournament.GUI;

import soccertournament.Classes.Tournament;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

/**
 *
 * @author Nizamettin
 */
public class FileForm extends javax.swing.JFrame {

    public static Tournament tournament = new Tournament();

    /** Creates new form FileForm */
    public FileForm() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLabel lblWritePath = new JLabel();
        txtFilePath = new javax.swing.JTextField();
        JButton btnReadFile = new JButton();
        // Variables declaration - do not modify//GEN-BEGIN:variables
        JButton btnBacktoMenu = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblWritePath.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 14)); // NOI18N
        lblWritePath.setText("Lütfen Dosya Yolunu Yapıştırın");

        btnReadFile.setText("Dosya Oku");
        btnReadFile.addActionListener(evt -> {
            try {
                btnReadFileActionPerformed();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        btnBacktoMenu.setText("Ana Menüye Dön");
        btnBacktoMenu.setActionCommand("Menüye Dön");
        btnBacktoMenu.addActionListener(this::btnBacktoMenuActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblWritePath, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnReadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btnBacktoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblWritePath, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnReadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnBacktoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        btnBacktoMenu.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBacktoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoMenuActionPerformed
        HomeForm HomeForm = new HomeForm();
        HomeForm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBacktoMenuActionPerformed

    public static String filePath() {
        return txtFilePath.getText();
    }

    private void btnReadFileActionPerformed() throws IOException {//GEN-FIRST:event_btnReadFileActionPerformed
        tournament.ReadFile(filePath());
        tournament.GetResultsForTable().clear();
        tournament.GenerateTeam();
        tournament.StartTournament();
    }//GEN-LAST:event_btnReadFileActionPerformed

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
            java.util.logging.Logger.getLogger(FileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FileForm().setVisible(true));
    }

    private static javax.swing.JTextField txtFilePath;
    // End of variables declaration//GEN-END:variables

}
