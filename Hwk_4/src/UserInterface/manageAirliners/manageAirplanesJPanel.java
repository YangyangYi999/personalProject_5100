/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.manageAirliners;

import Business.Airliner;
import Business.Airplane;
import Business.Fleet;
import static UserInterface.manageCustomer.bookFlights.isInt;
import java.awt.CardLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author yiyangyang
 */
public class manageAirplanesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form manageAirplanesJPanel
     */
 private JPanel CardSequenceJPanel;

 private Airliner airliner;
 ButtonGroup group = new ButtonGroup();
 ButtonGroup group1 = new ButtonGroup();
 private Airplane vs;
 private Fleet fleet;
 
  


    manageAirplanesJPanel(JPanel CardSequenceJPanel, Airliner airliner, Fleet fleet) {
        initComponents();   
        this.CardSequenceJPanel = CardSequenceJPanel;
        this.airliner = airliner;
        this.fleet = fleet;
        group.add(AvailableRadioButton);
        group.add(NAvailableRadioButton);
        group1.add(ExpiredRadioButton);
        group1.add(NExpiredRadioButton);  
        populateAirplaneTable();
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
        btnBack = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        viewAirplaneBtn = new javax.swing.JButton();
        newAirplaneBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAirplane = new javax.swing.JTable();
        yearTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AvailableRadioButton = new javax.swing.JRadioButton();
        NAvailableRadioButton = new javax.swing.JRadioButton();
        modelNumTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        serialNumTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        manuTxt = new javax.swing.JTextField();
        airportTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NExpiredRadioButton = new javax.swing.JRadioButton();
        ExpiredRadioButton = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Manage Airplanes");

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        viewAirplaneBtn.setText("View Airplane details");
        viewAirplaneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirplaneBtnActionPerformed(evt);
            }
        });

        newAirplaneBtn.setText("New Airplane >>");
        newAirplaneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAirplaneBtnActionPerformed(evt);
            }
        });

        tblAirplane.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial Number", "Model Number", "Year", "manufacturer"
            }
        ));
        jScrollPane1.setViewportView(tblAirplane);

        yearTxt.setEnabled(false);

        jLabel3.setText(" Manufactured Year :");

        jLabel2.setText("Status:");

        AvailableRadioButton.setText("Available");

        NAvailableRadioButton.setText("Not available");

        modelNumTxt.setEnabled(false);

        jLabel4.setText("Model Number:");

        jLabel5.setText("Serial Number:");

        serialNumTxt.setEnabled(false);

        jLabel7.setText("Manufacturer:");

        manuTxt.setEnabled(false);

        airportTxt.setEnabled(false);

        jLabel8.setText("Airport:");

        NExpiredRadioButton.setText("Not Expired");

        ExpiredRadioButton.setText("Expired");

        jLabel10.setText(" Maintenance Certificate Status:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnBack)
                .addGap(143, 143, 143)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 188, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExpiredRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NExpiredRadioButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(yearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(manuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel4)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(modelNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(AvailableRadioButton)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(NAvailableRadioButton))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(serialNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(airportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(66, 66, 66)))
                        .addGap(158, 158, 158))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deleteBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 401, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewAirplaneBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(newAirplaneBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewAirplaneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newAirplaneBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AvailableRadioButton)
                    .addComponent(NAvailableRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(modelNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(serialNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(manuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(airportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ExpiredRadioButton)
                    .addComponent(NExpiredRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
    }// </editor-fold>//GEN-END:initComponents
    
     public void populateAirplaneTable(){
        DefaultTableModel dtm=(DefaultTableModel)tblAirplane.getModel();
        dtm.setRowCount(0);
        for(Airplane airplane:airliner.getFleet().getFleet() ){
            Object[] row =new Object[4];
            row[0]=airplane;
            row[1]=airplane.getModelNum();
            row[2]=airplane.getYear();
            row[3]=airplane.getManufacturer();
            dtm.addRow(row);
            }
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardSequenceJPanel.remove(this);
        CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
        layout.previous(CardSequenceJPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handlinig code here:
        int selectedRow = tblAirplane.getSelectedRow();
        if(selectedRow>=0){
            int dialogButton=JOptionPane.YES_NO_OPTION;
            int dialogResult=JOptionPane.showConfirmDialog(null,"Would you like to delete the account details?","Warning",dialogButton);
            if(dialogResult==JOptionPane.YES_OPTION){
                Airplane airplane=(Airplane)tblAirplane.getValueAt(selectedRow, 0);
                airliner.getFleet().deleteAirplane(airplane);
                populateAirplaneTable();

            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void newAirplaneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAirplaneBtnActionPerformed
        
        // TODO add your handling code here:
        newAirplaneJPanel panel=new newAirplaneJPanel(CardSequenceJPanel,airliner);
        CardSequenceJPanel.add("newAirplaneJPanel",panel);
        CardLayout layout=(CardLayout)CardSequenceJPanel.getLayout();
        layout.next(CardSequenceJPanel);
    }//GEN-LAST:event_newAirplaneBtnActionPerformed

    private void viewAirplaneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirplaneBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAirplane.getSelectedRow();
        
        if (selectedRow >= 0){
             vs = (Airplane) tblAirplane.getValueAt(selectedRow,0);
            
            yearTxt.setText(String.valueOf(vs.getYear()));
            modelNumTxt.setText(String.valueOf(vs.getModelNum()));
            serialNumTxt.setText(String.valueOf(vs.getSerialNum()));
            manuTxt.setText(String.valueOf(vs.getManufacturer()));
           
            airportTxt.setText(String.valueOf(vs.getAirport()));
            
            
            if("Available".equals(String.valueOf(vs.getStatus()))){
                AvailableRadioButton.setSelected(true);
            }
            else {
                NAvailableRadioButton.setSelected(true);
            }
            
            if("Expired".equals(String.valueOf(vs.getCertificate()))){
                ExpiredRadioButton.setSelected(true);
            }
            else {
                NExpiredRadioButton.setSelected(true);
            }
        }
        else JOptionPane.showMessageDialog(null,"please select any row");
    }//GEN-LAST:event_viewAirplaneBtnActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        modelNumTxt.setEnabled(true);
        serialNumTxt.setEnabled(true);
        yearTxt.setEnabled(true);
        
        manuTxt.setEnabled(true);
        airportTxt.setEnabled(true);
        
        
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
        populateAirplaneTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
    if("".equals(modelNumTxt.getText())||"".equals(serialNumTxt.getText())||"".equals(yearTxt.getText())||"".equals(manuTxt.getText())||"".equals(airportTxt.getText())){
         JOptionPane.showMessageDialog(null,"Please fill all fields!");
    }
    else{
        if(isInt(modelNumTxt.getText())&&isInt(serialNumTxt.getText())&&isInt(yearTxt.getText())){
            int modelNum = Integer.parseInt(modelNumTxt.getText());
            int serialNum = Integer.parseInt(serialNumTxt.getText());
            int year = Integer.parseInt(yearTxt.getText());
            String manufacturer = manuTxt.getText();
            String airport = airportTxt.getText();
            
            
            String status = "";
            String certificate = "";
            Boolean isClick = true;
            if (AvailableRadioButton.isSelected() == isClick)
            {
               status = AvailableRadioButton.getText();
            }
            else if(NAvailableRadioButton.isSelected()== isClick)
            {
               status = NAvailableRadioButton.getText();
            }


            if (ExpiredRadioButton.isSelected() == isClick)
            {
               certificate = ExpiredRadioButton.getText();
            }
            else if(NAvailableRadioButton.isSelected()== isClick)
            {
               certificate = NExpiredRadioButton.getText();
            }
                
                vs.setStatus(status);
                vs.setCertificate(certificate);
                vs.setModelNum(modelNum);
                vs.setSerialNum(serialNum);
                vs.setAirport(airport);
                vs.setAirLinerstart(airliner.getNameOfcompany());
                vs.setManufacturer(manufacturer);
                vs.setSeats(150);
                vs.setYear(year);
                
                
                JOptionPane.showMessageDialog(null,"Airplane updated successfully");
                populateAirplaneTable(); 
                
                 
      }
        else{JOptionPane.showMessageDialog(null,"Please input only numbers in field of Year, Serial Number, Model Number and Number of seats.");}
      
        
         
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AvailableRadioButton;
    private javax.swing.JRadioButton ExpiredRadioButton;
    private javax.swing.JRadioButton NAvailableRadioButton;
    private javax.swing.JRadioButton NExpiredRadioButton;
    private javax.swing.JTextField airportTxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField manuTxt;
    private javax.swing.JTextField modelNumTxt;
    private javax.swing.JButton newAirplaneBtn;
    private javax.swing.JTextField serialNumTxt;
    private javax.swing.JTable tblAirplane;
    private javax.swing.JButton viewAirplaneBtn;
    private javax.swing.JTextField yearTxt;
    // End of variables declaration//GEN-END:variables
}
