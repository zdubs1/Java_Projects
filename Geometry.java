import java.util.Scanner;

/*
	This program demonstrates static methods
*/

public class Geometry
{

	public static Scanner scan = new Scanner(System.in); // Scanner object that can be used in all methods

		public static void main (String [] args)
		{
		//Task #1 Print the menu and call the processChoice method
		int entry;
		do{
		System.out.println("This is a Geometry calculator");
		System.out.println("Choose what you would like to calculate");
		System.out.println("1. Find the area of a circle");
		System.out.println("2. Find the area of a rectangle");
		System.out.println("3. Find the area of a triangle");
		System.out.println("4. Exit the program");
		System.out.print("Enter your choice: ");
		entry = scan.nextInt();
		processChoice(entry);
		} while (entry != 4);
			
	
	}
	
   /**
		The processChoice method processes the user's choice from a menu
		@param choice  The user's choice
		
	*/    
 	public static void processChoice(int choice) {
		double value = 0;	//the value returned from the method
		
		switch (choice) {
			case 1:
				System.out.print("Enter the radius of the circle:  ");
				double radius = scan.nextDouble();
				value = circleArea(radius);
				System.out.println("The area of the circle is " + value + "\n");
				break;
			case 2:
				//Task #2b
				System.out.print("Enter the length of rectangle: ");
				double length = scan.nextDouble();
				System.out.print("Enter the width of the rectangle: "); 
				double width = scan.nextDouble();
				value = rectangleArea(length, width);
				System.out.println("The area of the rectangle is: " + value);
				break;
			case 3: 
				//Task #3b
				 System.out.print("Enter the base of the triangle: ");
				double base = scan.nextDouble();
				System.out.print("Enter the height of the triangle: ");
				double height = scan.nextDouble();
				value = triangleArea(base, height);
				System.out.println("The area of the triangle is: " + value);
				break;
			case 4:
				System.out.println("Goodbye");
				break;
			default:
				System.out.println("You did not enter a valid choice.");
		}
	} 
	
	
	
    /*
		The circleArea method returns the area of the circle
		@param radius  The radius of the circle
		@return The area of the circle
	*/
	public static double circleArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	
	
	//TASK #2a  Complete the static method using the info below as a guide
   	public static double rectangleArea(double length, double width) {
		return length * width;
	}
	
	
	/*
		The rectangleArea returns the area of the rectangle
		@param length The length of the rectangle
		@param width  The width of the rectangle
		@return The area of the rectangle
	*/
	
	
	//TASK #3a  Complete the static method using the info below as a guide	
	public static double triangleArea(double base, double height) {
		return 0.5 * base * height;
	}
	
	/*
		The triangleArea method calculates the area of the triangle
		@param height The height of the triangle
		@param base  The base of the triangle
		@return The area of the triangle
	*/
	
}