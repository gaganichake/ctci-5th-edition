package org.ctci.chapter10.Question10_2;

import java.util.HashMap;

public class Server {
	HashMap<Integer, Machine> machines = new HashMap<>();
	HashMap<Integer, Integer> personToMachineMap = new HashMap<>();
	
	public Machine getMachineWithId(int machineID) {
		return machines.get(machineID);
	}
	
	public int getMachineIDForUser(int personID) {
		Integer machineID = personToMachineMap.get(personID);
		return machineID == null ? -1 : machineID;
	}
	
	public Person getPersonWithID(int personID) {
		Integer machineID = personToMachineMap.get(personID);
		if (machineID == null) {
			return null;
		}
		Machine machine = getMachineWithId(machineID);
		if (machine == null) {
			return null;
		}
		return machine.getPersonWithID(personID);
	}
}
