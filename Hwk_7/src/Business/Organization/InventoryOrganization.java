/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InventoryRole;
import Business.Role.Role;
import Business.Vaccine;
import java.util.ArrayList;


/**
 *
 * @author yiyangyang
 */
public class InventoryOrganization extends Organization {
    

    
    public InventoryOrganization() {
        super(Organization.Type.Inventory.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new InventoryRole());
        return roles;
    }
    
}
