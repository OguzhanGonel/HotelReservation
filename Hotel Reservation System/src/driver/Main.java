package driver;

import java.util.Scanner;



public class Main {
	
	
	public static void main(String args[]){
		
		
		
		
		
		
		/*Customer Regist = new Customer.CustomerBuilder("55", "m", "m", "m", 4, 4).build();
		
		Customer person1 = new Customer.CustomerBuilder("66", "Mike", "Smith", "nice room", 3, 5).build();
		Customer person2 = new Customer.CustomerBuilder("44", "UEONO", "whooo", "what", 13, 2).setAmenities(true).build();

		
		Regist.addCustomer("66", person1);
	
		Regist.addCustomer(person2.getID(), person2);

		
		System.out.println(Regist.getRoomType(person1.getID()));

		System.out.println(Regist.getCost(person2.getID()));
		
		System.out.println(Customer.normal_room);*/
		
		
		
		
			
		
			
			System.out.println("Hi, please choose one of the following options: ");
			System.out.println("1: New Customer Registration");
			System.out.println("2: Lost Keys");
			
			
			
			Scanner user_input = new Scanner(System.in);
			
			
				int num = user_input.nextInt();
			
			
	
		// Use a try if you cannot find a way to close the scanner
		
		
			if(num == 1){
				String[] input_array = new String[6];
				
				// Putting in the first name
				System.out.println("Please put in the first name: ");
				Scanner input1 = new Scanner(System.in);
				input_array[0] = input1.nextLine();
				
				
				// Putting in the last name
				System.out.println("Please put in the last name: ");
				input_array[1] = input1.nextLine();
				
				
				// Putting in the type of room
				System.out.println("Please put in the room type that you wish to stay in: ");
				input_array[2] = input1.nextLine();
				
				// Putting in the number of people
				System.out.println("Please put in the number of people staying: ");
				input_array[3] = input1.nextLine();
				
				
				// Putting in the time of stay
				System.out.println("Please put in the time of stay: ");
				input_array[4] = input1.nextLine();		
				
				// Putting in whether parking space is needed
				System.out.println("Please put in if you need a parking space: ");
				input_array[5] = input1.nextLine();

				
				int space;
				System.out.println("almost there");
				// Checks if there is space for a normal room
				if(input_array[2].equals("normal room")){
					space = Customer.normal_room - 1;
					Customer.normal_room = Customer.normal_room - 1;
;
					if(space >= 0){
						Customer new_customer = new Customer.CustomerBuilder("66", "Mike", "Smith", "nice room", 3, 5).build();
						Customer new_customer1 = new Customer.CustomerBuilder("66", "Mike", "Smith", "nice room", 3, 5).build();

						new_customer.addCustomer(new_customer.getID(), new_customer);

						
						System.out.println(new_customer.getRoomType(new_customer.getID()));

						System.out.println(new_customer.getCost(new_customer.getID()));
						
						System.out.println(Customer.normal_room);
						
				
						System.out.println("we here");

					
					}
					else{
						System.out.println("No space");
					

					}
				}
				
	
				
				// Checks if there is space for a nice suite
				else if(input_array[2].equals("nice suite")){
					space = Customer.nice_suites - 1;
					if(space >= 0){
						Customer customer = new Customer.CustomerBuilder("66", "Mike", "Smith", "nice room", 3, 5).build();
			

					}
			
					else{
						System.out.println("No space");
				

					}
					
				}
				input1.close();
			
			
			}
				
				
				

			if(num == 2){
				System.out.println("You chose #2");
			
			
			}
			
			user_input.close();
		}
		
	
				
}
