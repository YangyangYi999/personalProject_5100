/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author yiyangyang
 */
public class AirplaneHistory {
    private ArrayList <Airplane> AirplaneHistory;
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    public AirplaneHistory(){
        AirplaneHistory = new ArrayList <Airplane>();
    }

    public ArrayList<Airplane> getAirplaneHistory() {
        return AirplaneHistory;
    }

    public void setAirplaneHistory(ArrayList<Airplane> AirplaneHistory) {
        this.AirplaneHistory = AirplaneHistory;
    }
    
    public Airplane addAirplane(){
        Airplane vs = new Airplane();
        AirplaneHistory.add(vs);
        return vs;
    }

 
    public void deleteAirplane(Airplane v){
        AirplaneHistory.remove(v);  
    }
    
}
