import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    // Method to generate a random guess within the range
    public static int generateGuess(int low, int high) {
        return low + new Random().nextInt(high - low + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize range
        int low = 1, high = 100;
        boolean found = false;

        System.out.println("Think of a number between 1 and 100. I will try to guess it!");

        while (!found) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (Enter: 'high', 'low', 'correct'):");
            String feedback = scanner.next();

            switch (feedback.toLowerCase()) {
                case "high":
                    high = guess - 1; // Reduce upper bound
                    break;
                case "low":
                    low = guess + 1; // Increase lower bound
                    break;
                case "correct":
                    System.out.println("Yay! I guessed your number correctly.");
                    found = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'high', 'low', or 'correct'.");
            }
        }
        scanner.close();
    }
}
