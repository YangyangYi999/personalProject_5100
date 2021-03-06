/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.userAccountJPanel;

import Business.HumanResources.Person;
import Business.SystemAdministration.UserAccount;
import Business.HumanResources.personDirectory;
import Business.SystemAdministration.userAccountDirectory;
import Interface.LoginJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yiyangyang
 */
public class ManagePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePersonJPanel
     */
   private JPanel CardSequenceJPanel;
   private personDirectory pd;
   private userAccountDirectory uad;
   private UserAccount userAccount;
 

    

    ManagePersonJPanel(JPanel CardSequenceJPanel, personDirectory pd, userAccountDirectory uad, UserAccount userAccount) {
        initComponents();
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.pd = pd;      
        this.uad = uad;
        this.userAccount = userAccount;
        populateTable();    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        personTbl = new javax.swing.JTable();
        findPersonBtn = new javax.swing.JButton();
        newPersonBtn = new javax.swing.JButton();
        updatePersonBtn = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Person Directory");

        personTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "First Name", "Last Name", "User Name"
            }
        ));
        jScrollPane1.setViewportView(personTbl);

        findPersonBtn.setText("Find Person >>");
        findPersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findPersonBtnActionPerformed(evt);
            }
        });

        newPersonBtn.setText("New Person >>");
        newPersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPersonBtnActionPerformed(evt);
            }
        });

        updatePersonBtn.setText("Update Person>>");
        updatePersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePersonBtnActionPerformed(evt);
            }
        });

        btnBack2.setText("<< Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Name:");

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updatePersonBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(newPersonBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(findPersonBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(111, 111, 111))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteBtn)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnBack2)
                .addGap(2, 2, 2)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lastNameTxt)
                        .addComponent(jLabel3))
                    .addComponent(findPersonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newPersonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updatePersonBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void populateTable(){
        DefaultTableModel dtm=(DefaultTableModel)personTbl.getModel();
        dtm.setRowCount(0);

        for(Person p: pd.getPerson()){
           
                    Object[] row =new Object[4];
                    row[0]=p;
                    row[1]=p.getFirstName();
                    row[2]=p.getLastName();
                    if(getUsernameByUserAccount(p) == null){
                        row[3] = "No User Account";
                    }
                    else{
                        row[3] = getUsernameByUserAccount(p).getUserName();
                    }
                    
                    dtm.addRow(row);
        }
    }
    
    
    public UserAccount getUsernameByUserAccount(Person person){
        
        for(UserAccount ua : uad.getUserAccount()){
            if(ua.getPerson().equals(person)){
                return ua;
            }
            
        }
       return null;
    } 
    
    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void findPersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findPersonBtnActionPerformed
        // TODO add your handling code here:
        int size = pd.getPerson().size();
        int i = 0;
        if(lastNameTxt.getText().equals("")){
            JOptionPane.showMessageDialog(null,"please input the username you wanna search","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            for(Person person: pd.getPerson()){
                if(person.getLastName().equals(lastNameTxt.getText())){
                    updatePersonJPanel panel =new updatePersonJPanel(CardSequenceJPanel,person);
                    CardSequenceJPanel.add("FindUserAccountsJPanel",panel);
                    CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
                    layout.next(CardSequenceJPanel);
                }
                else{
                    i++;
                }
            }
            if(size == i){
                    JOptionPane.showMessageDialog(null,"No matches","Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_findPersonBtnActionPerformed

    private void newPersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPersonBtnActionPerformed
        // TODO add your handling code here:
                    NewPersonJPanel panel =new NewPersonJPanel(CardSequenceJPanel,pd);
                    CardSequenceJPanel.add("NewPersonJPanel",panel);
                    CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
                    layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_newPersonBtnActionPerformed

    private void updatePersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePersonBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow=personTbl.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from table first to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
                    Person p=(Person)personTbl.getValueAt(selectedRow, 0);
                    updatePersonJPanel panel =new updatePersonJPanel(CardSequenceJPanel,p);
                    CardSequenceJPanel.add("updatePersonJPanel",panel);
                    CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
                    layout.next(CardSequenceJPanel);
        }
    }//GEN-LAST:event_updatePersonBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow=personTbl.getSelectedRow();
        if(selectedRow>=0){
            int dialogButton=JOptionPane.YES_NO_OPTION;
            int dialogResult=JOptionPane.showConfirmDialog(null,"Would you like to delete the account details?","Warning",dialogButton);
            if(dialogResult==JOptionPane.YES_OPTION){
                Person person=(Person)personTbl.getValueAt(selectedRow, 0);
                pd.deletePerson(person);
                for(int i = (uad.getUserAccount().size() - 1); i >= 0; i--)
                {
                    if(uad.getUserAccount().get(i).getPerson() == person){
                        uad.deleteUserAccount(uad.getUserAccount().get(i));
                    }
                }
                populateTable();
                if(person == userAccount.getPerson()){
                    LoginJPanel panel =new LoginJPanel(CardSequenceJPanel,pd,uad);
                    CardSequenceJPanel.add("LoginJPanel",panel);
                    CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
                    layout.next(CardSequenceJPanel);
                }
                

            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton findPersonBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JButton newPersonBtn;
    private javax.swing.JTable personTbl;
    private javax.swing.JButton updatePersonBtn;
    // End of variables declaration//GEN-END:variables
}
