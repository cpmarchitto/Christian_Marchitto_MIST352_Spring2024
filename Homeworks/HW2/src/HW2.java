import javax.swing.JOptionPane;

/**
 * Author: Christian Marchitto
 * Class: MIST352-Spring 2024
 * HW #2 - 2/19/24
 * This program is a Java Juice business that outputs a receipt
 */

public class HW2 {

	public static void main(String[] args) {
	// Shows welcome message	
	JOptionPane.showMessageDialog(null,"Welcome to Java Juice Bar!");
	// Shows options for user to pick from
	int intSelection = Integer.parseInt(JOptionPane.showInputDialog("Select your base juice:"
			+ "\n1. Apple - $5.00"
			+ "\n2. Orange - $4.50"
			+ "\n3. Mango - $6.00"
			+ "\n4. Carrot - $5.50"));	
	
	double dblPrice = 0;  
	String strJuice = ""; 
	// Creates a switch to set the dblPrice and strJuice based on the users selection
	switch(intSelection)
	{
		case (1):
			strJuice = "Apple";
			dblPrice = 5.00;
			break;
		case (2):
			strJuice = "Orange";
			dblPrice = 4.50;
			break;
		case (3):
			strJuice = "Mango";
			dblPrice = 6.00;
			break;
		case (4):
			strJuice = "Carrot";
			dblPrice = 5.50;
			break;
		default:
			JOptionPane.showMessageDialog(null,"Invalid selection. Please restart the program.");
	}	
	double dblFullPrice=dblPrice;
	double dblDiscount=0;
	double dblTotalPrice=dblFullPrice;
	double dblTax, dblTotalTax;
	// An if statement that runs the rest of the program only if the user entered a correct input
	if (intSelection>0 && intSelection<5)
	{
		int intGinger = JOptionPane.showConfirmDialog(null, "Would you like to add ginger for an extra $1.00?"); // Asks the user if they want ginger
		if (intGinger==0)  // If the user selects "yes" then it adds the ginger price to the full price
		{
			double dblGingerPrice=1.00;
			dblFullPrice = dblPrice + dblGingerPrice;
			if (intSelection==3)	// If the user selects "Mango" and adds ginger, then apply a discount
			{
				dblDiscount=0.5;
				dblTotalPrice=dblFullPrice-dblDiscount;
			}
			else	// Otherwise do not apply a discount
			{
				dblTotalPrice=dblFullPrice;
			}
			dblTax=dblTotalPrice*0.16;	// Calculates tax
			dblTotalTax=dblTotalPrice+dblTax;	// Adds tax to the total price
			// Outputs the following String if the user added ginger to their order
			JOptionPane.showMessageDialog(null,String.format("|| Final Bill ||"
					+ "\n-----------------"
					+ "\nBase Juice: %s - $%.2f"
					+ "\nAdd-On: Ginger - $%.2f"
					+ "\n-----------------"
					+ "\nFull Price: $%.2f"
					+ "\nDiscount: -$%.2f"
					+ "\n-----------------"
					+ "\nTotal Before Tax: $%.2f"
					+ "\nTax: $%.2f"
					+ "\n-----------------"
					+ "\nTotal After Tax: $%.2f",strJuice,dblPrice,dblGingerPrice,dblFullPrice,dblDiscount,dblTotalPrice,dblTax,dblTotalTax));	
		}
		else // Runs the following if the user did not add ginger
		{
			dblTax=dblTotalPrice*0.16;	// Calculates tax
			dblTotalTax=dblTotalPrice+dblTax;	// Adds tax to the total price
			JOptionPane.showMessageDialog(null,String.format("|| Final Bill ||"
					+ "\n-----------------"
					+ "\nBase Juice: %s - $%.2f"
					+ "\n-----------------"
					+ "\nFull Price: $%.2f"
					+ "\nDiscount: -$%.2f"
					+ "\n-----------------"
					+ "\nTotal Before Tax: $%.2f"
					+ "\nTax: $%.2f"
					+ "\n-----------------"
					+ "\nTotal After Tax: $%.2f",strJuice,dblPrice,dblFullPrice,dblDiscount,dblTotalPrice,dblTax,dblTotalTax));		
		}
		
	}
	
	}

}
