
package ADMIN;

import AUTHENTICATION.Login;
import Config.Session;
import Config.dbconnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Admin_Dashboard extends javax.swing.JFrame {

    public Admin_Dashboard() {
        initComponents();

        String fname = "";
        String lname = "";

        try {
            // Get user_id from session (just the ID, even if other fields may not be set)
            String userId = Session.getInstance().getID(); 

            dbconnect dbc = new dbconnect();
            Connection conn = dbc.getConnection();

            if (conn != null && userId != null && !userId.isEmpty()) {
                String sql = "SELECT first_name, last_name FROM users WHERE user_id = ?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, userId);
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    fname = rs.getString("first_name");
                    lname = rs.getString("last_name");
                }

                rs.close();
                pst.close();
                conn.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
    }

        // Update UI label
        if (fname.isEmpty() || lname.isEmpty()) {
            admin.setText("Update your profile");
        } else {
            admin.setText(fname + " " + lname);
        }
    }
    
    private void showDashboard(){
        Admin_Dashboard dash = new Admin_Dashboard();
        dash.setVisible(true);
    }
    
    private void showAccount(){
        Admin_Account acc = new Admin_Account();
        acc.setVisible(true);
    }
    
    private void showResidents(){
        Admin_Residents res = new Admin_Residents();
        res.setVisible(true);
    }
    
    private void showDocuments(){
        Admin_Document_Request req = new Admin_Document_Request();
        req.setVisible(true);
    }
    
    private void showProfile(){
        Admin_Profile prof = new Admin_Profile();
        prof.setVisible(true);
    }
    
    private void showLogs(){
        Admin_Logs log = new Admin_Logs();
        log.setVisible(true);
    }
    
    private void showSettings(){
        Admin_Settings set = new Admin_Settings();
        set.setVisible(true);
    }
    
    
    Color logoutHover = new Color (55,162,153);
    Color logoutNav = new Color (0,51,51);


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dashPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        logsPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        logoutPanel = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        logoutLogo = new javax.swing.JLabel();
        userPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        residentPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        docsPanel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        profPanel = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        settingsPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        residentCOUNT = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        residentFEMALE = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        residentMALE = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        userCOUNT1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        userPENDING1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        userACTIVE2 = new javax.swing.JLabel();

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
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashPanelMouseClicked(evt);
            }
        });
        dashPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(13, 16, 63));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(13, 16, 63));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DASHBOARD");
        dashPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));

        jPanel3.add(dashPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 200, 40));

        logsPanel.setBackground(new java.awt.Color(13, 16, 63));
        logsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        logsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logsPanelMouseClicked(evt);
            }
        });
        logsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(13, 16, 63));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("LOGS");
        logsPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));

        jPanel3.add(logsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 200, 40));

        logoutPanel.setBackground(new java.awt.Color(255, 255, 255));
        logoutPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutPanelMouseExited(evt);
            }
        });
        logoutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(13, 16, 63));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("Logout");
        logoutPanel.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 30));
        logoutPanel.add(logoutLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 30));

        jPanel3.add(logoutPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 140, 30));

        userPanel.setBackground(new java.awt.Color(13, 16, 63));
        userPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        userPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userPanelMouseClicked(evt);
            }
        });
        userPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setBackground(new java.awt.Color(13, 16, 63));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("USER ACCOUNTS");
        userPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));

        jPanel3.add(userPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, 40));

        residentPanel.setBackground(new java.awt.Color(13, 16, 63));
        residentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        residentPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                residentPanelMouseClicked(evt);
            }
        });
        residentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(13, 16, 63));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("RESIDENTS");
        residentPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));

        jPanel3.add(residentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 200, 40));

        docsPanel.setBackground(new java.awt.Color(13, 16, 63));
        docsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        docsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                docsPanelMouseClicked(evt);
            }
        });
        docsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(13, 16, 63));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DOCUMENT REQUEST");
        docsPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));

        jPanel3.add(docsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, 40));

        profPanel.setBackground(new java.awt.Color(13, 16, 63));
        profPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        profPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profPanelMouseClicked(evt);
            }
        });
        profPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(13, 16, 63));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("PROFILE");
        profPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));

        jPanel3.add(profPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 200, 40));

        settingsPanel.setBackground(new java.awt.Color(13, 16, 63));
        settingsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        settingsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsPanelMouseClicked(evt);
            }
        });
        settingsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(13, 16, 63));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SETTINGS");
        settingsPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));

        jPanel3.add(settingsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 200, 40));

        admin.setBackground(new java.awt.Color(13, 16, 63));
        admin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        admin.setText("ADMIN NAME");
        jPanel3.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 30));

        jLabel17.setBackground(new java.awt.Color(13, 16, 63));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ADMIN");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 200, 530));

        jPanel5.setBackground(new java.awt.Color(13, 16, 63));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        residentCOUNT.setBackground(new java.awt.Color(13, 16, 63));
        residentCOUNT.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        residentCOUNT.setForeground(new java.awt.Color(255, 255, 255));
        residentCOUNT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        residentCOUNT.setText("0");
        jPanel5.add(residentCOUNT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 40));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 100));

        jLabel10.setBackground(new java.awt.Color(13, 16, 63));
        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TOTAL RESIDENTS");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, 40));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(13, 16, 63));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(13, 16, 63));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FEMALE RESIDENTS");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 30));

        residentFEMALE.setBackground(new java.awt.Color(13, 16, 63));
        residentFEMALE.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        residentFEMALE.setForeground(new java.awt.Color(13, 16, 63));
        residentFEMALE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        residentFEMALE.setText("0");
        jPanel7.add(residentFEMALE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 40));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 200, 100));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(13, 16, 63));
        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(13, 16, 63));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("MALE RESIDENTS");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 30));

        residentMALE.setBackground(new java.awt.Color(13, 16, 63));
        residentMALE.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        residentMALE.setForeground(new java.awt.Color(13, 16, 63));
        residentMALE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        residentMALE.setText("0");
        jPanel8.add(residentMALE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 40));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 200, 100));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 620, 120));

        jPanel9.setBackground(new java.awt.Color(13, 16, 63));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userCOUNT1.setBackground(new java.awt.Color(13, 16, 63));
        userCOUNT1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        userCOUNT1.setForeground(new java.awt.Color(255, 255, 255));
        userCOUNT1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userCOUNT1.setText("0");
        jPanel9.add(userCOUNT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 170, 40));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 100));

        jLabel16.setBackground(new java.awt.Color(13, 16, 63));
        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("TOTAL USERS");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 170, 40));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(13, 16, 63));
        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(13, 16, 63));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("PENDING USERS");
        jPanel11.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 30));

        userPENDING1.setBackground(new java.awt.Color(13, 16, 63));
        userPENDING1.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        userPENDING1.setForeground(new java.awt.Color(13, 16, 63));
        userPENDING1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userPENDING1.setText("0");
        jPanel11.add(userPENDING1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 40));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 200, 100));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(13, 16, 63));
        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(13, 16, 63));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("ACTIVE USERS");
        jPanel12.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 200, 30));

        userACTIVE2.setBackground(new java.awt.Color(13, 16, 63));
        userACTIVE2.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        userACTIVE2.setForeground(new java.awt.Color(13, 16, 63));
        userACTIVE2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userACTIVE2.setText("0");
        jPanel12.add(userACTIVE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 200, 40));

        jPanel9.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 200, 100));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 620, 120));

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

    private void logoutPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseClicked

//        Session sess = Session.getInstance();
//        sess.logEvent("LOGOUT", "User logged out");

        int choice = JOptionPane.showConfirmDialog(
            this,
            "<html><b>Are you sure you want to log out?</b><br>This will end your current session.</html>",
            "Confirm Logout",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            new ImageIcon(getClass().getResource("/images/logout.png"))
        );

        if (choice == JOptionPane.YES_OPTION) {
            Login lg = new Login();
            lg.setLocationRelativeTo(null);
            lg.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutPanelMouseClicked

    private void logoutPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseEntered
        logoutPanel.setBackground(logoutHover);
    }//GEN-LAST:event_logoutPanelMouseEntered

    private void logoutPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutPanelMouseExited
        logoutPanel.setBackground(logoutNav);
    }//GEN-LAST:event_logoutPanelMouseExited

    private void dashPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashPanelMouseClicked
        showDashboard();
    }//GEN-LAST:event_dashPanelMouseClicked

    private void userPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userPanelMouseClicked
        showAccount();
    }//GEN-LAST:event_userPanelMouseClicked

    private void residentPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_residentPanelMouseClicked
        showResidents();
    }//GEN-LAST:event_residentPanelMouseClicked

    private void docsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_docsPanelMouseClicked
        showDocuments();
    }//GEN-LAST:event_docsPanelMouseClicked

    private void profPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profPanelMouseClicked
        showProfile();
    }//GEN-LAST:event_profPanelMouseClicked

    private void logsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logsPanelMouseClicked
        showLogs();
    }//GEN-LAST:event_logsPanelMouseClicked

    private void settingsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsPanelMouseClicked
        showSettings();
    }//GEN-LAST:event_settingsPanelMouseClicked

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
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel admin;
    private javax.swing.JLabel close;
    private javax.swing.JPanel dashPanel;
    private javax.swing.JPanel docsPanel;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel logoutLogo;
    private javax.swing.JPanel logoutPanel;
    private javax.swing.JPanel logsPanel;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel profPanel;
    private javax.swing.JLabel residentCOUNT;
    private javax.swing.JLabel residentFEMALE;
    private javax.swing.JLabel residentMALE;
    private javax.swing.JPanel residentPanel;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JLabel userACTIVE2;
    private javax.swing.JLabel userCOUNT1;
    private javax.swing.JLabel userPENDING1;
    private javax.swing.JPanel userPanel;
    // End of variables declaration//GEN-END:variables
}
