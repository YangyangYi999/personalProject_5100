/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Person.PersonDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.Vaccine;
import Business.VaccineCatalog;
import Business.WorkArea.WorkAreaDirectory;
import java.util.ArrayList;

/**
 *
 * @author yiyangyang
 */
public abstract class Organization {
    private String name;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private WorkAreaDirectory workAreaDirectory;
    private int organizationID;
    private static int counter;
    private VaccineCatalog vaccineList;
    
    public VaccineCatalog getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(VaccineCatalog vaccineList) {
        this.vaccineList = vaccineList;
    }

    
    
    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public WorkAreaDirectory getWorkAreaDirectory() {
        return workAreaDirectory;
    }

    public void setWorkAreaDirectory(WorkAreaDirectory workAreaDirectory) {
        this.workAreaDirectory = workAreaDirectory;
    }
    
    public enum Type{
        Inventory("Inventory Organization") {
//            //@Override
//            public Organization createOrganization() {
//                return new AdminOrganization();
//            }
        },
        Provider("Provider Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
//        public Organization createOrganization(Type t) {
//            return t.createOrganization();
//        }
    }

    public Organization(String name) {
        this.name = name;
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        vaccineList = new VaccineCatalog();
        organizationID = counter;
        ++counter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PersonDirectory getEmployeeDirectory() {
        return personDirectory;
    }
    
    public String getName() {
        return name;
    }

    

    public void setName(String name) {
        this.name = name;
    }

  

    @Override
    public String toString() {
        return name;
    }
    
    
}
