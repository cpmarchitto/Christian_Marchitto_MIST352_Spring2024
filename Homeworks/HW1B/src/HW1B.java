// Author: Christian Marchitto
// Class: MIST352-Spring24
// HW #1
// This program prints messages

import java.util.Scanner;
//The name of the class should reflect the class name
public class HW1B {
	public static void main(String[] args) {
	
		//Prepares program to accept data from user
		Scanner scnUserInput = new Scanner (System.in);
		
		// Declaring a string variable
		// Variable should be a string not integer
		System.out.println("Enter value for numberAsString");
		String numberAsString = scnUserInput.next();
		
		// Declaring a integer variable
		// Variable should be an integer not string
		System.out.println("Enter value for number");
		int number = scnUserInput.nextInt();
		
		// Declaring a boolean variable
		// True should not be in quotes 
		System.out.println("Is the flag true or false?");
		boolean flag = scnUserInput.nextBoolean(); // This should be a boolean value
		
		// Declaring a double variable
		// Double cannot include text 
		System.out.println("Enter value for decimalNumber");
		double decimalNumber = scnUserInput.nextDouble();
	
		// Printing a greeting message with new line
		// Text should be wrapped in quotes
		System.out.println("Hello World\n");
		
		// Printing tabbed text
		// Quotes should surround the text
		System.out.println("\tTabbed text");
		
		// Printing a variable
		// Cannot print a undeclared variable; not wanted in output
		// int undeclaredVariable = 0;
		// System.out.println(undeclaredVariable);
		
		// Concatenating string with integer using escape sequences
		// Quote was not ended for the "Value of number:\t"
		System.out.println("Value of number:\t" + number + "\nValue of numberAsString:\t" + numberAsString);
		
		// Declaring a constant
		// Constant variables must have "final" 
		final double PI = 3.14159;
		
		// Printing a complex message
		// Nothing wrong with line
		System.out.println("The value of flag is " + flag + ", and the decimal number is " + decimalNumber);
		
		// Printing a test message
		// "System" should be capitalized; also not wanted in output
		// System.out.println("This is a test.");
		
		// Close the scanner
	    scnUserInput.close();
	}
	
}