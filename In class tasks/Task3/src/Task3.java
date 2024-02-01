/**
 * Compounding Interest Calculator
 * 
 */

import javax.swing.JOptionPane;

public class Task3 {

	public static void main(String[] args) {

		double dblP = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of principal deposited into the account."));
		
		double dblr = Double.parseDouble(JOptionPane.showInputDialog("Enter the annual interest rate paid by the account in %."))/100;
		
		double dbln = Double.parseDouble(JOptionPane.showInputDialog("Enter the number of times per year the interest is compounded."));
		
		double dblt = Double.parseDouble(JOptionPane.showInputDialog("Enter the number years your account will earn interest."));
		
		double dblA = dblP*(Math.pow(1+dblr/dbln,dbln*dblt));
		
		JOptionPane.showMessageDialog(null, "Account Balance: $" + String.format("%.2f", dblA));
	}

}
