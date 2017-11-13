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
import userinterface.ClinicRole.ClinicAdminWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class ClinicRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,Clinic clinic) {
        return new ClinicAdminWorkAreaJPanel(userProcessContainer, account,clinic,organization );
    }

    
    
}
