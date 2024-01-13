import java.util.Scanner;

public class blackJack {
    public static void main(String[] args) {
	
	Scanner ky = new Scanner(System.in);
	
		System.out.println("Welcome to the BlackJack Helper!\n Please Enter Your Name: ");
		String name = ky.nextLine();
		int score = 0;
		
		System.out.println(name + ", enter the value of the first card drawn: ");
		int firstCard = ky.nextInt();
		score = score + firstCard;
		System.out.println(name + ", enter the value of the second card drawn: ");
		int secondCard = ky.nextInt();
		score = score + secondCard;
		
		if (score == 21) {
			System.out.println(" 21! BlackJack!! Count our Money!");
		}
		else if (score >=  12 && score <= 20) {
			System.out.println("Your score is " + score + " It's to risky do not draw another card.");
		}
		else if (score >= 2 && score <= 11) {
			System.out.println("Your score is " + score + " It's safe to draw another card.");
		}	
		else {
			System.out.println("You have already busted.... the party is over.");
		}
		System.out.println("I hope this brought you great fortune, goodbye " + name +".");
			
	}
	
		

}	
		
		