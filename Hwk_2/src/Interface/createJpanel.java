/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airplane;
import Business.AirplaneHistory;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author yiyangyang
 */
public class createJpanel extends javax.swing.JPanel {

    /**
     * Creates new form createJpanel
     */
    ButtonGroup group = new ButtonGroup();
    ButtonGroup group1 = new ButtonGroup();
    private AirplaneHistory ah;
    createJpanel(AirplaneHistory ah) {
        initComponents();
        this.ah = ah;
        group.add(AvailableRadioButton);
        group.add(NAvailableRadioButton);
        AvailableRadioButton.setSelected(true);
        group1.add(ExpiredRadioButton);
        group1.add(NExpiredRadioButton);
        ExpiredRadioButton.setSelected(true);
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
        jLabel2 = new javax.swing.JLabel();
        AvailableRadioButton = new javax.swing.JRadioButton();
        NAvailableRadioButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        yearTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        modelNumTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        serialNumTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        seatsNumTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        manuTxt = new javax.swing.JTextField();
        airportTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        airlinerstartTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ExpiredRadioButton = new javax.swing.JRadioButton();
        NExpiredRadioButton = new javax.swing.JRadioButton();
        createBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        airlinerendTxt = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Create new Airplane ");

        jLabel2.setText("Status:");

        AvailableRadioButton.setText("Available");

        NAvailableRadioButton.setText("Not available");

        jLabel3.setText(" Manufactured Year :");

        jLabel4.setText("Model Number:");

        jLabel5.setText("Serial Number:");

        jLabel6.setText("Number of Seats:");

        jLabel7.setText("Manufacturer:");

        jLabel8.setText("Airport:");

        jLabel9.setText("Airliner:");

        jLabel10.setText(" Maintenance Certificate Status:");

        ExpiredRadioButton.setText("Expired");

        NExpiredRadioButton.setText("Not Expired");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        jLabel11.setText("From");

        jLabel12.setText("to");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(manuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(airportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(airlinerstartTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(airlinerendTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ExpiredRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NExpiredRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(createBtn)))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
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
                    .addComponent(jLabel9)
                    .addComponent(airlinerstartTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(airlinerendTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ExpiredRadioButton)
                    .addComponent(NExpiredRadioButton))
                .addGap(29, 29, 29)
                .addComponent(createBtn)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
 public static boolean isInt(String s){
        for(int i = 0; i < s.length(); i++){
            if(!Character.isDigit(s.charAt(i))){
                 return false;
            }
        }
        return true;
    }                           

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        if(isInt(modelNumTxt.getText())&&isInt(serialNumTxt.getText())&&isInt(yearTxt.getText())&&isInt(seatsNumTxt.getText())){
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
        
        Airplane v = ah.addAirplane();
        v.setStatus(status);
        v.setCertificate(certificate);
        v.setModelNum(modelNum);
        v.setSerialNum(serialNum);
        v.setAirport(airport);
        v.setAirLinerstart(airlinerstart);
        v.setAirLinerend(airlinerend);
        v.setManufacturer(manufacturer);
        v.setSeats(seatsNum);
        v.setYear(year);
        JOptionPane.showMessageDialog(null,"Airplane added successfully");
        long currentTime = System.currentTimeMillis();
        Date date = new Date(currentTime);
        ah.setDate(date);
        
        modelNumTxt.setText("");
        serialNumTxt.setText("");
        seatsNumTxt.setText("");
        airportTxt.setText("");
        airlinerstartTxt.setText("");
        airlinerendTxt.setText("");
        manuTxt.setText("");
        yearTxt.setText("");
        AvailableRadioButton.setSelected(true);
        ExpiredRadioButton.setSelected(true);}
        
        else{JOptionPane.showMessageDialog(null,"Please input only numbers in field of Year, Serial Number, Model Number and Number of seats.");}
    }//GEN-LAST:event_createBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AvailableRadioButton;
    private javax.swing.JRadioButton ExpiredRadioButton;
    private javax.swing.JRadioButton NAvailableRadioButton;
    private javax.swing.JRadioButton NExpiredRadioButton;
    private javax.swing.JTextField airlinerendTxt;
    private javax.swing.JTextField airlinerstartTxt;
    private javax.swing.JTextField airportTxt;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField manuTxt;
    private javax.swing.JTextField modelNumTxt;
    private javax.swing.JTextField seatsNumTxt;
    private javax.swing.JTextField serialNumTxt;
    private javax.swing.JTextField yearTxt;
    // End of variables declaration//GEN-END:variables
}
