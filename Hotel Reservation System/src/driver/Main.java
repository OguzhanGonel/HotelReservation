package driver;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
public static void main(String args[]){
		
		System.out.println("Hi, please choose one of the following options: ");
		System.out.println("1: New Customer Registration");
		System.out.println("2: Lost Keys");
		
		
		
		Scanner user_input = new Scanner(System.in);
	
		int num = user_input.nextInt();
		
		
		
		Boolean quit = false;
		while(!quit){
		
		// Use a try if you cannot find a way to close the scanner
		switch (num) {
		
			case 1:
				String[] input_array = new String[6];
				
				// Putting in the first name
				System.out.println("Please put in the first name: ");
				Scanner input1 = new Scanner(System.in);
				input_array[0] = input1.nextLine();
				
				
				// Putting in the last name
				System.out.println("Please put in the last name: ");
				input_array[1] = input1.nextLine();
				
				
				// Putting in the number of people
				System.out.println("Please put in the number of people staying: ");
				input_array[2] = input1.nextLine();
				
				// Putting in the type of room
				System.out.println("Please put in the room type that you wish to stay in: ");
				input_array[3] = input1.nextLine();
				
				
				// Putting in the time of stay
				System.out.println("Please put in the time of stay: ");
				input_array[4] = input1.nextLine();		
				
				// Putting in whether parking space is needed
				System.out.println("Please put in if you need a parking space: ");
				input_array[5] = input1.nextLine();		

				
				int space;

				// Checks if there is space for a normal room
				if(input_array[3].equals("normal room")){
					space = Customer.normal_room - 1;
					if(space >= 0){
						Customer new_customer = new Customer(input_array[0], input_array[1], input_array[2], input_array[3], input_array[4], input_array[5]);
					}
					
					else{
						System.out.println("No space nigga");
					}
				}
				
				//Integer.valueOf(input_array[2]
				
				// Checks if there is space for a nice suite
				else if(input_array[3].equals("nice suite")){
					space = Customer.nice_suites - 1;
					if(space >= 0){
						Customer customer = new Customer(input_array[0], input_array[1], input_array[2], input_array[3], input_array[4], input_array[5]);
					}
			
					else{
						System.out.println("No space nigga");
					}
					
				}
				input1.close();
				break;
				
				
				
				

			case 2:
				System.out.println("You chose #2");
				quit = false;
				break;
			
			default: 
				break;
		}
		
	}
	user_input.close();
}
}
