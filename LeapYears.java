// Zach Weldon

//The program asks the user for a starting year past the year 1582 and an end year after that inital start year
//If the user imput is not right the program shows an error, if the years are valid the start year is incremented by one
//and the each year is tested through the for loop to determine if it is a leap year;
//the leap years are count controlled and only print out 10 per line and go until the end year is reached;

import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Initialize int and boolean variables
        int startYear;
        int endYear;
        boolean determiner = true;
		
        // Prompt user to continue or Exit
        while (determiner) {
            System.out.println("Press 1 to Continue or 0 to Exit: ");
            int decision = scan.nextInt();
            if (decision == 0) {
                determiner = false;
            } else {
				
                // Prompt user for start and end years
                while (true) {
                    System.out.print("Enter a starting year: ");
                    startYear = scan.nextInt();
                    System.out.print("Enter an ending year: ");
                    endYear = scan.nextInt();
					
                    // Test if start year is greater than or equal to 1582 when the Georgian Calendar went into effect;
                    if (startYear < 1582) {
                        System.out.println("Error: The Start year must be greater than or equal to the year 1582");
                    } else if (endYear <= startYear) {
                        System.out.println("Error: The End year must be greater than the start year");
                    } else {
						
                        // Nested for statement to step through each year in the entered range, incrementing years and figuring leap years;
                        // by "If the year is evenly divisible by 4, but not by 100, then it is a leap year, or if year is evenly divisible by 400, then it is a leap year.";
                        int leapCount = 0;
                        for (int year = startYear; year <= endYear; year++) {
                            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                                System.out.print(year + " ");
                                leapCount++;
								
                                // Increment counter, when the leap years in the row hits ten a new line of leap years is printed, and the count is reset to zero;
                                if (leapCount == 10) {
                                    System.out.println();
                                    leapCount = 0;
                                }
                            }
                        }
                        System.out.println(); // Print new line and allow for loop back to 1 or 0 prompt
                        break;
                    }
                }
            }
        }
        scan.close();
    }
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	