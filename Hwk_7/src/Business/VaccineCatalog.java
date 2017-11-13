/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author yiyangyang
 */
public class VaccineCatalog {
     private ArrayList<Vaccine> vaccineList;

   

    public VaccineCatalog() {
        vaccineList = new ArrayList();
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }

   

    public Vaccine createAndAddVaccine(String name,int number) {
        
        Vaccine vaccine = new Vaccine();
        vaccine.setName(name);
        vaccine.setNumber(number);
        vaccineList.add(vaccine);
        return vaccine;
    }
}
