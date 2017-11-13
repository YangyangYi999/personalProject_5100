/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Clinic.Clinic;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.InventoryRole.InventoryWorkAreaJPanel;

/**
 *
 * @author yiyangyang
 */
public class InventoryRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,Clinic clinic) {
        return new InventoryWorkAreaJPanel(userProcessContainer,(InventoryOrganization)organization,enterprise,system);
    }

    
    
}
