/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.HumanResources.personDirectory;
import Business.SystemAdministration.userAccountDirectory;

/**
 *
 * @author yiyangyang
 */
public class business {
    private String name;
//    private String password = "admin";
    private personDirectory persondirectory; 
    private userAccountDirectory useraccountdirectory;

    public business(String n) {
        name = n; //the this operator means this business object.
        persondirectory = new personDirectory () ;
        useraccountdirectory = new userAccountDirectory(); 
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public personDirectory getPersondirectory() {
        return persondirectory;
    }

    public void setPersondirectory(personDirectory persondirectory) {
        this.persondirectory = persondirectory;
    }

    public userAccountDirectory getUseraccountdirectory() {
        return useraccountdirectory;
    }

    public void setUseraccountdirectory(userAccountDirectory useraccountdirectory) {
        this.useraccountdirectory = useraccountdirectory;
    }
    
    
    
    public business(String name, String password){
        persondirectory = new personDirectory();
        useraccountdirectory = new userAccountDirectory();
    }
}
