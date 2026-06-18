import java.util.Random;

public class SurveyAnalyzer {

    public static void main(String[] args) {

        int[] responses = new int[50]; // 50 survey responses
        int[] freq = new int[6];       // index 0 unused; we only care about 1-5

        Random rand = new Random();

        // Simulate 50 random responses between 1 and 5
        for (int i = 0; i < responses.length; i++) {
            responses[i] = rand.nextInt(5) + 1; // generates 1 to 5
        }

        // Count how many times each rating (1-5) appears
        for (int r : responses) {
            freq[r]++;
        }

        // Print the results
        System.out.println("--- Survey Results ---");
        for (int rating = 1; rating <= 5; rating++) {
            System.out.println("Rating " + rating + ": " + freq[rating] + " response(s)");
        }
    }
}