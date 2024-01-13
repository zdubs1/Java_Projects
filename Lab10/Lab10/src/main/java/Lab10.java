import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Lab10 {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("BaseballNums.txt");
        Scanner scan = new Scanner(file);



        int[] numbers = new int[37];
        int count = 0;
        while (scan.hasNextInt()){
            numbers[count] = scan.nextInt();
                count++;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number of baseballs: " + numbers[i]);
            count++;
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Total number of baseball scores: " + sum);

        int counts = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                counts++;
            }
        }
        System.out.println("Total number of odd numbers: " + counts);
        String[] words = {"Baseball", "Ole Miss", "Football", "Computer Science", "Stadium", "The Grove", "Oxford", "Mississippi",
                "Rainy Mondays", "Boure Burgers", "Ajax", "Swayze"};

        for (int j = 0; j < words.length; j++) {
            System.out.println("The length of the word " + words[j] + " is: " + words[j].length());
        }
        double[] arrayNumber1 = new double[20];
        for (int k = 0; k < 20; k++) {
            arrayNumber1[k] = k * 0.282;
        }

        for (int I = 0; I < arrayNumber1.length; I++) {
            System.out.println(arrayNumber1[I]);
        }
    }
}



