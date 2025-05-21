
package ADMIN;

import Config.dbconnect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Admin_Add_Request extends javax.swing.JFrame {

    // Constructor with resident ID
    public Admin_Add_Request(int residentId) {
        initComponents();
        
        // Make the name and birth date fields uneditable
        firstname.setEditable(false);
        lastname.setEditable(false);
        birth.setEditable(false);
        
        loadSelectedResident(residentId);
        loadDocumentTypes();
    }

    // Default constructor
    public Admin_Add_Request() {
        initComponents();
        loadDocumentTypes();
    }
    
    private void loadSelectedResident(int residentId) {
        try {
            dbconnect dbc = new dbconnect();
            Connection conn = dbc.getConnection();

                String query = "SELECT first_name, last_name, date_of_birth FROM residents WHERE resident_id = ?";
                PreparedStatement pstmt = conn.prepareStatement(query);
                pstmt.setInt(1, residentId);
                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) {
                    String firstName = rs.getString("first_name");
                    String lastName = rs.getString("last_name");
                    Date dob = rs.getDate("date_of_birth");

                    // Format DOB: October 20, 2002
                    SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");
                    String formattedDob = sdf.format(dob);

                    residentID.setText(String.valueOf(residentId));
                    firstname.setText(firstName);
                    lastname.setText(lastName);
                    birth.setText(formattedDob);
                }

                rs.close();
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error loading resident info: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        private void loadDocumentTypes() {
        try {
            dbconnect dbc = new dbconnect();
            Connection conn = dbc.getConnection();

            String query = "SELECT document_name FROM documents";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                type.addItem(rs.getString("document_name"));
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading document types: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        firstname = new javax.swing.JTextField();
        residentID = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        request = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        birth = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        purpose = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        minimize1 = new javax.swing.JLabel();
        close1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(13, 16, 63));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel3.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 290, 40));

        residentID.setBackground(new java.awt.Color(13, 16, 63));
        residentID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        residentID.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(residentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 110, 30));

        jLabel9.setBackground(new java.awt.Color(13, 16, 63));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REQUEST A DOCUMENT");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 710, 40));

        request.setBackground(new java.awt.Color(0, 51, 102));
        request.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        request.setForeground(new java.awt.Color(255, 255, 255));
        request.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        request.setText("REQUEST");
        request.setOpaque(true);
        request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestMouseClicked(evt);
            }
        });
        jPanel3.add(request, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 290, 40));

        jLabel10.setBackground(new java.awt.Color(13, 16, 63));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Last Name");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 290, 30));

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel3.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 290, 40));

        jLabel11.setBackground(new java.awt.Color(13, 16, 63));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Document Type");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 290, 30));

        jLabel12.setBackground(new java.awt.Color(13, 16, 63));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("(e.g. Employment, Travel, etc");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 220, 30));

        birth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthActionPerformed(evt);
            }
        });
        jPanel3.add(birth, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 290, 40));

        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel3.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 290, 40));

        jLabel13.setBackground(new java.awt.Color(13, 16, 63));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date of Birth");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 290, 30));

        jLabel14.setBackground(new java.awt.Color(13, 16, 63));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("RESIDENT ID:");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, 30));

        jLabel15.setBackground(new java.awt.Color(13, 16, 63));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Purpose ");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 70, 30));

        purpose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purposeActionPerformed(evt);
            }
        });
        jPanel3.add(purpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 290, 40));

        jLabel16.setBackground(new java.awt.Color(13, 16, 63));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("First Name");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 290, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 710, 410));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void requestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_requestMouseClicked
        String docType = (String) type.getSelectedItem();
        String reqPurpose = purpose.getText().trim();

        if (docType == null || docType.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please select a document type.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (reqPurpose.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter the purpose of the request.", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int residentId = Integer.parseInt(residentID.getText());

        try {
            dbconnect dbc = new dbconnect();
            Connection conn = dbc.getConnection();

            // Get document_id by document_name
            String getDocIdSQL = "SELECT document_id FROM documents WHERE document_name = ?";
            PreparedStatement getDocPstmt = conn.prepareStatement(getDocIdSQL);
            getDocPstmt.setString(1, docType);
            ResultSet docRs = getDocPstmt.executeQuery();

            int docId = -1;
            if (docRs.next()) {
                docId = docRs.getInt("document_id");
            } else {
                JOptionPane.showMessageDialog(this, "Selected document type not found!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            docRs.close();
            getDocPstmt.close();

            // Insert into document_requests
            String insertSQL = "INSERT INTO document_requests (resident_id, document_id, purpose, status) VALUES (?, ?, ?, 'Pending')";
            PreparedStatement insertPstmt = conn.prepareStatement(insertSQL);
            insertPstmt.setInt(1, residentId);
            insertPstmt.setInt(2, docId);
            insertPstmt.setString(3, reqPurpose);

            int result = insertPstmt.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(this, "Request submitted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Failed to submit request.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            insertPstmt.close();
            conn.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_requestMouseClicked

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void birthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthActionPerformed

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
        Admin_Residents res = new Admin_Residents();
        res.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void purposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purposeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purposeActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Add_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Add_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Add_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Add_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Add_Request().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JTextField birth;
    private javax.swing.JLabel close;
    private javax.swing.JLabel close1;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel minimize1;
    private javax.swing.JTextField purpose;
    private javax.swing.JLabel request;
    private javax.swing.JLabel residentID;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
