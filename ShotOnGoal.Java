// CSCI 111
// Zach Weldon
// Student ID: 010760098
// Program 1
// In keeping with the UM Honor Code, I have neither given nor received assistance from anyone other than the instructor.
// The program promtpts the user to put in the initial variables and determines flight time, ditance traveled, and range to determine if the shot is a goal or a miss;

import java.util.Scanner;

public class ShotOnGoal {
    public static void main(String[] args) {
        //Declare variables
		final double GRAVITY = 9.8;
		final double GOAL_DEPTH = 3.6576; 
		// Declares the constant variables for gravity and the depth of goal;
	
        //Read in inputs
		Scanner ky = new Scanner(System.in);
		System.out.println("Enter initial distance to goal (m):");
		double distanceToGoal = ky.nextDouble(); 
		System.out.println("Enter initial speed when ball is kicked (s):");
		double initialSpeed = ky.nextDouble(); 
		System.out.println("Enter the initial flight angle (degrees):");
		double initialAngle = ky.nextDouble();	
		//The block of code above prompts the user for the inputs and assigns the values to the variables;
		
        //Calculate the flight time, the range the ball travels
		//and whether or not it is a shot on goal
		double flightTime = (((2 * initialSpeed * Math.sin(Math.toRadians(initialAngle)))/GRAVITY));
		double distanceTraveled = (flightTime * initialSpeed * Math.cos(Math.toRadians(initialAngle)));
		double range = Math.abs(distanceToGoal - distanceTraveled);
		//Calculates the flight time and distance traveled while converting degrees to radians within the formaula;
		//Calculates the range by finding the diffrence between distance to goal and the output of the distance traveled formula;
		
		//Output variables and whether it was a shot on goal
		System.out.printf("Distance to goal (m): %.2f\n", distanceToGoal);
		System.out.printf("Initial speed (s): %.2f\n",initialSpeed);
		System.out.printf("Initial Flight angle (radians): %.2f\n", Math.toRadians(initialAngle));
		System.out.printf("Flight time (s): %.2f\n", flightTime);
		System.out.printf("Distance ball travels (m): %.2f\n", distanceTraveled); 
		//Outputs rounded to two decimal places;
		//Distance to goal, initial speed, and inital flight angle converted to radians from the user inputs;
		//The calculated flight time, and distance the ball travels is also output;
		
		boolean hitOrMiss = range <= GOAL_DEPTH;
		if (hitOrMiss == true) {
			System.out.println("GOAL!!!!");
		}
		else {
			System.out.println("MISS :(");
		}
		//Use boolen true or false for if/else statment that outputs goal! or miss :( based on if the range is less than the goal depth of 3.6576; 
		//We learned the if else statment on the turn in day and I wanted to see if I could use it correctly in the program ;

 }
}