/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.HumanResources;

import java.util.ArrayList;

/**
 *
 * @author yiyangyang
 */
public class personDirectory {
    private ArrayList<Person> personDirectory;
    
    public ArrayList<Person> getPerson() {
        return personDirectory;
    }

    public void setPerson(ArrayList<Person> person) {
        this.personDirectory = person;
    }
    public personDirectory() {
		personDirectory = new ArrayList<Person>();

	}

	public Person addPerson() {
		Person p = new Person();
		personDirectory.add(p);
		return p;
	}

	public void deletePerson(Person p) {
		personDirectory.remove(p);
	}
        public Person findPersonByLastName(String lastName){
            for(Person person:personDirectory)
                if(person.getLastName().equals(lastName)){
                    return person;
                }
            return null;
        }
}
