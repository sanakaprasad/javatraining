package basics;

import java.util.Scanner;

class temperature {
	public static void main(String[] args) {
		int celsius =0, fahrenheit=0;
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Welcome to temprature converter!");
	    System.out.println("Please enter temprature in Celcis (c):");
	    
	    celsius = Integer.parseInt(myObj.nextLine());  // Read user input
	    System.out.println("Temparature in Celcis is: " + celsius);  // Output user input
		 
		fahrenheit = (celsius * 9/5)+32;
		System.out.println("Converted Temperature in fahernheit:" + fahrenheit);
		
		
	}

}
