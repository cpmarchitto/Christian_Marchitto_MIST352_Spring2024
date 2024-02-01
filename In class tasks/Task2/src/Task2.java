/**
 * Word Game
 * 
 */

import javax.swing.JOptionPane;

public class Task2 {

	public static void main(String[] args) {

	String strName = JOptionPane.showInputDialog("Enter your name.");
	
	double dblAge = Double.parseDouble(JOptionPane.showInputDialog("Enter your age.")); 
	
	String strCity = JOptionPane.showInputDialog("Enter a name of a city.");
	
	String strCollege = JOptionPane.showInputDialog("Enter a name of a college.");
	
	String strProf = JOptionPane.showInputDialog("Enter a name of a profession.");
	
	String strAnimal = JOptionPane.showInputDialog("Enter a type of an animal.");
	
	String strPet = JOptionPane.showInputDialog("Enter a name of your pet.");
	
	System.out.print("There was once a person named " + strName +" who lived in " + strCity + 
			". At the age of " + dblAge + ", " + strName + " went to \ncollege at " + strCollege + ". " + strName + 
			" graduated and went to work as a " + strProf + ". Then, " + strName + " adopted \na(n) " + strAnimal + 
			" named " + strPet + ". They both lived happily ever after!");

	}
}
