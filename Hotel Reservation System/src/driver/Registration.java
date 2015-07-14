package driver;

import java.util.Hashtable;

public class Registration {
	
	Hashtable<String, Registration> customersArray = new Hashtable<String, Registration>();
	
	String first_name, last_name, roomType;
	String num_people, time_of_stay;
	String customer_parking;
	
	static int normal_room = 100;
	static int nice_suites = 10;
	static int parking_space = 500;
	
	Registration(String first_name, String last_name, String roomType, String num_people, String time_of_stay, String customer_parking){
		this.first_name = first_name;
		this.last_name = last_name;
		this.roomType = roomType;
		this.num_people = num_people;
		this.time_of_stay = time_of_stay;
		this.customer_parking = customer_parking;
	}
	
	public void addCustomer(String firstName, Registration person){
		this.customersArray.put(firstName, person);
	}
	
	public void removeCustomer(String firstName, Registration person){
		this.customersArray.remove(firstName);
	}
	
	public String firstName(){
		return this.first_name;
	}

	
	public String lastName(String firstName){
		return customersArray.get(firstName).last_name;
	}
	
}