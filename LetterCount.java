public class LetterCount {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'e', 'i', 'k', 'm', 'o', 'u'};

        // Initialize counters for vowels and consonants
        int numVowels = 0;
        int numConsonants = 0;

        // Traverse the letters array and count the number of vowels and consonants
        for (char letter : letters) {
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                numVowels++;
            } else {
                numConsonants++;
            }
        }

        // Output the results
        System.out.println("Number of vowels: " + numVowels);
        System.out.println("Number of consonants: " + numConsonants);
    }
}
