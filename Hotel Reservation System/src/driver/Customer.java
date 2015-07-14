package driver;

public abstract class Customer {
	
	// store the below 3 in hashtable, then in setRoom function, put the id there.
	
	static int normal_room = 100;
	static int nice_suites = 10;
	static int parking_space = 500;
	
	int room_number, parking_slot, customerID;
	
	
	// Customer constructor
	public Customer(int room_number, int parking_slot, int customerID){
		
		this.room_number = room_number;
		this.parking_slot = parking_slot;
		this.customerID = customerID;
		
		
		
	}
	
	
	public void setRoom(int room_number){
		
	}

}