/**
 * Author: Christian Marchitto
 * Class: MIST352-Spring 2024
 * HW #3 
 * Did not use ChatGPT
 */
import java.util.Date;

public class Employee {
    private String name;
    private String dateOfBirth;
    private String role;
    private int employeeId;
    private String email;
    private double salary;
    private boolean aboveAvg ;
    private String bar;

    // Constructor 
    /**
     * You need to code this
     * This constructor accepts one line from a text file
     * It should split it up and initialize all attributes in this class using the values from the line
     * For example, name should equal to the first portion of the splited line and dateOfBirth is second and so on.
     * Lastly, set aboveAvg to false 
     * @param line
     */
    public Employee(String line) {
    	this.name=line.split(",")[0];
    	this.dateOfBirth=line.split(",")[1];
    	this.role=line.split(",")[2];
    	this.employeeId=Integer.parseInt(line.split(",")[3]);
    	this.email=line.split(",")[4];
    	this.salary=Double.parseDouble(line.split(",")[5]);
    	aboveAvg=false;
    	setAboveAvg(salary);
    	
    }
    
    /**
     * You need to code this
     * This method accepts the average salary from the main and decide whether this employee's salary is above average or not
     * If it is, then set aboveAvg to true
     * @param intAverage
     */
   public void setAboveAvg(double dblAverage)
   {
	   if(this.salary>dblAverage) {
		   aboveAvg=true;
	   }
	   
   }
	
   /**
	 * You need to code this.
	 * This method accepts an employee's salary and returns a bar chart of stars representation of the salary
	 * For example, 
	 * 				if the salary is 60,000, then the bar should return 6 stars:  ******
	 * 				if the salary is 95,600, then the bar should return 9 stars:  *********
	 * @param salary: the employee salary
	 * @return bar: representation in start of the salary. Each * represents $10,000
	 */
   public String SalaryBarChart(double salary) {
	   bar="";
	   for(int intBar=0; intBar<((int)salary/10000); intBar++) {
			bar+="*";
		}
		return bar;
   }
   
   /**
    * You need to code this.
    * This method provides a summary of each employee.
    * It returns a string formatted to include: employee name, employee ID, the bar chart of the salary, and whether salary is above average or not.
    * @return : Formatted string of employees basic information.
    */
   public String SummerizeEmployee() {
	   String strSum = String.format("%s\t\t%d\t%s\t%b", this.name,this.employeeId, SalaryBarChart(this.salary), aboveAvg);
	   return strSum;
   }
	 

}
