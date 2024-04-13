import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Author: Christian Marchitto
 * Class: MIST352-Spring 2024
 * HW #4
 */
/**
 * This class allows you to convert a csv file to arff file.
 * @author MJ
 *
 */
public class Csv2Arff {
	private String csvFileLocation;
	
	/**
	 * Keep as is. 
	 * Constructor.
	 * @param Location: The name 
	 */
	public Csv2Arff(String strFileLocation)
	{
		csvFileLocation=strFileLocation;
	}
	
	/**
	 * You need to code this
	 * This method accepts a name of a csv file and it writes an arff file from the csv file
	 * Writing arff file is similar to writing any .txt file. Just make sure the arff file name ends with .arff
	 * @param theLocation: The name and location of any csv file
	 * @throws FileNotFoundException 
	 */
	public void Convert2Arff(String theLocation) throws FileNotFoundException
	{
		//replaces the original file name with "arff"
		String arffOutput = theLocation.replace("csv", "arff").replace("src/Data/", "");
		//adds my name to the file
		String newArffOutput = "src/Data/Christian_Marchitto_"+arffOutput;
		
		//creates new file reader and printer
		PrintWriter arffWriter = new PrintWriter(newArffOutput);
		File info = new File(theLocation);
		Scanner csvFile = new Scanner(info);
		Scanner thing = new Scanner(info);
		int rows=0;
		int cols=0;
		int lineNum=0;
		int commaCount=0;

		//counts the number of rows
		while(thing.hasNext()) {
			lineNum++;
			thing.nextLine();
		}
		thing.close();
		
		//creates new 2d array
		String[][] strData = new String[lineNum][34];
		
		//stores the csv file into the 2d array
		while(csvFile.hasNext()) {
			String[] strLine = csvFile.nextLine().split(",");
			commaCount=1;
			while(commaCount < strLine.length) {
				strData[rows][cols] = strLine[commaCount];
				commaCount++;
				cols++;
			}
			cols=0;
			rows++;			
		}
		csvFile.close();

		//adds the arff info into the file and formats it to arff
		arffWriter.print("@relation "+newArffOutput.replace(".arff", "").replace("src/Data/", "")+"\n\n");
		for (int i = 0; i < strData.length; i++) {
	            for (int j = 0; j < strData[i].length; j++) {
	            	if(i==0 && j<=30) {
	            		arffWriter.println("@attribute "+strData[i][j]+" numeric");
	            	}
	            	else if(i==0 && j>30 && j<=34) {
	            		arffWriter.println("@attribute "+strData[i][j]+" { TRUE , FALSE }");
	            	}
	            	else if (i==1 && j==0)
	            		arffWriter.print("@data\n"+strData[i][j]+" ");
	            	else {
	            		arffWriter.print(strData[i][j]+ " ");
	            	}
	            }
	            arffWriter.println();
	        }
	      arffWriter.close();
	      System.out.println("Done =)");
	}
	
	/**
	 * You need to code this
	 * This method should read the text file given in theFile, and store it into a two dimensional array of Strings.
	 * This method should return the data given in a specific row and column in the two dimensional array
	 * @param theFile: name of the csv file to open 
	 * @param row: row number in the two dimensional array
	 * @param column: column number in the two dimensional array
	 * @return strData2Return: the data in the [row][column]
	 * @throws FileNotFoundException 
	 */
	public static String RetrieveCell(String theFile, int row, int column) throws FileNotFoundException
	{
		File info = new File(theFile);
		Scanner csvFile = new Scanner(info);
		Scanner thing = new Scanner(info);
		int rows=0;
		int cols=0;
		int lineNum=0;
		int commaCount=0;

		
		while(thing.hasNext()) {
			lineNum++;
			thing.nextLine();
		}
		thing.close();
		String[][] strData = new String[lineNum][35];
		
		while(csvFile.hasNext()) {
			String[] strLine = csvFile.nextLine().split(",");
			commaCount=0;
			while(commaCount < strLine.length) {
				strData[rows][cols] = strLine[commaCount];
				commaCount++;
				cols++;
			}
			cols=0;
			rows++;			
		}
		csvFile.close();
		
		//prints out the info based on the users input
		String strData2Return="Row: "+row+" Column: "+column+" Value: "+strData[row][column];
		
		return strData2Return;
	}
	
	public String PrintMinMaxInfo(String strFile) throws FileNotFoundException {
		
		File info = new File(strFile);
		Scanner csvFile = new Scanner(info);
		Scanner thing = new Scanner(info);
		int rows=0;
		int cols=0;
		int lineNum=0;
		int commaCount=0;

		
		while(thing.hasNext()) {
			lineNum++;
			thing.nextLine();
		}
		thing.close();
		String[][] strData = new String[lineNum][35];
		
		while(csvFile.hasNext()) {
			String[] strLine = csvFile.nextLine().split(",");
			commaCount=0;
			while(commaCount < strLine.length) {
				strData[rows][cols] = strLine[commaCount];
				commaCount++;
				cols++;
			}
			cols=0;
			rows++;			
		}
		csvFile.close();
		
		//finds the non-zero max
      	double max = Double.parseDouble(strData[1][1]);
        int rowIndexMax = 0, colIndexMax = 0;
        for (int i = 1; i < strData.length; i++) {
            for (int j = 1; j < strData[i].length-3; j++) {
                if (Double.parseDouble(strData[i][j]) > max && Double.parseDouble(strData[i][j])!=0) {
                    max = Double.parseDouble(strData[i][j]);
                    rowIndexMax = i;
                    colIndexMax = j;
                }
            }
        }
        
        //finds the non-zero min
	      	double min = Double.parseDouble(strData[1][1]);
	        int rowIndexMin = 0, colIndexMin = 0;
	        for (int i = 1; i < strData.length; i++) {
	            for (int j = 1; j < strData[i].length-3; j++) {
	                if (Double.parseDouble(strData[i][j]) < min && Double.parseDouble(strData[i][j])!=0) {
	                    min = Double.parseDouble(strData[i][j]);
	                    rowIndexMin = i;
	                    colIndexMin = j;
	                }
	            }
	        }
	    //Prints out the row and column based on the min/max
	    String strReturn = 
	    		
	    		("\n---------EXTRA CREDIT---------"
	    				+ "\nName: "+strFile.replace("src/Data/", "")+"\n\n"
	    	    		+ "Maximum non-zero value:\n"
	    	    		+ "File name: "+strData[rowIndexMax][0]+"\n"
	    	    		+ "Maximum value: "+max+" found in column: " + strData[0][colIndexMax])
	    		+("\n\n"
	    		+ "Minimum non-zero value:\n"
	    		+ "File name: "+strData[rowIndexMin][0]+"\n"
	    		+ "Minimum value: "+min+" found in column: " + strData[0][colIndexMin]);
		
		return strReturn;
	}
}
