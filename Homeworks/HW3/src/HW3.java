/**
 * 
 */

/**
 * @author MJ
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JOptionPane;
/**
 * Author: Christian Marchitto
 * Class: MIST352-Spring 2024
 * HW #3 
 * Did not use ChatGPT
 */
public class HW3 {
	
	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {
	//****** Keep as is *******************
		// The location of the employee text file 
		String strDataLocation ="src/EmployeeData.txt";
		String strOutputLocation ="src/EmployeeSummary.txt";
		File myFile = new File(strDataLocation);
		Scanner inputFile = new Scanner (myFile);
		PrintWriter writer =new PrintWriter(strOutputLocation);
		int intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));
		DataSummary myData = new DataSummary(strDataLocation);
	//*************************************

		//This while loop controls the options for users. Your switch statement should be embedded here.
		while(intChoice !=0)
		{
			switch(intChoice)
			{
			case 1:
				myData.ViewEmployeeAndIDs();
				break;
			case 2:
				String strSearch = JOptionPane.showInputDialog(null, "Enter employee name to search for:");
				if (!(strSearch.equals(""))) {
					myData.SearchEmployee(strSearch.toLowerCase());
				}
				else {
					JOptionPane.showMessageDialog(null, "Not Found");
				}
				break;
			case 3:
				myData.ViewRoles();
				break;
			case 4:
				String strSearchRole = JOptionPane.showInputDialog(null, "Provide role to view employees:");
				if (!(strSearchRole.equals(""))) {
					myData.ViewEmployeeForRole(strSearchRole.toLowerCase());
				}
				else {
					JOptionPane.showMessageDialog(null, "Not Found");
				}
				break;
			case 5:
				JOptionPane.showMessageDialog(null, String.format("The average is: $%,.2f",+myData.getAverage()));
				break;
			case 6:
				myFile = new File(strDataLocation);
				inputFile = new Scanner (myFile);
				while(inputFile.hasNext()){
					Employee myEmployee = new Employee(inputFile.nextLine());
					myEmployee.setAboveAvg(myData.getAverage());
					System.out.println(myEmployee.SummerizeEmployee());
					writer.println(myEmployee.SummerizeEmployee());
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Wrong option");
			}
			intChoice  = Integer.parseInt( JOptionPane.showInputDialog(null,  ViewOptions()));	
		}

		writer.close();
		inputFile.close();	
	
		
		
	}
	/**	 
	 * Keep as is
	 * A method to display options
	 * @return : The options to display in the GUI
	 */
	
	public static String ViewOptions()
	{
		String strMessageToDisplay="Choose an option:"
				+ "\n0.\tExit"
				+ "\n1.\tView Employees and IDs"
				+ "\n2.\tSearch for Employee"
				+ "\n3.\tView current roles"
				+ "\n4.\tView employees for a certain role"
				+ "\n5.\tView Average Salary"
				+ "\n6.\tSummerize and Write data";
		return strMessageToDisplay;
	
	
	
	} 
	


}
	
	
	
	



