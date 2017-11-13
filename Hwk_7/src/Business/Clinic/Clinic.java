/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Clinic;
import Business.Organization.Organization;
import Business.Role.ClinicRole;
import Business.Role.Role;
import Business.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author yiyangyang
 */
public class Clinic extends Organization {
    
    private ClinicType clinicType;
    private ClinicType type;
   
    public Clinic(String name, ClinicType type){
        super(name);
        
        this.type = type;
        
        
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ClinicRole());
        return roles;
    }
    public enum ClinicType{
        Clinic("Clinic");
        private ClinicType(String value){
            this.value = value;
        }
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        
        @Override
        public String toString(){
            return value;
        }

    } 

    public ClinicType getClinicType() {
        return clinicType;
    }

    public void setClinicType(ClinicType clinicType) {
        this.clinicType = clinicType;
    }
    
   
}
