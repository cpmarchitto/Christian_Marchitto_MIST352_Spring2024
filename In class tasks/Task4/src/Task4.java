/**
 * Author: Christian Marchitto
 * Task 4
 * This program prints out bar charts based on the users input
 */

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		int intStores1=0;
		int intStores2=0;
		int intStores3=0;
		int intStores4=0;
		int intStores5=0;
		
		Scanner scnUser = new Scanner (System.in);
		for (int intStores=1; intStores <=5; intStores++)
		{
			System.out.print("Enter today's sales for store " + intStores+":");
			if (intStores==1)
			{
				 intStores1= (scnUser.nextInt()/100);
			}
			else if (intStores==2)
			{
				intStores2= (scnUser.nextInt()/100);
			}
			else if (intStores==3)
			{
				intStores3= (scnUser.nextInt()/100);
			}
			else if (intStores==4)
			{
				intStores4= (scnUser.nextInt()/100);
			}
			else if (intStores==5)
			{
				intStores5= (scnUser.nextInt()/100);
			}	
		}
		
		System.out.print("\nSALES BAR CHART");
		System.out.print("\nStore 1: ");
		for(int intBar=0; intBar<intStores1; intBar++)
		{
			System.out.print("*");
		}
		System.out.print("\nStore 2: ");
		for(int intBar=0; intBar<intStores2; intBar++)
		{
			System.out.print("*");
		}
		System.out.print("\nStore 3: ");
		for(int intBar=0; intBar<intStores3; intBar++)
		{
			System.out.print("*");
		}
		System.out.print("\nStore 4: ");
		for(int intBar=0; intBar<intStores4; intBar++)
		{
			System.out.print("*");
		}
		System.out.print("\nStore 5: ");
		for(int intBar=0; intBar<intStores5; intBar++)
		{
			System.out.print("*");
		}

	}

}
