public class ScoreStatistics {
    public static void main(String[] args) {
        int[] scores = {75, 82, 90, 65, 72, 88, 91, 68};

        // Determine the average score in the scores array
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / scores.length;
        System.out.println("Average score: " + average);

        // Traverse the scores array again and determine how many scores are above and below the average
        int numAboveAverage = 0;
        int numBelowAverage = 0;
        for (int score : scores) {
            if (score > average) {
                numAboveAverage++;
            } else if (score < average) {
                numBelowAverage++;
            }
        }
        System.out.println("Number of scores above average: " + numAboveAverage);
        System.out.println("Number of scores below average: " + numBelowAverage);
    }
}
