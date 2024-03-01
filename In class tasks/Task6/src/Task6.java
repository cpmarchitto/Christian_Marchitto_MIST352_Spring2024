import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Author: Christian Marchitto
 * Task 6
 * This program writes an html file based on the users input
 */
public class Task6 {

	public static void main(String[] args) throws FileNotFoundException {
		String strName="";
		String strDesc="";
	
		Scanner scnUser = new Scanner (System.in);
		
		System.out.print("Enter your name: ");
		strName=scnUser.nextLine();
		
		System.out.print("Describe yourself: ");
		strDesc=scnUser.nextLine();
		
		PrintWriter outputFile = new PrintWriter("Webpage.html");
		outputFile.println("<html>"
				+ "\n<head>"
				+ "\n</head>"
				+ "\n<body>"
				+ "\n\t<center>"
				+ "\n\t\t<h1>"+strName+"</h1>"
				+ "\n\t<center>"
				+ "\n\t<hr />"
				+ "\n\t"+strDesc
				+ "\n\t<hr />"
				+ "\n</body>"
				+ "\n</html>");
		
		scnUser.close();
		outputFile.close();
	}

}
