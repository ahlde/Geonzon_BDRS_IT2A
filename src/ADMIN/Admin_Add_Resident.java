
package ADMIN;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;

public class Admin_Add_Resident extends javax.swing.JFrame {

    public Admin_Add_Resident() {
        initComponents();
    }
    
    private void clearForm() {
        firstname.setText("");
        middlename.setText("");
        lastname.setText("");
        birth.setDate(null);
        gender.setSelectedIndex(0);
        civil.setSelectedIndex(0);
        contact.setText("");
        email.setText("");
        purok.setText("");
        street.setText("");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        minimize1 = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        minimize2 = new javax.swing.JLabel();
        close2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        image = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        middlename = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        civil = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        purok = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        street = new javax.swing.JTextField();
        add = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 390, 40));

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

        minimize1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        minimize1.setForeground(new java.awt.Color(240, 240, 240));
        minimize1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize1.setText("—");
        minimize1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize1MouseClicked(evt);
            }
        });
        jPanel2.add(minimize1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 30, 40));

        close1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        close1.setForeground(new java.awt.Color(240, 240, 240));
        close1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close1.setText("X");
        close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close1MouseClicked(evt);
            }
        });
        jPanel2.add(close1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 40));

        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        minimize2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        minimize2.setForeground(new java.awt.Color(240, 240, 240));
        minimize2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize2.setText("—");
        minimize2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize2MouseClicked(evt);
            }
        });
        jPanel2.add(minimize2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 30, 40));

        close2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        close2.setForeground(new java.awt.Color(240, 240, 240));
        close2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close2.setText("X");
        close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close2MouseClicked(evt);
            }
        });
        jPanel2.add(close2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 40, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 40));

        jPanel3.setBackground(new java.awt.Color(13, 16, 63));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout imageLayout = new javax.swing.GroupLayout(image);
        image.setLayout(imageLayout);
        imageLayout.setHorizontalGroup(
            imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        imageLayout.setVerticalGroup(
            imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel3.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 130, 110));

        jLabel10.setBackground(new java.awt.Color(13, 16, 63));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("First Name");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 270, 20));

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel3.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 270, 30));

        jLabel11.setBackground(new java.awt.Color(13, 16, 63));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Middle Name");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 270, 20));

        middlename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middlenameActionPerformed(evt);
            }
        });
        jPanel3.add(middlename, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 270, 30));

        jLabel12.setBackground(new java.awt.Color(13, 16, 63));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Gender");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 270, 20));

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel3.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 270, 30));

        jLabel13.setBackground(new java.awt.Color(13, 16, 63));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Last Name");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 270, 20));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Gender", "Male", "Female" }));
        jPanel3.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 270, 30));

        jLabel14.setBackground(new java.awt.Color(13, 16, 63));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Date of Birth");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 270, 20));

        jLabel15.setBackground(new java.awt.Color(13, 16, 63));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Civil Status");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 270, 20));

        civil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Civil Status", "Single", "Married", "Widowed", "Divorced" }));
        jPanel3.add(civil, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 270, 30));

        jLabel16.setBackground(new java.awt.Color(13, 16, 63));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Contact Number");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, 270, 20));

        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        jPanel3.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 270, 30));

        jLabel17.setBackground(new java.awt.Color(13, 16, 63));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Email");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 300, 270, 20));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 270, 30));

        jLabel18.setBackground(new java.awt.Color(13, 16, 63));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Purok");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 270, 20));

        purok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purokActionPerformed(evt);
            }
        });
        jPanel3.add(purok, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 270, 30));

        jLabel19.setBackground(new java.awt.Color(13, 16, 63));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Street Address");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 270, 20));

        street.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetActionPerformed(evt);
            }
        });
        jPanel3.add(street, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 270, 30));

        add.setBackground(new java.awt.Color(0, 51, 102));
        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("ADD RESIDENT");
        add.setOpaque(true);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        jPanel3.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 290, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 620, 550));

        jLabel9.setBackground(new java.awt.Color(13, 16, 63));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(13, 16, 63));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("ADD NEW RESIDENT");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 620, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimize1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize1MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimize1MouseClicked

    private void close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_close1MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Admin_Residents back = new Admin_Residents();
        back.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void minimize2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize2MouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimize2MouseClicked

    private void close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_close2MouseClicked

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void middlenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middlenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middlenameActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void purokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purokActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purokActionPerformed

    private void streetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        try {
        // Get input values
        String firstName = firstname.getText().trim();
        String middleName = middlename.getText().trim();
        String lastName = lastname.getText().trim();
        Date birthDate = birth.getDate();
        String genderValue = gender.getSelectedItem().toString();
        String civilStatus = civil.getSelectedItem().toString();
        String contactNumber = contact.getText().trim();
        String emailValue = email.getText().trim();
        String purokValue = purok.getText().trim();
        String streetValue = street.getText().trim();

        // Required field validation
        if (firstName.isEmpty() || lastName.isEmpty() || birthDate == null || genderValue.isEmpty() || civilStatus.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill out all required fields.", "Missing Information", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validate birth date
        if (birthDate.after(new Date())) {
            JOptionPane.showMessageDialog(this, "Date of birth cannot be in the future.", "Invalid Birth Date", JOptionPane.WARNING_MESSAGE);
            return;
        }

            // Validate contact number (11 digits only)
            if (!contactNumber.matches("\\d{11}")) {
                JOptionPane.showMessageDialog(this, "Contact number must be exactly 11 digits.", "Invalid Contact", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Validate email format (if provided)
            if (!emailValue.isEmpty()) {
                String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
                if (!emailValue.matches(emailRegex)) {
                    JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Invalid Email", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }

            // Connect to DB
            dbconnect dbc = new dbconnect();
            Connection conn = dbc.getConnection();

            // Check for duplicate email
            if (!emailValue.isEmpty()) {
                PreparedStatement checkEmail = conn.prepareStatement("SELECT * FROM residents WHERE email = ?");
                checkEmail.setString(1, emailValue);
                ResultSet rs = checkEmail.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(this, "Email already exists. Please use a different one.", "Duplicate Email", JOptionPane.WARNING_MESSAGE);
                    rs.close();
                    checkEmail.close();
                    return;
                }
                rs.close();
                checkEmail.close();
            }

            // Check for duplicate contact number
            PreparedStatement checkContact = conn.prepareStatement("SELECT * FROM residents WHERE contact_number = ?");
            checkContact.setString(1, contactNumber);
            ResultSet rs2 = checkContact.executeQuery();
            if (rs2.next()) {
                JOptionPane.showMessageDialog(this, "Contact number already exists. Please use a different one.", "Duplicate Contact", JOptionPane.WARNING_MESSAGE);
                rs2.close();
                checkContact.close();
                return;
            }
            rs2.close();
            checkContact.close();

            // Insert resident
            String sql = "INSERT INTO residents (first_name, middle_name, last_name, date_of_birth, gender, civil_status, contact_number, email, purok, street_address) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, firstName);
            pstmt.setString(2, middleName);
            pstmt.setString(3, lastName);
            pstmt.setDate(4, new java.sql.Date(birthDate.getTime()));
            pstmt.setString(5, genderValue);
            pstmt.setString(6, civilStatus);
            pstmt.setString(7, contactNumber);
            pstmt.setString(8, emailValue);
            pstmt.setString(9, purokValue);
            pstmt.setString(10, streetValue);

            int rows = pstmt.executeUpdate();

            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Resident added successfully!", "✅ Success", JOptionPane.INFORMATION_MESSAGE);
                clearForm(); // Clear the form
            } else {
                JOptionPane.showMessageDialog(this, "Failed to add resident.", "❌ Error", JOptionPane.ERROR_MESSAGE);
            }

            pstmt.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "❌ Exception", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_addMouseClicked

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
            java.util.logging.Logger.getLogger(Admin_Add_Resident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Add_Resident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Add_Resident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Add_Resident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Add_Resident().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel back;
    private javax.swing.JComboBox<String> civil;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JLabel close2;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JTextField firstname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JPanel image;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField middlename;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel minimize1;
    private javax.swing.JLabel minimize2;
    private javax.swing.JTextField purok;
    private javax.swing.JTextField street;
    // End of variables declaration//GEN-END:variables
}
