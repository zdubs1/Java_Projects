import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExamGrading {
    public static void main(String[] args) {
        // Populate test3Answers array
        char[] test3Answers = new char[50];
        try {
            Scanner inFile = new Scanner(new File("test3_Answers.txt"));
            int index = 0;
            while (inFile.hasNext()) {
                test3Answers[index] = inFile.nextLine().charAt(0);
                index++;
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        // Evaluate student1's exam
        char[] student1 = {'A', 'B', 'D', 'D', 'D', 'C', 'C', 'A', 'B', 'B', 'C', 'A', 'A', 'D'};
        int numCorrect = 0;
        for (int i = 0; i < student1.length; i++) {
            if (student1[i] == test3Answers[i]) {
                numCorrect++;
            }
        }

        // Output results
        System.out.println("Student1 got " + numCorrect + " questions correct.");
        if (numCorrect >= 21) {
            System.out.println("Student1 passed the exam.");
        } else {
            System.out.println("Student1 did not pass the exam.");
        }
    }
}
