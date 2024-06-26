/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stock_management.gui;


import com.stock_management.functionality.CredentialController;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

public class LoginFrame extends javax.swing.JFrame {

    private static final long serialVersionUID = 198L;

    /**
     * Creates new form mainFrame
     */
    
    private CredentialController cd;
    public LoginFrame() {
        initComponents();
        initCredentialController();
        wrongCredentialsJL.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginUserPanel = new javax.swing.JPanel();
        titleMainfLabel = new javax.swing.JLabel();
        loginUser = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        loginPassword = new javax.swing.JPasswordField();
        wrongCredentialsJL = new javax.swing.JLabel();
        clearLoginButton = new javax.swing.JButton();
        logINButton = new javax.swing.JButton();
        forgetPWB = new javax.swing.JButton();
        createUserPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        createCName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        createUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        createPassword = new javax.swing.JTextField();
        createB = new javax.swing.JButton();
        createClearB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBounds(new java.awt.Rectangle(500, 400, 0, 0));
        setResizable(false);

        loginUserPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        loginUserPanel.setPreferredSize(new java.awt.Dimension(293, 199));

        titleMainfLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        titleMainfLabel.setText("User Authentication");

        usernameLabel.setText("User Name:");

        passwordLabel.setText("Password:");

        wrongCredentialsJL.setForeground(new java.awt.Color(255, 0, 0));
        wrongCredentialsJL.setText("*Wrong User Name or Password!");

        clearLoginButton.setText("Clear");
        clearLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearLoginButtonActionPerformed(evt);
            }
        });

        logINButton.setText("LOG IN");
        logINButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logINButtonActionPerformed(evt);
            }
        });

        forgetPWB.setText("Forgot Password");
        forgetPWB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgetPWBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginUserPanelLayout = new javax.swing.GroupLayout(loginUserPanel);
        loginUserPanel.setLayout(loginUserPanelLayout);
        loginUserPanelLayout.setHorizontalGroup(
            loginUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginUserPanelLayout.createSequentialGroup()
                        .addComponent(forgetPWB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(logINButton)
                        .addGap(18, 18, 18)
                        .addComponent(clearLoginButton))
                    .addGroup(loginUserPanelLayout.createSequentialGroup()
                        .addComponent(titleMainfLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(loginUserPanelLayout.createSequentialGroup()
                        .addGroup(loginUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordLabel)
                            .addComponent(usernameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(loginUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginUserPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(wrongCredentialsJL))
                            .addComponent(loginPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginUser, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        loginUserPanelLayout.setVerticalGroup(
            loginUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleMainfLabel)
                .addGap(30, 30, 30)
                .addGroup(loginUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(loginUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(loginUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(wrongCredentialsJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(loginUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearLoginButton)
                    .addComponent(logINButton)
                    .addComponent(forgetPWB))
                .addContainerGap())
        );

        createUserPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Create User Account");

        jLabel2.setText("Company Name:");

        jLabel3.setText("User Name:");

        jLabel4.setText("Password:");

        createB.setText("Create");
        createB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBActionPerformed(evt);
            }
        });

        createClearB.setText("Clear");
        createClearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createClearBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createUserPanelLayout = new javax.swing.GroupLayout(createUserPanel);
        createUserPanel.setLayout(createUserPanelLayout);
        createUserPanelLayout.setHorizontalGroup(
            createUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(createUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createUserPanelLayout.createSequentialGroup()
                        .addGroup(createUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(createUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(createCName)
                            .addComponent(createUser)))
                    .addGroup(createUserPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 104, Short.MAX_VALUE))
                    .addGroup(createUserPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(createB)
                        .addGap(18, 18, 18)
                        .addComponent(createClearB)))
                .addContainerGap())
        );
        createUserPanelLayout.setVerticalGroup(
            createUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(createUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(createCName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(createUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(createUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createClearB)
                    .addComponent(createB))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 317, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(loginUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(createUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(loginUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(11, 11, 11)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(createUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void logINButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logINButtonActionPerformed
        // TODO add your handling code here:
        if (getLoginData())
            return;
        if (cd.authenticate(user,password)) {
            String[] userInfo = cd.getUserInfo();
            try {
                new IMSFrame(null);
            } catch (Exception ex) {
                Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            cd.eraseCredential();
            this.dispose();
        } else {
            wrongCredentialsJL.setVisible(true);
            Timer timer = new Timer(1000, (ActionEvent e) -> {
                wrongCredentialsJL.setVisible(false);
            });
            timer.start();
            loginAttempt++;
        }
        if (loginAttempt > 3) {
            JOptionPane.showMessageDialog(this, "Too Many Login Attempts!", "Error: Intruder", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }//GEN-LAST:event_logINButtonActionPerformed

    private void createClearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createClearBActionPerformed
        // TODO add your handling code here:
        createUser.setText("");
        createPassword.setText("");
        createCName.setText("");
    }//GEN-LAST:event_createClearBActionPerformed

    private void createBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBActionPerformed
        // TODO add your handling code here:
        if (getCreateUserData()) {
            return;
        }
        cd.createAccount(user, password, company);     
        try {
            cd.outCredential();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Credential Either Corrupted OR Not Found!", "Error: IO Exception", JOptionPane.ERROR_MESSAGE);
        }
        backupCode = cd.getBackupCode();
        copyClipboard(backupCode);
        JOptionPane.showMessageDialog(this, "User Account Successfully Created!\n-User Name: "
                + user + "\n-Password: " + password + "\n\nBackup code: " + backupCode
                + "\n\nIMPORTANT: Backup code helps to reset your password, in case you forget it!\n"
                + "[Press 'ctrl + v' to paste the Backup code from the Clipboard.]",
                "Please! Save The Backup Code Safely ", JOptionPane.INFORMATION_MESSAGE);
        loginUserPanel.setVisible(true);
        createUserPanel.setVisible(false);
        cd.eraseCredential();
    }//GEN-LAST:event_createBActionPerformed

    private void clearLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearLoginButtonActionPerformed
        // TODO add your handling code here:
        wrongCredentialsJL.setVisible(false);
        loginUser.setText("");
        loginPassword.setText("");
    }//GEN-LAST:event_clearLoginButtonActionPerformed

    private void copyClipboard(String value) {
        Clipboard forCopy = Toolkit.getDefaultToolkit().getSystemClipboard();
        forCopy.setContents(new StringSelection(value), null);
    }
    
    private void forgetPWBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgetPWBActionPerformed
        // TODO add your handling code here:
        JTextField userField = new JTextField();
        JTextField codeField = new JTextField();        
        Object[] fields = {"User", userField, "Backup Code", codeField};        
        int i = JOptionPane.showConfirmDialog(this, fields, "Forgot Password", JOptionPane.OK_CANCEL_OPTION);
        if(i == JOptionPane.CANCEL_OPTION) return;
        System.out.println("hello");
        if (userField.getText().isBlank() || codeField.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Don't leave fields empty!", "Error: EmptyFields", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(!cd.verifyBackupcode(userField.getText(), codeField.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid user or BackupCode", "Error: Authentication Fail", JOptionPane.WARNING_MESSAGE);
        } else {
            try {       
                JTextField jt = new JTextField();
                int j = JOptionPane.showConfirmDialog(this, new Object[]{"Enter your New Password!", jt}, "Reset Password!", JOptionPane.OK_OPTION);
                if(j == JOptionPane.CANCEL_OPTION) return;
                if (password.isBlank()) {
                    JOptionPane.showMessageDialog(this, "Don't leave field empty!", "Error: Password Field Empty" , JOptionPane.WARNING_MESSAGE);
                }               
                cd.changePassword(password);
                cd.outCredential();
                backupCode = cd.getBackupCode();
                JOptionPane.showMessageDialog(this, "Password Successfully Reset!\n-New Password: "
                        + password + "\nNew Backup code: " + backupCode
                        + "\n[Press 'ctrl + v' to paste the Backup code from the Clipboard.]",
                        "Please! Save The Backup Code Safely ", JOptionPane.INFORMATION_MESSAGE);
                copyClipboard(backupCode);
            } catch (IOException ex) {
                Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cd.eraseCredential();
    }//GEN-LAST:event_forgetPWBActionPerformed

    public static void runFrame(){
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true);
        });
    }

    private int loginAttempt;
    private String user;
    private String password;
    private String company;
    private String backupCode;

    private void initCredentialController() {
         cd = CredentialController.getInstance();
        if (cd.checkFileAvaibility()) {
             try {
                 cd.inCredential();
             } catch (IOException | ClassNotFoundException ex) {
                 JOptionPane.showMessageDialog(this, "Credential Either Corrupted OR Not Found!", "Error: IO Exception", JOptionPane.ERROR_MESSAGE);
                 return;
             }
            loginUserPanel.setVisible(false);
            createUserPanel.setVisible(true);
            return;
        }
        int i = JOptionPane.showConfirmDialog(this, "Create New User Account!", "Error: No User Found", JOptionPane.OK_CANCEL_OPTION);
        if (i == JOptionPane.OK_OPTION) {
            loginUserPanel.setVisible(false);
            createUserPanel.setVisible(true);
        } else {
            System.exit(0);
        }
    }

    
    private boolean getLoginData() {
        boolean isEmpty = false;
        user = loginUser.getText().trim();
        System.out.println(user);
        if (user.isEmpty()) {
            isEmpty = true;
        }
        password = new String(loginPassword.getPassword());
        if (password.isEmpty()) {
            isEmpty = true;
        }
        System.out.println(password);
        if (isEmpty) {
            JOptionPane.showMessageDialog(this, "Don't leave Fields empty!", "Error: Required Data Unavailable", JOptionPane.WARNING_MESSAGE);
        }
        return isEmpty;
    }

    private boolean getCreateUserData() {
        boolean emptyFields = false;
        user = createUser.getText().trim();
        if (user.isEmpty()) {
            emptyFields = true;
        }
        password = createPassword.getText().trim();
        if (password.isEmpty()) {
            emptyFields = true;
        }
        company = createCName.getText().trim();
        if (company.isEmpty()) {
            emptyFields = true;
        }
        if (emptyFields) {
            JOptionPane.showMessageDialog(this, "Don't leave Fields empty!", "Error: Required Data Unavailable", JOptionPane.WARNING_MESSAGE);
        }
        return emptyFields;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearLoginButton;
    private javax.swing.JButton createB;
    private javax.swing.JTextField createCName;
    private javax.swing.JButton createClearB;
    private javax.swing.JTextField createPassword;
    private javax.swing.JTextField createUser;
    private javax.swing.JPanel createUserPanel;
    private javax.swing.JButton forgetPWB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton logINButton;
    private javax.swing.JPasswordField loginPassword;
    private javax.swing.JTextField loginUser;
    private javax.swing.JPanel loginUserPanel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel titleMainfLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel wrongCredentialsJL;
    // End of variables declaration//GEN-END:variables
}