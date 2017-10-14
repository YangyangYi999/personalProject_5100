/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BusinessConfiguration;

import Business.HumanResources.Person;
import Business.HumanResources.personDirectory;
import Business.SystemAdministration.UserAccount;
import Business.SystemAdministration.userAccountDirectory;
import Business.business;

/**
 *
 * @author yiyangyang
 */
public class ConfigureABusiness {
    
    public static business Initialize (String n) { // returns a business object
        business b = new business(n);
        personDirectory pd = b.getPersondirectory();
        Person p = pd.addPerson(); //create person object
        p.setFirstName("Ann");
        p.setLastName("Wells");

        p = pd.addPerson(); // create a second person object
        p.setFirstName("John");
        p.setLastName("Brown");

        userAccountDirectory uad= b.getUseraccountdirectory(); // prepare to
        
        Person p2 = pd.findPersonByLastName("Brown");
        if (p2!=null){
            UserAccount ua = uad.addUserAccount();
            ua.setPerson(p2); //link user account to the Mr. Brown
            ua.setUserName("jadam");
            ua.setPassword("pw"); 
            ua.setRole("Admin");
            ua.setStatus("Active");
            
        }
        return b;
    }
}
