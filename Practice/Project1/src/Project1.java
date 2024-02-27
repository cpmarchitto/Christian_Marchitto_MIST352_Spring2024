/**
 * Christian Marchitto
 * Project 1
 * Sums the numbers before each number from 0-100
 */
public class Project1 {

	public static void main(String[] args) {
		
		for(int intCounter=0; intCounter<=100; intCounter++) // Counts the numbers from 0-100
		{
			int intSum=0; // stores the sum of the numbers
			for(int intNums=0; intNums<=intCounter; intNums++) // Counts the numbers to each number before it
			{
				intSum+=intNums; // Adds the total of the numbers to the sum
			}
			System.out.println(intCounter+"-"+intSum); // Prints out the numbers
		}

	}

}
