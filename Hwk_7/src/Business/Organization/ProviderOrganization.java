/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Clinic.Clinic;
import Business.Clinic.Clinic.ClinicType;
import Business.Role.ProviderRole;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author yiyangyang
 */
public class ProviderOrganization extends Organization {

    private ArrayList<Clinic> clinicList;    
    public ProviderOrganization() {
        super(Organization.Type.Provider.getValue());
        clinicList = new ArrayList<>();
    }
    
    public ArrayList<Clinic> getClinicList() {
        return clinicList;
    }

    public void setClinicList(ArrayList<Clinic> clinicList) {
        this.clinicList = clinicList;
    }
    public Clinic createclinic(ClinicType type, String name){
        Clinic clinic = null;
        if (type.getValue().equals(ClinicType.Clinic.getValue())){
            clinic = new Clinic(name,type);
            clinic.setName(name);
            clinicList.add(clinic);
        }
       
        return clinic;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProviderRole());
        return roles;
    }
    
}
