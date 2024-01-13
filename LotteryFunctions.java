// Zach Weldon
// Three digit lottery:
// In this program we modify our original Lottery.Java file to incoporate a while loop as well as two user defined methods. To start the sentinel value is set to 0
// while the sentinel is not -1 the program runs again and generates three random digits and then promotes the user to enter their guess, the numbers are extracted with modulus,
// if the number enterd is not valid the user is prompted again. Instead of hard coding the numbers we use the random int method.
// Following this the winner method is used to test for winning numbers in a if-else statment. If the user matches all numbers they win 5,000, if they match one they win 2,000


import java.util.Scanner;

public class LotteryFunctions {
	
	public static void main(String[] args) {
		Scanner ky = new Scanner(System.in);
// Sentinel value to exit or continue palaying the lottery		
		int play = 0;
		
		while (play != -1) {
			int lotto1 = randomInt(1, 9);
			int lotto2 = randomInt(0, 9);
			int lotto3 = randomInt(0, 9);
			
			System.out.print("Enter a 3-Digit number from 100 to 999: ");
			int luckyNum = ky.nextInt();			
//test if within the valid range			
			if (luckyNum < 100 || luckyNum > 999) {
				System.out.println("Error: The number you entered is not within the given range.");
//perfrom modulus on the users inputed number	
			} else {
			int luckyNum1 = luckyNum / 100;
			int luckyNum2 = (luckyNum / 10) % 10;
			int luckyNum3 = luckyNum % 10;
//Print	out the lottery numbers and use winner method to print out winnings		
			System.out.println("Lottery Numbers: " + lotto1 + " " + lotto2 + " " + lotto3);
			winner(luckyNum1, luckyNum2, luckyNum3, lotto1, lotto2, lotto3);
			}
//Prompts for sentinel value to exit program			
			System.out.println("Enter -1 to exit or any other number to continue: ");
			play = ky.nextInt();
		}
		
		System.out.println("Thanks for playing the lottery!");
	}
//user defined randomInt method to generate a lottery number using the min and max constraints
	public static int randomInt(int min, int max) {
		return (int)(Math.random() * (max - min + 1)) + min;
	}
//user defined winner method to test users numbers against the randomly generated lottery number	
	public static void winner(int guess1, int guess2, int guess3, int lotto1, int lotto2, int lotto3) {
		if (guess1 == lotto1 && guess2 == lotto2 && guess3 == lotto3) {
			System.out.println("All numbers match you win: $10,000");
			
			} else if ((guess1 == lotto1 || guess1 == lotto2 || guess1 == lotto3)
					&& (guess2 == lotto1 || guess2 == lotto2 || guess2 == lotto3)
					|| (guess2 == lotto1 || guess2 == lotto2 || guess2 == lotto3)
					&& (guess3 == lotto1 || guess3 == lotto2 || guess3 == lotto3)
					|| (guess1 == lotto1 || guess1 == lotto2 || guess1 == lotto3)
					&& (guess3 == lotto1 || guess3 == lotto2 || guess3 == lotto3)) {
						System.out.println("Two numbers match you win: $5,000");
						
			} else if ((guess1 == lotto1 || guess1 == lotto2 || guess1 == lotto3)
					|| (guess2 == lotto1 || guess2 == lotto2 || guess2 == lotto3)
					|| (guess3 == lotto1 || guess3 == lotto2 || guess3 == lotto3)) {
						System.out.println("One number matches you win: $1,000");
			} else {
				System.out.println("No numbers match you win nothing :( \nBetter Luck Next Time!");
		}
	}
	
}
