/**
 * Author: Christian Marchitto
 */

import javax.swing.JOptionPane;

public class Employee {

	private String name;
	private int idNumber;
	private String department;
	private String position;

	/**
	 * This constructor requires the employee name, idNumber, department, and position 
	 * @param n
	 * @param id
	 * @param dept
	 * @param pos
	 */
		public Employee(String n, int id, String dept, String pos) {
		this.name=n;
		this.idNumber=id;
		this.department=dept;
		this.position=pos;	
	}
	/**
	 * This constructor only requires employee name and idNumber
	 * @param n
	 * @param id
	 */
	public Employee(String n, int id) {
		this.name=n;
		this.idNumber=id;
	}
	public void setName(String n) {
		name=n;
	}
	public void setIdNumber(int num) {
		idNumber=num;
	}
	public void setDepartment(String d) {
		department=d;
	}
	public void setPosition(String pos) {
		position=pos;
	}
	public String getName() {
		return name;
	}
	public int getIdNumber() {
		return idNumber;
	}
	public String getDepartment() {
		return department;
	}
	public String getPosition() {
		return position;
	}
	public void displayEmployeeInfo() {
		JOptionPane.showMessageDialog(null,"Employee "+name+" has the ID "+idNumber+" and works as a "+position
				+" in the "+department+" department.");
	}
	
}
