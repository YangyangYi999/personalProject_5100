/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author yiyangyang
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> EnterpriseList) {
        this.enterpriseList = EnterpriseList;
    }
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList();
    }
    
    //create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type== Enterprise.EnterpriseType.CDC){
            enterprise= new CDCEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type== Enterprise.EnterpriseType.Distributor){
            enterprise= new DistributorEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        if(type== Enterprise.EnterpriseType.Supplier){
            enterprise= new SupplierEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
}
