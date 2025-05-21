
package AUTHENTICATION;

import Config.dbconnect;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }
    
        private boolean validateFields() {
        if (firstname.getText().isEmpty() ||
            lastname.getText().isEmpty() ||
            role.getSelectedItem() == null ||
            email.getText().isEmpty() ||
            username.getText().isEmpty() ||
            String.valueOf(password.getPassword()).isEmpty() ||
            String.valueOf(confirmpassword.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields!", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean validatePassword() {
        String pass = String.valueOf(password.getPassword());
        String confirmPass = String.valueOf(confirmpassword.getPassword());

        if (!pass.equals(confirmPass)) {
            JOptionPane.showMessageDialog(this, "Password and Confirm Password do not match!", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (pass.length() < 8) {
            JOptionPane.showMessageDialog(this, "Password must be at least 8 characters long!", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean isUsernameDuplicate(String username) {
        dbconnect dbc = new dbconnect();
        Connection conn = dbc.getConnection();

        try {
            String sql = "SELECT username FROM users WHERE username = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            return rs.next(); // Returns true if username exists
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            return true; // Assume duplicate to prevent registration on error
        }
    }
    
      private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashedBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : hashedBytes) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        noAcct = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        noAcct2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        confirmpassword = new javax.swing.JPasswordField();
        role = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(13, 16, 63));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(13, 16, 63));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BARANGAY DOCUMENT REQUEST SYSTEM");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 40));

        minimize.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        minimize.setForeground(new java.awt.Color(240, 240, 240));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 30, 40));

        close.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        close.setForeground(new java.awt.Color(240, 240, 240));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 40));

        jPanel3.setBackground(new java.awt.Color(13, 16, 63));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(13, 16, 63));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 290, 30));

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel3.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 290, 40));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 290, 40));

        jLabel8.setBackground(new java.awt.Color(13, 16, 63));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("First Name");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 290, 30));

        noAcct.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        noAcct.setForeground(new java.awt.Color(255, 255, 255));
        noAcct.setText("LOG IN");
        noAcct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noAcctMouseClicked(evt);
            }
        });
        jPanel3.add(noAcct, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 90, 30));

        jLabel9.setBackground(new java.awt.Color(13, 16, 63));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REGISTER");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 840, 40));

        register.setBackground(new java.awt.Color(0, 51, 102));
        register.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register.setText("REGISTER");
        register.setOpaque(true);
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        jPanel3.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 290, 40));

        noAcct2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        noAcct2.setForeground(new java.awt.Color(255, 255, 255));
        noAcct2.setText("Already have an account?");
        jPanel3.add(noAcct2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 180, 30));

        jLabel10.setBackground(new java.awt.Color(13, 16, 63));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Last Name");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 290, 30));

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel3.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 290, 40));

        jLabel11.setBackground(new java.awt.Color(13, 16, 63));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Role");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 290, 30));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 290, 40));

        jLabel12.setBackground(new java.awt.Color(13, 16, 63));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Email");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 290, 30));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 290, 40));

        jLabel3.setBackground(new java.awt.Color(13, 16, 63));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirm Password");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 290, 30));

        confirmpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpasswordActionPerformed(evt);
            }
        });
        jPanel3.add(confirmpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 290, 40));

        role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "Admin", "User" }));
        jPanel3.add(role, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 290, 40));

        jLabel13.setBackground(new java.awt.Color(13, 16, 63));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Username");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 290, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 840, 480));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void noAcctMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noAcctMouseClicked
        Login log = new Login();
        this.dispose();
        log.setVisible(true);
    }//GEN-LAST:event_noAcctMouseClicked

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        if (!validateFields())   return;          
        if (!validatePassword()) return;        

        /* 2.  Pull cleaned values from the form */
        String firstName   = firstname.getText().trim();
        String lastName    = lastname.getText().trim();
        String roleChoice  = role.getSelectedItem().toString();  
        String emailText   = email.getText().trim();
        String usernameTxt = username.getText().trim();
        String plainPass   = String.valueOf(password.getPassword());

        /* 3.  Uniqueness checks (username & email) --------------- */
        if (isUsernameDuplicate(usernameTxt)) {
            JOptionPane.showMessageDialog(this,
                "Username already exists! Please choose a different one.",
                "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        dbconnect dbc = new dbconnect();         
        try (Connection conn = dbc.getConnection()) {

            if (conn == null) {
                JOptionPane.showMessageDialog(this,
                    "Database connection failed!",
                    "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            /* Optional: ensure e-mail is unique too -------------- */
            final String emailChk = "SELECT 1 FROM users WHERE email = ?";
            try (PreparedStatement psEmail = conn.prepareStatement(emailChk)) {
                psEmail.setString(1, emailText);
                try (ResultSet rs = psEmail.executeQuery()) {
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this,
                            "E-mail is already registered!",
                            "Validation Error", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
            }

            /* 5.  Hash the password ------------------------------ */
            String hashedPass = hashPassword(plainPass);
            if (hashedPass == null) {                 // hashing failed
                JOptionPane.showMessageDialog(this,
                    "Could not hash password!",
                    "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            /* 6.  Insert the new user ---------------------------- */
            final String insertSQL =
                "INSERT INTO users "
              + "(first_name, last_name, email, username, password, role, status) "
              + "VALUES (?,?,?,?,?,?,?)";

        try (PreparedStatement psInsert = conn.prepareStatement(insertSQL)) {
            psInsert.setString(1, firstName);
            psInsert.setString(2, lastName);
            psInsert.setString(3, emailText);
            psInsert.setString(4, usernameTxt);
            psInsert.setString(5, hashedPass);
            psInsert.setString(6, roleChoice);
            psInsert.setString(7, "Inactive");   // new accounts need approval

            int rows = psInsert.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(this,
                    "Registration successful!  Please wait for admin approval.",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                new Login().setVisible(true); // go back to login screen
            } else {
                JOptionPane.showMessageDialog(this,
                    "Registration failed — no rows inserted.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this,
            "Database error: " + ex.getMessage(),
            "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_registerMouseClicked

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void confirmpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpasswordActionPerformed

  
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close;
    private javax.swing.JPasswordField confirmpassword;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel noAcct;
    private javax.swing.JLabel noAcct2;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel register;
    private javax.swing.JComboBox<String> role;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
