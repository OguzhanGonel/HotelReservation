package driver;

public class Customer extends Registration{
	

	// Create getter and setter for all

	
	// Customer constructor
	public Customer(String ID, String first_name, String last_name, String roomType, String num_people, String time_of_stay, String customer_parking){
		super(ID);
		normal_room = normal_room - 1;
		this.first_name = first_name;
		this.last_name = last_name; 
		this.roomType = roomType;
		this.num_people = num_people;
		this.time_of_stay = time_of_stay;
		this.customer_parking = customer_parking;
	}
	
	// Adds customers to the customersTable
		public void addCustomer(String firstName, Registration person){
			customersTable.put(firstName, person);
		}
		// Removes customers from the customersTable
		public void removeCustomer(String firstName, Registration person){
			this.customersTable.remove(firstName);
		}
		
		public String getID(){
			return this.ID;
		}
		
		// Returns the first name of the customer
		public String firstName(){
			return this.first_name;
		}

		// Returns the last name of the customer
		public String lastName(String firstName){
			return customersTable.get(firstName).last_name;
		}
		
		// Returns the room type of the customer
		public String getRoomType(String firstName){
			return customersTable.get(firstName).roomType;
		}
		
		// Returns the number of people staying with that customer including him/her
		public String numberPeople(String firstName){
			return customersTable.get(firstName).num_people;
		}
		
		// Returns the time of stay of the customer
		public String timeOfStay(String firstName){
			return customersTable.get(firstName).time_of_stay;
		}
		

}