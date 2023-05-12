package carwash;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SigninFrame extends javax.swing.JFrame {
    
    Connection con  = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    ResultSet rs1 = null;
    PreparedStatement pst1 = null;

    public SigninFrame() {
        initComponents();
        con = DbConnection.myconn();
        ImageIcon icon = new ImageIcon("C:\\Users\\JAGUAR\\Documents\\GitHub\\Car-wash-application-dextop\\CARWASH_QR_Update\\src\\carwash\\car.png");
        setIconImage(icon.getImage());
        
   
    }
    String emil;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pfPassword = new com.raven.swing.PasswordField();
        tfEmail = new com.raven.swing.TextField();
        LOGIN = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        SigninPage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ToreX Technologies");
        setBounds(383,221,720,390);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(45, 21, 203));
        jLabel3.setText("Sign up");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        pfPassword.setLabelText("Password");
        pfPassword.setLineColor(new java.awt.Color(131, 126, 253));
        pfPassword.setSelectionColor(new java.awt.Color(157, 153, 255));
        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(pfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 310, -1));

        tfEmail.setLabelText("Email");
        tfEmail.setLineColor(new java.awt.Color(131, 126, 253));
        tfEmail.setSelectionColor(new java.awt.Color(157, 153, 255));
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });
        jPanel1.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 310, -1));

        LOGIN.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        LOGIN.setText("LOGIN");
        jPanel1.add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 140, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Forgot Password?");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 100, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 0, 12)); // NOI18N
        jLabel2.setText("Don't have account? ");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 110, -1));

        btnLogin.setBackground(new java.awt.Color(45, 21, 203));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setFocusable(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 100, 40));

        SigninPage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carwash/images/Loging.png"))); // NOI18N
        SigninPage.setText("SignInFrame");
        jPanel1.add(SigninPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 387));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        dispose();
        new registerFrame().setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setForeground(Color.red);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setForeground(Color.black);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseExited

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String email = tfEmail.getText();
        String emil = email;
        
        String password = String.valueOf(pfPassword.getPassword());
        try{
            String sql = "SELECT * FROM customers WHERE email=? AND password=?";
            String sql1 = "SELECT name,customer_id FROM customers WHERE email=?";

            pst = con.prepareCall(sql);
            pst.setString(1,email);
            pst.setString(2, password);
            pst1 = con.prepareCall(sql1);
            pst1.setString(1,email);

            rs = pst.executeQuery();
            rs1 = pst1.executeQuery();
            //String user = rs.getString(3);
            if(rs.next()){
                new splashscreen.SplashScreen(null, true).setVisible(true);
                if(rs1.next()){
                String name = rs1.getString("name");
                String UserID = rs1.getString("customer_id");
                String branchName=null;
                new DashBoard(name,UserID,branchName).setVisible(true);
            }
                /*JOptionPane.showMessageDialog(rootPane,"your loading");
                dispose();*/
                //String userName = "hashan";// retrieve user name from authentication system
             /*DashBoard dashboard = new DashBoard();
              dashboard.setUserName(userName);*/
               // DashBoard dash = new DashBoard();
                /*dash.pack();
                dash.setLocationRelativeTo(null);
               dash.setExtendedState(JFrame.MAXIMICED_BOTH);
                dash.nameWelcome.setText(name);*/
                //dash.nameWelcome.setText(name);
                
                dispose();
                
                //new Login().setVisible(false);
            
            }
            
            else {
                JOptionPane.showMessageDialog(rootPane,"your login failed");
            }
        }catch(Exception e){

            System.out.println(e);

        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(SigninFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SigninFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SigninFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SigninFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SigninFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LOGIN;
    private javax.swing.JLabel SigninPage;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private com.raven.swing.PasswordField pfPassword;
    private com.raven.swing.TextField tfEmail;
    // End of variables declaration//GEN-END:variables
}
