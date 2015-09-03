package driver;

import java.util.Hashtable;

public class Customer{
	
	// make customer have an id and store them by id not the first name
	
	// This hashtable will store the customer objects
	Hashtable<Integer, Customer> customersTable = new Hashtable<Integer, Customer>();

	// These are the values for the hotel
	public static int normal_room = 100;
	static int nice_suites = 10;
	static int parking_space = 500;

	// The below are the attributes of a Customer Object
	private final int ID;
	private final String first_name, last_name, roomType;
	private final int num_people, time_of_stay;
	private int roomNumber;
	private int totalCost;
	private boolean customer_parking, amenities;
	
	// Customer constructor
	private Customer(CustomerBuilder builder){
		ID = builder.ID;
		first_name = builder.first_name;
		last_name = builder.last_name;
		roomType = builder.roomType;
		num_people = builder.num_people;
		time_of_stay = builder.time_of_stay;	
		customer_parking = builder.customer_parking;
		totalCost = builder.totalCost;
		amenities = builder.amenities;
	}
	
	
	// Create getter and setter for all

	
	// Adds a customer from the customersTable
	public void addCustomer(int id, Customer person){
		customersTable.put(id, person);
	}
	// Removes a customer from the customersTable
	public void removeCustomer(int firstName, Customer person){
		this.customersTable.remove(firstName);
	}
	
	public int getID(){
		return this.ID;
	}
	
	// Returns the first name of the customer
	public String firstName(){
		return this.first_name;
	}

	// Returns the last name of the customer
	public String lastName(int firstName){
		return customersTable.get(firstName).last_name;
	}
	
	// Returns the room type of the customer
	public String getRoomType(int firstName){
		return customersTable.get(firstName).roomType;
	}
	
	// Returns the number of people staying with that customer including him/her
	public int numberPeople(int firstName){
		return customersTable.get(firstName).num_people;
	}
	
	// Returns the time of stay of the customer
	public int timeOfStay(int firstName){
		return customersTable.get(firstName).time_of_stay;
	}
	
	// Returns the parking slot of the customer
	public boolean getParking(int firstName){
		return customersTable.get(firstName).customer_parking;
	}
	
	// Returns the total cost of stay for the customer
	public int getCost(int firstName){
		return customersTable.get(firstName).totalCost;
	}
	
	 
	public Boolean getAmenities(int firstName){
		return customersTable.get(firstName).amenities;

	}
	
	
	
	
		
		// This is the builder class for Customer Class
		public static class CustomerBuilder{
			
			// The required attributes
			private final int ID;
			private final String first_name, last_name, roomType;
			private final int num_people, time_of_stay;
			
			// The optional attributes
			private boolean customer_parking = false;
			private int totalCost;
			private boolean amenities = false;


			// The CustomerBuilder class constructor
			public CustomerBuilder(int ID, String first_name, String last_name, String roomType, int num_people, int time_of_stay){
				this.ID = ID;
				this.first_name = first_name;
				this.last_name = last_name;
				this.roomType = roomType;
				this.num_people = num_people;
				this.time_of_stay = time_of_stay;	
				this.totalCost = time_of_stay * 150;
			}
			
			// This sets the parking slot of the customer
			public CustomerBuilder customerParking(boolean val){
				customer_parking = val;
				return this;
			}
			
			// This sets the amenities value for the customer which is a Boolean
			public CustomerBuilder setAmenities(Boolean val){
				amenities = val;
				if(amenities == true){
					setCost();
				}
				return this;
			}
			
			// This sets the cost of the stay for the customer only if they have amenities
			public CustomerBuilder setCost(){
				totalCost = totalCost + 100;
				return this;
			}
			
			// This method calls the Customer constructor
			public Customer build(){
				return new Customer(this);
			}
		}
}