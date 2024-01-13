import java.util.Scanner;

public class UserInputProgram {
	public static void main(String [] args) {
		Scanner ky = new Scanner(System.in);
		System.out.print("Please enter your first name:");
		String firstName = ky.nextLine();
		System.out.print("Please enter your last name:");
		String lastName = ky.nextLine();
		String fullName = firstName + " " + lastName;
		System.out.println("Your full name is: " + fullName);
		int nameLength = fullName.replace(" ","").length();
		System.out.println("Your name is " + nameLength + " letters long (excluding spaces).");
		char firstInitial = firstName.charAt(0);
		System.out.println("Your first initial is: " + firstInitial);
		String fullNameInCaps = fullName.toUpperCase();
		System.out.println("Your full name in all caps: " + fullNameInCaps);
		
		System.out.println();
		System.out.println();
		int CURRENT_YEAR = 2023;
		String birthYear = "2001";
		int intBirthYear = Integer.parseInt(birthYear);
		int age = CURRENT_YEAR - intBirthYear;
		System.out.print("You are");
		System.out.print(age);
		System.out.print(" years old");
		System.out.println();
		int number = 257484;
		String stringNumber = String.valueOf(number);
		int length = stringNumber.length();
		int operate = 18;
		operate += 5;
		System.out.println("The value of operate += 5 is " + operate);
		operate -= 5;
		System.out.println("The value of operate -= 5 is " + operate);
		operate *= 5;
		System.out.println("The value of operate *= 5 is " + operate);
		operate /= 5;
		System.out.println("The value of operate /= 5 is " + operate);
		operate %= 5;
		System.out.println("The value of operate %= 5 is " + operate);
		
		double max = 16.3;
		System.out.printf("16.3 to the power of 3: %.2f\n", Math.pow(max, 3.0));
		System.out.printf("Square root of 16.3: %.14f\n", Math.sqrt(max));
		System.out.printf("16.3 multiplied by PI; %.14f\n", max * Math.PI);

		



		

		
	}
}