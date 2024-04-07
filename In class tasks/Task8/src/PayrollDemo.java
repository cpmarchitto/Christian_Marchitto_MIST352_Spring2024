import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Chapter 7
 * Programming Challenge 2: Payroll Class
 * This program demonstrates the Payroll class.
 */

public class PayrollDemo
{
   public static void main(String[] args)
   {
      int hours;        // Hours worked
      double payRate;   // Hourly pay rate

      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a Payroll object named pr
      Payroll pr = new Payroll();
      
      // Get the hours and pay rate for each employee.
      for (int i = 0; i < pr.NUM_EMPLOYEES; i++)
      {
         // Get the hours worked.
         System.out.print("Enter the hours worked by employee " +
                          "number " + pr.getEmployeeIdAt(i) +
                          ": ");
         hours = keyboard.nextInt();
         
         // Validate hours worked using while hours < 0
         while(hours < 0) {
        	 System.out.print("ERROR: Enter 0 or greater for hours worked: ");
        	 hours = keyboard.nextInt();
         }
         
         // Get the hourly pay rate from user
         System.out.print("Enter the hourly pay rate for employee " +
                 "number " + pr.getEmployeeIdAt(i) +
                 ": ");
         payRate = keyboard.nextDouble();
         
         // Validate pay rate using a while payRate < 6
         while(payRate < 6) {
        	 System.out.print("ERROR: Enter 6.00 or greater for hours worked: ");
        	 payRate = keyboard.nextInt();
         }
         
         // Store the data in the pr object.
         pr.setHoursAt(i, hours);
         pr.setPayRateAt(i, payRate);
      }
      keyboard.close();
      
      // Create a DecimalFormat object to format output.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      // Display the payroll data for each employee using a for loop 
      System.out.print("\nPAYROLL DATA"
      		+ "\n============");
      for (int i = 0; i < pr.NUM_EMPLOYEES; i++) {
    	  System.out.print("\nEmployee ID: "+pr.getEmployeeIdAt(i)
    	  +"\nGross Pay: $"+dollar.format(pr.getGrossPay(i))+"\n");
      }
   }
}
