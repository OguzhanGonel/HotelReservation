package driver;

import java.util.Scanner;
import java.util.Random;



public class Main {
	
	
	public static void main(String args[]){
		
		
		
		
		
		
		/*Customer Regist = new Customer.CustomerBuilder("55", "m", "m", "m", 4, 4).build();
		
		Customer person1 = new Customer.CustomerBuilder("66", "Mike", "Smith", "nice room", 3, 5).build();
		Customer person2 = new Customer.CustomerBuilder("44", "UEONO", "whooo", "what", 13, 2).setAmenities(true).build();

		
		Regist.addCustomer("66", person1);
	
		Regist.addCustomer(person2.getID(), person2);

		
		System.out.println(Regist.getRoomType(person1.getID()));

		System.out.println(Regist.getCost(person2.getID()));
		git 
		System.out.println(Customer.normal_room);*/
		
		
		
		
		Customer customerList = new Customer.CustomerBuilder(0, "", "", "", 0, 0).build();
		
		Random rand = new Random();

		int randNum = rand.nextInt(100+1);
		System.out.println(randNum);

		
		Customer.normal_room = Customer.normal_room - randNum;
			
			System.out.println("Hi, please choose one of the following options: ");
			System.out.println("1: New Customer Registration");
			System.out.println("2: Add Utilities");
			System.out.println("3: Lost Keys");
			
			
			
			
			Scanner user_input = new Scanner(System.in);
			
			int num = user_input.nextInt();
			
			
	
		// Use a try if you cannot find a way to close the scanner
		
		
			if(num == 1){
				String[] input_array = new String[3];
				Integer[] input_array1 = new Integer[2];
				boolean[] input_array2 = new boolean[1];

				
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
				input_array1[0] = input1.nextInt();
				
				
				// Putting in the time of stay
				System.out.println("Please put in the time of stay: ");
				input_array1[1] = input1.nextInt();		
				
				// Putting in whether parking space is needed
				System.out.println("Please put in if you need a parking space: ");
				input_array2[5] = input1.nextBoolean();

				int custID = 0;
				
				int space;
				System.out.println("almost there");
				// Checks if there is space for a normal room
				if(input_array[2].equals("normal room")){
					space = Customer.normal_room - 1;
					Customer.normal_room = Customer.normal_room - 1;
;
					if(space >= 0){
						Customer new_customer = new Customer.CustomerBuilder(custID+1, input_array[0], input_array[1], input_array[2], input_array1[0], input_array1[1]).build();

						customerList.addCustomer(new_customer.getID(), new_customer);

						
						System.out.println(new_customer.getID());

						System.out.println(customerList.getCost(new_customer.getID()));
						
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
						Customer customer = new Customer.CustomerBuilder(custID+1, "Mike", "Smith", "nice room", 3, 5).build();
			

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
