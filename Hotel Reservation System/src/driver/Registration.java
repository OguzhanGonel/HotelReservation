package driver;

import java.util.Hashtable;

public class Registration {
	// Make this class an abstract
	
	// This hashtable will store the customer objects
	Hashtable<String, Registration> customersTable = new Hashtable<String, Registration>();
	
	// The below strings are the attributes of a Registration Object
	String ID, first_name, last_name, roomType;
	String num_people, time_of_stay;
	String customer_parking;
	
	static int normal_room = 100;
	static int nice_suites = 10;
	static int parking_space = 500;
	
	Registration(String ID){
		this.ID = ID;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}