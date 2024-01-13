//Zach Weldon
// Three digit lottery:
// The Program first generates 3 random integers using the Math.Random method, it then prompts the user to input their 3 digits and performs modulus to extract;
// It then checks to see if the number entered is within the range, then goes through testing to determine what prize is won depending on matching numbers;



import java.util.Scanner;
	
	public class Lottery {
		public static void main(String[] args) {	
//Declaring the three random numbers using Math.Random to generate 3 digits between 1 and 9;
			int lotto1 = (int)(Math.random() * 9) + 1;
			int lotto2 = (int)(Math.random() * 10);
			int lotto3 = (int)(Math.random() * 10);
//Promt the user for their lucky number and read it into the program;
			Scanner ky = new Scanner(System.in);
			System.out.println("Enter a 3-Digit number from 100 to 999: ");
			int luckyNum = ky.nextInt();
//Extract the 3-digits from the user input using modulus;
			int luckyNum1 = luckyNum / 100;
			int luckyNum2 = (luckyNum / 10) % 10;
			int luckyNum3 = luckyNum % 10;
//If statement to determine if the number the user has entered is within the given range of 100 - 999, if not the program ends;
			if (luckyNum < 100 || luckyNum > 999) {
				System.out.println("Error: The number you entered is not within the given range.");
				System.exit(0);
			}
//Output random winning lottery numbers for testing if numbers match from user inputs;			
			else { 
				System.out.println("Lottery Numbers: " + lotto1 + " " + lotto2 + " " + lotto3);
			}
//Test for the exact match and grand prize;
			if (luckyNum1 == lotto1 && luckyNum2 == lotto2 && luckyNum3 == lotto3) {
				System.out.println("All numbers match you win: $10,000");
			}
//Test for two number mathches;			
			else if ((luckyNum1 == lotto1 || luckyNum1 == lotto2 || luckyNum1 == lotto3)
					&& (luckyNum2 == lotto1 || luckyNum2 == lotto2 || luckyNum2 == lotto3)
					|| (luckyNum2 == lotto1 || luckyNum2 == lotto2 || luckyNum2 == lotto3)
					&& (luckyNum3 == lotto1 || luckyNum3 == lotto2 || luckyNum3 == lotto3)
					|| (luckyNum1 == lotto1 || luckyNum1 == lotto2 || luckyNum1 == lotto3)
					&& (luckyNum3 == lotto1 || luckyNum3 == lotto2 || luckyNum3 == lotto3)) {
						System.out.println("Two numbers match you win: $5,000");
					}	
//Test for one number match;
			else if ((luckyNum1 == lotto1 || luckyNum1 == lotto2 || luckyNum1 == lotto3)
					|| (luckyNum2 == lotto1 || luckyNum2 == lotto2 || luckyNum2 == lotto3)
					|| (luckyNum3 == lotto1 || luckyNum3 == lotto2 || luckyNum3 == lotto3)) {
						System.out.println("One number matches you win: $1,000");
					}
//If there are no matches after the sequential testing, printout that no numbers match and the user wins nothing;			
			else {
					System.out.println("No numbers match you win nothing :(\nBetter luck next time");
					}	
					
				
						
			
		}
		
	}
	
			
			
			
		

			
		
		
	

 