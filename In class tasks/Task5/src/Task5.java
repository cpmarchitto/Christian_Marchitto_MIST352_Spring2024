import java.util.Scanner;

/**
 * Author: Christian Marchitto
 * Task 5
 * This program asks users for a number of hotel rooms and floors to find its occupancy rate.
 */
public class Task5 {

	public static void main(String[] args) {
		
		Scanner scnUser = new Scanner (System.in);
		System.out.print("How many floors does the hotel have? ");
		int intFloors = scnUser.nextInt();
		while (intFloors<1)
		{
			System.out.print("Invalid. Enter 1 or more: ");
			intFloors = scnUser.nextInt();
		}
		int intRooms=0, intOccupied=0, intTotalRooms=0, intTotalOccupied=0;
		for (int intFloorNum=1; intFloorNum<=intFloors; intFloorNum++)
		{
			System.out.print("How many rooms does floor "+ intFloorNum +" have? ");
			intRooms = scnUser.nextInt();
			while (intRooms<10)
			{
				System.out.print("Invalid. Enter 10 or more: ");
				intRooms = scnUser.nextInt();
			}
			intTotalRooms+=intRooms;
			System.out.print("How many occupied rooms does the floor "+ intFloorNum +" have? ");
			intOccupied = scnUser.nextInt();
			while (intOccupied>intRooms)
			{
				System.out.print("Invalid. Must be "+intRooms+" or less. Re-enter: ");
				intOccupied = scnUser.nextInt();
			}
			intTotalOccupied+=intOccupied;
		}
		int intVacant = intTotalRooms - intTotalOccupied;
		double dblOccupancyRate = ((double)intTotalOccupied/intTotalRooms);
		System.out.println("Number of Rooms: "+intTotalRooms);
		System.out.println("Occupied Rooms: "+intTotalOccupied);
		System.out.println("Vacant Rooms: "+intVacant);
		System.out.println("Occupancy Rate: "+dblOccupancyRate);

		scnUser.close();
	}

}
