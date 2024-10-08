import java.io.File;
import java.io.FileNotFoundException;
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

/**
 * @author MJ
 *
 */
public class DataSummary {
	private String fileLocation;
	private double averageSalary;
	
	/**
	 * Keep as is
	 * Constructor. 
	 * @param file
	 * @throws FileNotFoundException 
	 */
	public DataSummary(String file) throws FileNotFoundException
	{
		this.fileLocation = file;
		this.averageSalary = getAverage();
		
	}
	
	/**
	 * You need to code this
	 * This method opens the employee data file and returns the average salary of all employees in the data
	 * @param strFile: Location of the text file from the main
	 * @return Avg: the Average of all salaries
	 * @throws FileNotFoundException: if file is not found, this is thrown
	 */
	public double getAverage() throws FileNotFoundException
	{
		int salaryTotal=0;
		int line=0;
		double Avg=0;
		File data = new File(fileLocation);
		Scanner scnReader = new Scanner(data);
		while(scnReader.hasNext()) {
			String strLine = scnReader.nextLine();
			double Salary=Double.parseDouble(strLine.split(",")[5]);
			salaryTotal+=Salary;
			line++;
		}
		Avg=(double)salaryTotal/line;
		scnReader.close();
		return Avg;
	}
	

	/**
	 * You need to code this
	 * This method should printout all employees and their IDs to the console.
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void ViewEmployeeAndIDs() throws FileNotFoundException
	{
		File data = new File(fileLocation);
		Scanner scnReader = new Scanner(data);
		while(scnReader.hasNext()) {
			String strLine = scnReader.nextLine();
			
			System.out.println("Name: "+strLine.split(",")[0]+".	ID: "+strLine.split(",")[3]);
		}
		scnReader.close();
		
	}
	
	
	/**
	 * You need to code this
	 * This method accepts an employee name (first, last, or both) and searches for all employee with that name
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strEmployee: Employee name 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void SearchEmployee(String strEmployee) throws FileNotFoundException {
		//how to get it to only search under names?
		boolean flag=false;
		String strLineTotal="";
		File data = new File(fileLocation);
		Scanner scnReader = new Scanner(data);
		while(scnReader.hasNext()){
			String strLine = scnReader.nextLine();
		    if(strLine.toLowerCase().contains(strEmployee)) {
		    	strLineTotal+=strLine + "\n";
		    	flag=true;
		    } 
		}
		if(flag==true) {
			JOptionPane.showMessageDialog(null, strLineTotal);
		}
		else {
			JOptionPane.showMessageDialog(null, "Not Found");
		}
		scnReader.close(); 
	}
	
	/**
	 * You need to code this
	 * This method accepts an employee role (i.e., position) and views for all employee in that role
	 * It should printout all employee's info to a GUI, otherwise, it should printout Not Found
	 * @param strRole: Employee role 
	 * @throws FileNotFoundException: Thrown if file is not found.
	 */
	public void ViewEmployeeForRole(String strRole) throws FileNotFoundException {
		boolean flag=false;
		String strLineTotal="";
		String roleOut = "";
		File data = new File(fileLocation);
		Scanner scnReader = new Scanner(data);
		while(scnReader.hasNext()){
			String strLine = scnReader.nextLine();
			if(strLine.toLowerCase().contains(strRole)) {
			 	roleOut = (strLine.split(",")[0]+" "+strLine.split(",")[3]+" "+strLine.split(",")[4]);
				strLineTotal+=roleOut + "\n";
				flag=true;
			}
		}
		if(flag==true) {
			JOptionPane.showMessageDialog(null, strLineTotal);
		}
		else {
			JOptionPane.showMessageDialog(null, "Not Found");
		}
		scnReader.close(); 
//		

		
	}
	

	/**
	 * Keep as is.
	 * This method displays the distinct roles in the text file
	 * @throws FileNotFoundException 
	 */
	public void ViewRoles() throws FileNotFoundException
	{	
		       
		        File myFile = new File(fileLocation);
		        Scanner inputFile = new Scanner(myFile);
		        Set<String> distinctRoles = new HashSet<>();

		        while(inputFile.hasNextLine()) {
		            String strData2Show = inputFile.nextLine();
		            // Splitting the line by comma
		            String[] dataParts = strData2Show.split(",");
		            // The role is the third element in the array (index 2)
		            distinctRoles.add(dataParts[2]);
		        }
		        inputFile.close();
		        String strRole="";
		        // Displaying distinct roles
		        for (String role : distinctRoles) {
		        	strRole = strRole + role + "\n";
		            //System.out.println(role);
		        }
		        JOptionPane.showMessageDialog(null, strRole);
		    }
	
}
