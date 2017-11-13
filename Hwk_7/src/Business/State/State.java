/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.State;

import Business.Enterprise.EnterpriseDirectory;

/**
 *
 * @author yiyangyang
 */
public class State {
        private int id;
        private String name;
        private static int count = 1;
        private EnterpriseDirectory enterpriseDirectory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        public State() {
        id = count;
        count++;
        enterpriseDirectory = new EnterpriseDirectory();
    }
        @Override
    public String toString(){
        return name; 
    }
}
