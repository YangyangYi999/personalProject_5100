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
public class DiseaseCatalog {
    private ArrayList<Disease> diseaseList;

    public ArrayList<Disease> getDiseaseList() {
        return diseaseList;
    }

    public void setDiseaseList(ArrayList<Disease> diseaseList) {
        this.diseaseList = diseaseList;
    }

    public DiseaseCatalog() {
        diseaseList = new ArrayList();
    }

   

    public Disease createAndAddDisease(String name) {
        
        Disease disease = new Disease();
        disease.setName(name);
        diseaseList.add(disease);
        return disease;
    }
}
