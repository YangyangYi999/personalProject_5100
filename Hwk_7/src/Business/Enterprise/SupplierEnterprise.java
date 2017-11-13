/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.Role.SDRole;
import java.util.ArrayList;

/**
 *
 * @author yiyangyang
 */
public class SupplierEnterprise extends Enterprise{
    
     public SupplierEnterprise(String name){
         super(name,EnterpriseType.Supplier);
         this.getOrganizationDirectory().createOrganization(Type.Inventory, "Supplier Inventory");
     }
    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SDRole());
        return roles;
    }
    
}
