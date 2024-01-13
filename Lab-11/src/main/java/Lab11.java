
import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {
        System.out.println("Welcome to MadLibs!");

        String phrase = "";


        phrase += "The Computer Science Department at Ole Miss is <adj1>. ";
        phrase += "\nThere are a lot of smart <pn1> and professors. ";
        phrase += "\nSometimes, when I want help on my <n1>, I can <verb> a <n2>. ";
        phrase += "\nIn fact, the lab TA’s are my <adj2> friends. ";
        phrase += "\nWhen I graduate, I know I will find many great <pn2>.";


        Scanner scan = new Scanner(System.in);


        System.out.print("Enter an adjective: ");
        String adj1 = scan.nextLine();


        System.out.print("Enter a plural noun: ");
        String pn1 = scan.nextLine();


        System.out.print("Enter a verb: ");
        String verb = scan.nextLine();


        System.out.print("Enter a noun: ");
        String n1 = scan.nextLine();


        System.out.print("Enter another noun: ");
        String n2 = scan.nextLine();


        System.out.print("Enter another adjective: ");
        String adj2 = scan.nextLine();


        System.out.print("Enter another plural noun: ");
        String pn2 = scan.nextLine();


        String phrase2 = phrase.replace("<adj1>", adj1);


        String phrase3 = phrase2.replace("<pn1>", pn1);


        String phrase4 = phrase3.replace("<n1>", n1);
        String phrase5 = phrase4.replace("<verb>", verb);
        String phrase6 = phrase5.replace("<n2>", n2);
        String phrase7 = phrase6.replace("<adj2>", adj2);
        String phrase8 = phrase7.replace("<pn2>", pn2);


        System.out.println(phrase8);
    }
}
