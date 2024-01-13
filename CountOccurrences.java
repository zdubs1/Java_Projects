import java.util.Random;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] fifty = new int[50];
        Random gen = new Random();
        int num;

        // Generate 235 random numbers and count occurrences
        for (int i = 0; i < 235; i++) {
            num = gen.nextInt(50);
            fifty[num]++;
        }

        // Output the results of the fifty array
        for (int i = 0; i < fifty.length; i++) {
            System.out.println("Number " + i + " occurs " + fifty[i] + " times.");
        }
    }
}
