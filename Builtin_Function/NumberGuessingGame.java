import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {

    private static final int MIN_RANGE = 1;
    private static final int MAX_RANGE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = MIN_RANGE;
        int max = MAX_RANGE;
        boolean isCorrect = false;

        System.out.println("Think of a number between " + MIN_RANGE + " and " + MAX_RANGE + ".");
        System.out.println("I will try to guess it. Respond with 'high', 'low', or 'correct'.");

        while (!isCorrect) {
            int guess = generateGuess(min, max, random);
            System.out.println("My guess is: " + guess);

            String feedback = getFeedback(scanner);
            isCorrect = updateRange(feedback, guess, min, max);

            if (!isCorrect) {
                System.out.println("Updated range: " + min + " to " + max);
            }
        }

        System.out.println("Yay! I guessed your number correctly.");
        scanner.close();
    }

    /**
     * Generates a random guess within the current range.
     * @param min the minimum value of the range
     * @param max the maximum value of the range
     * @param random the Random object for generating numbers
     * @return a random integer between min and max inclusive
     */
    public static int generateGuess(int min, int max, Random random) {
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * Receives user feedback on the guess.
     * @param scanner the Scanner object for reading input
     * @return the user's feedback as a string ("high", "low", or "correct")
     */
    public static String getFeedback(Scanner scanner) {
        String feedback;
        do {
            System.out.print("Is my guess high, low, or correct? ");
            feedback = scanner.nextLine().toLowerCase().trim();
        } while (!feedback.equals("high") && !feedback.equals("low") && !feedback.equals("correct"));
        return feedback;
    }

    /**
     * Updates the guessing range based on user feedback.
     * @param feedback the user's feedback
     * @param guess the computer's guess
     * @param min the current minimum range (passed by reference via array)
     * @param max the current maximum range (passed by reference via array)
     * @return true if the guess was correct, false otherwise
     */
    public static boolean updateRange(String feedback, int guess, int min, int max) {
        switch (feedback) {
            case "high":
                max = guess - 1;
                break;
            case "low":
                min = guess + 1;
                break;
            case "correct":
                return true;
        }
        return false;
    }
}
