/**
 * Programming Challenge 4: LandTract Class
 * The LandTract class stores information
 * about a tract of land.
 */

public class LandTract
{
	
	private double length;
	private double width;
	
	// Constructor
	public LandTract(double len, double w) {
		this.length=len;
		this.width=w;
	}
	// Calculates the area
	public double getArea() {
		double area=length*width;
		return area;
	}
	public boolean equals(LandTract tract2) {
		LandTract thing = new LandTract(length,width);
		if (tract2.getArea()==thing.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	// Creates a string with the info from the object
	public String toString() {
		String str = "Length: " + length +
                "\nWidth: " + width +
                "\nArea: " + getArea();
		return str;
	}
}
