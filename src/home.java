
import static java.awt.GridBagConstraints.BOTH;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zahid
 */
public class home extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NewStudentBtn = new javax.swing.JButton();
        NewBookBtn = new javax.swing.JButton();
        StatisticsBtn = new javax.swing.JButton();
        IssueBookBtn = new javax.swing.JButton();
        ReturnBookBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewStudentBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NewStudentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/New Student icon.png"))); // NOI18N
        NewStudentBtn.setText("New Student");
        NewStudentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewStudentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(NewStudentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 122, -1, 102));

        NewBookBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NewBookBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/librarymanagement/new book icon.png"))); // NOI18N
        NewBookBtn.setText("New Book");
        NewBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewBookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(NewBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 122, 226, 102));

        StatisticsBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        StatisticsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/statistics icon.png"))); // NOI18N
        StatisticsBtn.setText("Statistics");
        StatisticsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatisticsBtnActionPerformed(evt);
            }
        });
        getContentPane().add(StatisticsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 283, 223, 113));

        IssueBookBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        IssueBookBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/issue book icon.png"))); // NOI18N
        IssueBookBtn.setText("Issue Book");
        IssueBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IssueBookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(IssueBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 285, 226, -1));

        ReturnBookBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ReturnBookBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return book icon.png"))); // NOI18N
        ReturnBookBtn.setText("Return Book");
        ReturnBookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnBookBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ReturnBookBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 223, 111));

        LogoutBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout icon.png"))); // NOI18N
        LogoutBtn.setText("Logout");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(743, 455, 226, 111));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home page bg.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NewStudentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewStudentBtnActionPerformed
        // TODO add your handling code here:
        new NewStudent().setVisible(true);
    }//GEN-LAST:event_NewStudentBtnActionPerformed

    private void NewBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewBookBtnActionPerformed
        // TODO add your handling code here:
        new newBook().setVisible(true);
        
    }//GEN-LAST:event_NewBookBtnActionPerformed

    private void ReturnBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnBookBtnActionPerformed
        // TODO add your handling code here:
        new bookReturn().setVisible(true);
    }//GEN-LAST:event_ReturnBookBtnActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new loginPage().setVisible(true);
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void StatisticsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatisticsBtnActionPerformed
        // TODO add your handling code here:
        new statistics().setVisible(true);
    }//GEN-LAST:event_StatisticsBtnActionPerformed

    private void IssueBookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IssueBookBtnActionPerformed
        // TODO add your handling code here:
        new issueBook().setVisible(true);
        
    }//GEN-LAST:event_IssueBookBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IssueBookBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton NewBookBtn;
    private javax.swing.JButton NewStudentBtn;
    private javax.swing.JButton ReturnBookBtn;
    private javax.swing.JButton StatisticsBtn;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
