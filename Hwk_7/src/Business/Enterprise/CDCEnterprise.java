/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.CDCRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author yiyangyang
 */
public class CDCEnterprise extends Enterprise{

     public CDCEnterprise(String name){
         super(name,EnterpriseType.CDC);
         this.getOrganizationDirectory().createOrganization(Type.Inventory, "CDC Inventory");
     }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CDCRole());
        return roles;
    }
    
}
