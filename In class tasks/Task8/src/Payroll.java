/**
 * Chapter 7
 * Programming Challenge 2: Payroll Class
 * The Payroll class stores information 
 * about employee's payroll data using
 * parallel arrays.
 * You need to code the whole thing
 */

public class Payroll
{
	// Constant for the number of employees
	public final int NUM_EMPLOYEES = 7;
	// Array of employee ID numbers
	private int[] employeeId = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
	// Array to hold hours worked
	private int[] hours = new int[7];
	// Array to hold pay rates
	private double[] payRate = new double[7];
	// Array to hold wages earned
	private double[] wages = new double[7];
  
	/**
	 * 
	 * @param i the location of the employee in the array
	 * @return Returns the gross pay (hours * payRate) for the employee whose data is stored at element i of each array.
	 */
	public double getGrossPay(int i) {
		return hours[i]*payRate[i];
	}
   
   
   /**
    * Setter for the EmployeeID
    * @param i: location of the employee in the array employeeID
    * @param id : The ID for this employee
    */
	public void setEmployeeIdAt(int i, int id) {
		this.employeeId[i]=id;
	}
   /**
    * Setter for the Hours
    * @param i: location of the employee in the array hours
    * @param h : the hours for that employee
    */
	public void setHoursAt(int i, int h) {
		this.hours[i]=h;
	}          
   /**
    * Setter for payRate 
    * @param i: location of the employee in the array payRate
    * @param p : the pay rate for that employee
    */
	public void setPayRateAt(int i, double p) {
		this.payRate[i]=p;
	}
   /**
    * Setter for wages
    * @param i: location of the employee in the wages  payRate
    * @param w : the wage for that employee
    */
	public void setWagesAt(int i, double w) {
		this.wages[i]=w;
	}  
   /**
    * Getter for EmployeeID
    * @param i : location of the employee in the EmployeeID array
    * @return
    */
	public int getEmployeeIdAt(int i) {
		return employeeId[i];
	}
   /**
    * Getter for hours
    * @param i : location of the employee in the hours array
    * @return
    */
	public int getHoursAt(int i) {
		return hours[i];
	}
   /**
    * Getter for payRate
    * @param i : location of the employee in the payRate array
    * @return
    */
	public double getPayRateAt(int i) {
		return payRate[i];
	}
   /**
    * Getter for wages
    * @param i : location of the employee in the wages array
    * @return
    */
	public double getWagesAt(int i) {
		return wages[i];
	}
 
}
