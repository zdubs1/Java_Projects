// Zach Weldon
//The program uses number sets presetned to the user to determine if their birth month is within the given number set, the user either answers with a 1 or a 0 
//If the answer is yes the sum is added by whatever value corresponds to the number set, the program then goes into a switch statement to determine the users birth month
//after which the user is outputed their birth month based on the values claculated in the if statement.


import java.util.Scanner;

public class BirthMonth {
	public static void main(String[] args) {
		Scanner ky = new Scanner(System.in);
		
//Intialize the string variables for each set of numbers;
		
		String set1 = "8 9 10\n" + "11 12\n";
        String set2 = "4 5 6\n" + "7 12\n";
        String set3 = "2 3 6\n" + "7 10 11\n";
        String set4 = "1 3 5\n" + "7 9 11\n";
		
//Prompt the user to answer which group of numbers their birth month is in; 
		
		System.out.println( set1 + "Is your birth month in the first number set?\n 1 = yes 0 = No");
		int ans1 = ky.nextInt();
		System.out.println( set2 + "Is your birth month in the second number set?\n 1 = yes 0 = No");
		int ans2 = ky.nextInt();
		System.out.println( set3 + "Is your birth month in the third number set?\n 1 = yes 0 = No");
		int ans3 = ky.nextInt();
		System.out.println( set4 + "Is your birth month in the fourth number set?\n 1 = yes 0 = No");
		int ans4 = ky.nextInt();
		
//use if statments to determine sum of numbers or month value 

		int sum = 0;
		if (ans1 == 1) {
        sum += 8;
		}
		if (ans2 == 1) {
        sum += 4;
		}
		if (ans3 == 1) {
        sum += 2;
		}
		if (ans4 == 1) {
        sum += 1;
		}
		
//Use switch statement to detirmine which month the users birthday is by comparing sum;
		
		String birthMonth;
		switch(sum) {
		case 1: 
			birthMonth = "January";
			break;
		case 2: 
			birthMonth = "February";
			break;
		case 3: 
			birthMonth = "March";
			break;
		case 4: 
			birthMonth = "April";
			break;
		case 5: 
			birthMonth = "May";
			break;
		case 6: 
			birthMonth = "June";
			break;
		case 7: 
			birthMonth = "July";
			break;
		case 8: 
			birthMonth = "August";
			break;
		case 9: 
			birthMonth = "September";
			break;
		case 10: 
			birthMonth = "October";
			break;
		case 11: 
			birthMonth = "November";
			break;
		case 12: 
			birthMonth = "December";
			break;
		default:
			birthMonth = "not determinable based on your input";
	}
	
//0utput the users birthmonth;
		
		System.out.println("Your birth month is " + birthMonth);
	}

}		
		
		
		
		

		
			

		

		