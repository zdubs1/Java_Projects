import java.util.Random;
import java.util.Scanner;

public class DiceGame{
	public static void main(String[] args) {
	
	 Scanner input = new Scanner(System.in);
        Random random = new Random();
         boolean playAgain = true;
         System.out.println("Welcome to the Dice Game!");
            
            System.out.print("Enter Player 1's name: ");
            String player1 = input.nextLine();
            
            System.out.print("Enter Player 2's name: ");
            String player2 = input.nextLine();
        do {
            //System.out.println("Welcome to the Dice Game!");
            
           // System.out.print("Enter Player 1's name: ");
           // String player1 = input.nextLine();
            
           // System.out.print("Enter Player 2's name: ");
          //  String player2 = input.nextLine();
            
            System.out.println("\nRolling 3 times for each player...\n----------");
            
            int player1Sum = 0;
            int player2Sum = 0;
	
		for (int i = 1; i <= 3; i++) {
			System.out.println("Roll " + i + "\n");   
			int player1Roll = random.nextInt(6) + 1;
			int player2Roll = random.nextInt(6) + 1;
			
			System.out.println("______\n" + player1 + ": " + player1Roll);
			System.out.println(player2 + " " + player2Roll);
			
			player1Sum += player1Roll;
			player2Sum += player2Roll;
			}
	
			System.out.println("\n" + player1 + "'s Total Score: " + player1Sum);
			System.out.println(player2 + "'s Total Score: " + player2Sum);
		
			WhoWon(player1, player2, player1Sum, player2Sum);
	
			System.out.print("Play again? y/n: ");
			String playAgainDesc = input.nextLine();
			playAgain = playAgainDesc.equalsIgnoreCase("y");
			
		}while (playAgain);
		
		System.out.println("Thank you for playing");
	}
		public static void WhoWon(String player1, String player2, int player1Sum, int player2Sum) {
			if (player1Sum > player2Sum){
				System.out.println(player1 + " wins by a score of " + (player1Sum - player2Sum) + " points.");
			}else if (player2Sum > player1Sum){
				System.out.println(player2 + " wins by a score of " + (player2Sum - player1Sum) + " points. ");
			} else {
            System.out.println("Tie Game!!");
        }
    }
}

			
				
	
	
	
	
	
			
	
		
	
	
	
	