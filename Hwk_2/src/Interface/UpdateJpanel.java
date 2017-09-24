/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airplane;
import Business.AirplaneHistory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yiyangyang
 */
public class UpdateJpanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJpanel
     */
    ButtonGroup group = new ButtonGroup();
    ButtonGroup group1 = new ButtonGroup();
    private AirplaneHistory ah;
    

    UpdateJpanel(AirplaneHistory ah) {
        initComponents();
        this.ah = ah;
        populateTable();
        group.add(AvailableRadioButton);
        group.add(NAvailableRadioButton);
        group1.add(ExpiredRadioButton);
        group1.add(NExpiredRadioButton);
    

    
//        String csvFile = "/Users/yiyangyang/Desktop/CS/hw2.csv";
//        String line = "";
//        String cvsSplitBy = ",";
//        
//        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//            
//            while ((line = br.readLine()) != null) {
//                // use comma as separator
//                String[] airplane = line.split(cvsSplitBy);
//                        Airplane v = ah.addAirplane();
//                        v.setYear(Integer.parseInt(airplane[0]));
//                        v.setStatus(airplane[1]);
//                        v.setSerialNum(Integer.parseInt(airplane[2]));
//                        v.setSeats(Integer.parseInt(airplane[3]));
//                        v.setModelNum(Integer.parseInt(airplane[4]));
//                        v.setManufacturer(airplane[5]);
//                        v.setCertificate(airplane[6]);
//                        v.setAirport(airplane[7]);
//                        v.setAirLiner(airplane[8]);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
    
      public void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)airplaneTable.getModel();
        dtm.setRowCount(0); 
        for(Airplane vs: ah.getAirplaneHistory())
        {
            
            Object row[] = new Object[2];
            
            row[0] = vs;
            row[1] = vs.getModelNum();
           
            dtm.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        airplaneTable = new javax.swing.JTable();
        viewBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        airportTxt = new javax.swing.JTextField();
        ExpiredRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NExpiredRadioButton = new javax.swing.JRadioButton();
        serialNumTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        AvailableRadioButton = new javax.swing.JRadioButton();
        seatsNumTxt = new javax.swing.JTextField();
        NAvailableRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        yearTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        manuTxt = new javax.swing.JTextField();
        modelNumTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        airlinerstartTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        airlinerendTxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        airplaneTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manufacturer", "Model Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(airplaneTable);
        if (airplaneTable.getColumnModel().getColumnCount() > 0) {
            airplaneTable.getColumnModel().getColumn(0).setResizable(false);
            airplaneTable.getColumnModel().getColumn(1).setResizable(false);
        }

        viewBtn.setText("View details");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel10.setText(" Maintenance Certificate Status:");

        ExpiredRadioButton.setText("Expired");

        jLabel5.setText("Serial Number:");

        jLabel8.setText("Airport:");

        NExpiredRadioButton.setText("Not Expired");

        jLabel6.setText("Number of Seats:");

        jLabel2.setText("Status:");

        AvailableRadioButton.setText("Available");

        NAvailableRadioButton.setText("Not available");

        jLabel3.setText(" Manufactured Year :");

        jLabel7.setText("Manufacturer:");

        jLabel4.setText("Model Number:");

        jLabel11.setText("From");

        jLabel12.setText("to");

        jLabel13.setText("Airliner:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(updateBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(airlinerstartTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(airlinerendTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
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
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18)
                                                .addComponent(seatsNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                            .addComponent(airportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel13))
                                .addGap(42, 42, 42)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBtn)
                    .addComponent(deleteBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AvailableRadioButton)
                    .addComponent(NAvailableRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(modelNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(serialNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(seatsNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(manuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(airportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(airlinerstartTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(airlinerendTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ExpiredRadioButton)
                    .addComponent(NExpiredRadioButton))
                .addGap(22, 22, 22)
                .addComponent(updateBtn)
                .addGap(14, 14, 14))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = airplaneTable.getSelectedRow();
        
        if (selectedRow >= 0){
            Airplane vs = (Airplane) airplaneTable.getValueAt(selectedRow,0);
            
            yearTxt.setText(String.valueOf(vs.getYear()));
            modelNumTxt.setText(String.valueOf(vs.getModelNum()));
            serialNumTxt.setText(String.valueOf(vs.getSerialNum()));
            manuTxt.setText(String.valueOf(vs.getManufacturer()));
            seatsNumTxt.setText(String.valueOf(vs.getSeats()));
            airportTxt.setText(String.valueOf(vs.getAirport()));
            airlinerstartTxt.setText(String.valueOf(vs.getAirLinerstart()));
            airlinerendTxt.setText(String.valueOf(vs.getAirLinerend()));
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
            
    }//GEN-LAST:event_viewBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = airplaneTable.getSelectedRow();
        
        if (selectedRow >= 0){
        Airplane vs = (Airplane)airplaneTable.getValueAt(selectedRow,0);
        ah.deleteAirplane(vs);
        JOptionPane.showMessageDialog(null,"Airplane has been deleted");
        }
        else JOptionPane.showMessageDialog(null,"please select any row");
        populateTable();                                         
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = airplaneTable.getSelectedRow();
        
      if (selectedRow >= 0){
           Airplane vs = (Airplane) airplaneTable.getValueAt(selectedRow,0);
            
            int modelNum = Integer.parseInt(modelNumTxt.getText());
            int serialNum = Integer.parseInt(serialNumTxt.getText());
            int year = Integer.parseInt(yearTxt.getText());
            int seatsNum = Integer.parseInt(seatsNumTxt.getText());
            String manufacturer = manuTxt.getText();
            String airport = airportTxt.getText();
            String airlinerstart = airlinerstartTxt.getText();
            String airlinerend = airlinerendTxt.getText();
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
                vs.setAirLinerstart(airlinerstart);
                vs.setAirLinerend(airlinerend);
                vs.setManufacturer(manufacturer);
                vs.setSeats(seatsNum);
                vs.setYear(year);
                JOptionPane.showMessageDialog(null,"Airplane updated successfully");
                populateTable(); 
                long currentTime = System.currentTimeMillis();
                Date date = new Date(currentTime);
                ah.setDate(date);
                 
      }
        else{
                JOptionPane.showMessageDialog(null,"Airplane updated failed, Please select any row");
            }
         
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AvailableRadioButton;
    private javax.swing.JRadioButton ExpiredRadioButton;
    private javax.swing.JRadioButton NAvailableRadioButton;
    private javax.swing.JRadioButton NExpiredRadioButton;
    private javax.swing.JTextField airlinerendTxt;
    private javax.swing.JTextField airlinerstartTxt;
    private javax.swing.JTable airplaneTable;
    private javax.swing.JTextField airportTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField manuTxt;
    private javax.swing.JTextField modelNumTxt;
    private javax.swing.JTextField seatsNumTxt;
    private javax.swing.JTextField serialNumTxt;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    private javax.swing.JTextField yearTxt;
    // End of variables declaration//GEN-END:variables
}
