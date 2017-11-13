/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Clinic.Clinic;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author yiyangyang
 */
public abstract class Role {
    
    public enum RoleType{
        StateAdmin("StateAdmin"),
        Provider("Provider"),
        Supplier("Supplier"),
        Distributor("Distributor");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,Clinic clinic);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}