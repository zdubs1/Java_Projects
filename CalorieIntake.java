import java.util.Scanner;

public class CalorieIntake {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your weight in pounds: ");
    double weight = input.nextDouble();
    System.out.print("Enter your height in inches: ");
    double height = input.nextDouble();
    System.out.print("Enter your age in years: ");
    int age = input.nextInt();
    System.out.print("Enter your gender (M/F): ");
    char gender = input.next().charAt(0);
    double bmr;
    if (gender == 'M' || gender == 'm') {
      bmr = 66 + (6.23 * weight) + (12.7 * height) - (6.8 * age);
    } else {
      bmr = 655 + (4.35 * weight) + (4.7 * height) - (4.7 * age);
    }
    System.out.println("Your recommended daily calorie intake is: " + (int)(bmr * 1.2) + " calories");
  }
}


