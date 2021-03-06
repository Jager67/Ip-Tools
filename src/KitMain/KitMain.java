/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KitMain;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

/**
 *
 * @author DrSkooL
 */
public class KitMain extends javax.swing.JFrame {

    /**
     * Creates new form KitMain
     */
    public KitMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DnsFixClick = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ProgramName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TitanzLogo = new javax.swing.JLabel();
        IpRelease = new javax.swing.JButton();
        IpRenew = new javax.swing.JButton();
        IpFullSetStart = new javax.swing.JButton();
        IpFullSetText = new javax.swing.JLabel();
        PingButton = new javax.swing.JButton();
        TestServerConLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IpTools v2");
        setBackground(java.awt.Color.darkGray);
        setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        setIconImages(null);
        setName("IpTFrame1"); // NOI18N

        DnsFixClick.setText("Fix");
        DnsFixClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DnsFixClickActionPerformed(evt);
            }
        });

        jLabel1.setText("Dns Fix");

        ProgramName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ProgramName.setText("Doc's IpTooLs");

        jLabel2.setText("IpConfig Release");

        jLabel3.setText("IpConfig Renew");

        TitanzLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Titanz logo Nako.jpg"))); // NOI18N
        TitanzLogo.setText("jLabel4");

        IpRelease.setText("Release");
        IpRelease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpReleaseActionPerformed(evt);
            }
        });

        IpRenew.setText("Renew");
        IpRenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpRenewActionPerformed(evt);
            }
        });

        IpFullSetStart.setText("Do all");
        IpFullSetStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpFullSetStartActionPerformed(evt);
            }
        });

        IpFullSetText.setText("Full Kit");

        PingButton.setText("Ping Titanz.tv");
        PingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PingButtonActionPerformed(evt);
            }
        });

        TestServerConLabel.setText("Test Server Connection");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TitanzLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IpRenew)
                                    .addComponent(jLabel3)
                                    .addComponent(DnsFixClick)
                                    .addComponent(IpRelease)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel2)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(IpFullSetStart)
                                                .addGap(24, 24, 24))
                                            .addComponent(IpFullSetText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(16, 16, 16))
                                    .addComponent(TestServerConLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PingButton, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addComponent(ProgramName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(ProgramName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(DnsFixClick)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(TestServerConLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IpRelease)
                            .addComponent(PingButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IpFullSetText)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IpFullSetStart))
                            .addComponent(IpRenew, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(TitanzLogo)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DnsFixClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DnsFixClickActionPerformed
        try {
            Process p = Runtime.getRuntime().exec("cmd.exe /c cd src/Tools && start Dns.bat");
        } catch (java.io.IOException ex) {
            Logger.getLogger(KitMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DnsFixClickActionPerformed

    private void IpFullSetStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpFullSetStartActionPerformed
        try {
            Process p = Runtime.getRuntime().exec("cmd /c cd src/Tools && start IpFullSet.bat");
        } catch (java.io.IOException ex)  {
            Logger.getLogger(KitMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IpFullSetStartActionPerformed

    private void IpReleaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpReleaseActionPerformed
        try {
            Process p = Runtime.getRuntime().exec("cmd /c cd src/Tools && start IpRelease.bat");
        } catch (java.io.IOException ex)  {
            Logger.getLogger(KitMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IpReleaseActionPerformed

    private void IpRenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpRenewActionPerformed
        try {
            Process p = Runtime.getRuntime().exec("cmd /c cd src/Tools && start IpRenew.bat");
        } catch (java.io.IOException ex)  {
            Logger.getLogger(KitMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_IpRenewActionPerformed

    private void PingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PingButtonActionPerformed
        try {
            Process p = Runtime.getRuntime().exec("cmd /c cd src/Tools && start PingServer.bat");
        } catch (java.io.IOException ex)  {
            Logger.getLogger(KitMain.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_PingButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Dark Metal look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (Dark Metal) ">
        /* If Dark Metal (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Dark Metal".equals(info.getName())) {
                } else {
                    javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KitMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KitMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DnsFixClick;
    private javax.swing.JButton IpFullSetStart;
    private javax.swing.JLabel IpFullSetText;
    private javax.swing.JButton IpRelease;
    private javax.swing.JButton IpRenew;
    private javax.swing.JButton PingButton;
    private javax.swing.JLabel ProgramName;
    private javax.swing.JLabel TestServerConLabel;
    private javax.swing.JLabel TitanzLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

    private static class IOException {

        public IOException() {
        }
    }
}
