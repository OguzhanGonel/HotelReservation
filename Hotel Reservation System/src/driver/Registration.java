package driver;

import java.util.LinkedList;

public class Registration {
	
	
	// The linked list which contains all the customers
	LinkedList<Customer> customersLinkedList = new LinkedList<Customer>();
	
	
	
	String first_name, last_name, room_type;
	int num_people, time_of_stay;
	boolean customer_parking = false;
	
	
	
	public Registration(String first_name, String last_name, String num_people, String room_type, String time_of_stay, String customer_parking){
		
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.room_type = room_type;
		
		this.num_people = Integer.valueOf(num_people);
		this.time_of_stay = Integer.valueOf(time_of_stay);
		
		if(customer_parking.equals("yes")){
			this.customer_parking = true;
		}
	}
	
	
	// Adds an object to the LinkedList
	public void addObject(Customer object){
		this.customersLinkedList.add(object);
	}
		

	//Removes an object from the LinkedList
	public void removeObject(Customer object){
		this.customersLinkedList.remove(object);
	}
	
	
}
