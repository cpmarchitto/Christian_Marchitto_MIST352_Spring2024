/**
 * Author: Christian Marchitto
 */

public class Task7 {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
		Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
		Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
		
		emp1.displayEmployeeInfo();
		emp2.displayEmployeeInfo();
		emp3.displayEmployeeInfo();
	}

}
