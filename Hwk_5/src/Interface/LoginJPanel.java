/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.HumanResources.personDirectory;
import Business.SystemAdministration.UserAccount;
import Business.SystemAdministration.userAccountDirectory;
import Interface.SystemAdminJPanel.systemAdminWorkAreaJPanel;
import Interface.userAccountJPanel.UserWorkAreaJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author yiyangyang
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminLoginJPanel
     */
   
    private JPanel CardSequenceJPanel;
    private userAccountDirectory uad;
    private personDirectory pd;
    
    public LoginJPanel(JPanel CardSequenceJPanel, personDirectory pd, userAccountDirectory uad) {
        initComponents();  
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.uad = uad;   
        this.pd = pd;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        NameTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PwdTxt = new javax.swing.JPasswordField();

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("password:");

        NameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(PwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(NameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTxtActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
            String name = NameTxt.getText();
            String pwd = String.valueOf(String.valueOf(PwdTxt.getPassword()).hashCode());
            if(name.equals("")||pwd.equals("")){
                JOptionPane.showMessageDialog(null,"Please complete all the fields","Warning",JOptionPane.WARNING_MESSAGE);
            }
            else if(uad.isValidUser(name,pwd)!=null){
                UserAccount userAccount = uad.isValidUser(name,pwd);
                if(userAccount.getRole().equals("Admin")){
                    systemAdminWorkAreaJPanel panel =new systemAdminWorkAreaJPanel(CardSequenceJPanel,userAccount,uad,pd);
                    CardSequenceJPanel.add("systemAdminWorkAreaJPanel",panel);
                    CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
                    layout.next(CardSequenceJPanel);
                }
                else if(userAccount.getRole().equals("HR")){
                    UserWorkAreaJPanel panel =new UserWorkAreaJPanel(CardSequenceJPanel,pd,userAccount,uad);
                    CardSequenceJPanel.add("UserWorkAreaJPanel",panel);
                    CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
                    layout.next(CardSequenceJPanel);
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Username and password does not match","Warning",JOptionPane.WARNING_MESSAGE);
            }
           
        
    }//GEN-LAST:event_loginBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameTxt;
    private javax.swing.JPasswordField PwdTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginBtn;
    // End of variables declaration//GEN-END:variables
}
