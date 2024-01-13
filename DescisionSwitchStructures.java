
import java.util.Scanner;

public class DescisionSwitchStructures {
	public static void main(String[] args) {
		
	Scanner ky = new Scanner(System.in);
		
		System.out.println("Welcome to the are code state determiner");
		System.out.println("Please enter a three digit area code: ");
		
		int areaCode = ky.nextInt();
		
		switch(areaCode) {
			case 228:
			case 601:
			case 662:
			System.out.println("This is a Mississippi area code");
			break;
			
			case 205: 
			case 251:
			case 334: 
			case 938:
			System.out.println("This is a Alabama area code");
			break;
			
			case 479: 
			case 501: 
			case 870:
			System.out.println("This is a Arakansas area code");
			break;
			
			default:
			System.out.println("The area code you entered is not from Mississippi, Alabama, or Arakansas");
		}
		System.out.println("Goodbye hope this was helpful to you!!");
	}
}
		
		
	