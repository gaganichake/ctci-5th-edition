package org.ctci.chapter10.Question10_2;

import java.util.HashMap;

public class Machine {
	public HashMap<Integer, Person> persons = new HashMap<>();
	public int machineID;
	
	public Person getPersonWithID(int personID) {
		return persons.get(personID);
	}	
}
