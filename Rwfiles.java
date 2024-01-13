import java.util.*;
import java.io.*;
import java.util.Scanner;

//Zach Weldon

public class RWfiles {
	public static void main(String[] args) throws IOException{
		File file = new File("numbers.txt");
		Scanner scanner = new Scanner(file);
		
		int sum = 0;
		int count = 0;
		
		while (scanner.hasNextInt()) { 
			int number = scanner.nextInt();
			sum += number;
			count++;
		}
			

		double average = (double) sum / count;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		
		PrintWriter writer = new PrintWriter("pw.txt");
			writer.println("Name: " + name);
			writer.println("Sum: " + sum);
			writer.println("Average: " + average);
			writer.close();
		
		 FileWriter fileWriter = new FileWriter("fwPw.txt", true);
		 PrintWriter printWriter2 = new PrintWriter(fileWriter);
		
		for (int i = 0; i < 3; i++) {
			 printWriter2.println("Name: " + name);
			 printWriter2.println("Sum: " + sum);
			printWriter2.println("Average: " + average);
		}
			printWriter2.close();
			fileWriter.close();
			
			PrintWriter printWriter3 = new PrintWriter(new FileWriter("pw.txt", true));
			printWriter3.println("My name is Zach Weldon");
			printWriter3.close();
			
			System.out.println("Your data has been succesfully loaded into a text file");
			System.out.println("Goodbye!");
	 }
 }

	
	