package game;
import java.util.Random;
import java.util.Scanner;


/**
 * Atul Rao
 * This class creates a game where the user has to guess a number between -100 and 100 within 10 attempts
 */
public class App {
    // Private final variables to prevent unintented modifications
    private static final int maxGuessAttempts = 10; // Maximum allowed guesses
    private static final int minVal = -100; // Minimum value for random number
    private static final int maxVal = 100; // Maximum value for random number

    public static void main(String[] args) {
        // Create a random number between min and max value
        Random random = new Random();
        int numberToGuess = random.nextInt(maxVal - minVal + 1) + minVal;

        // Initialize scanner for user input
        Scanner scanner = new Scanner(System.in);

   
        int attempts = 0; //To track number of attempts

        // Loop until the user has exhausted the maximum number of attempts
        while (attempts < maxGuessAttempts) {
            // Read the user's guess from the input
            System.out.println("Attempts Remaining: " + (maxGuessAttempts - attempts));
            int userGuess = scanner.nextInt();

            // Check if the user's guess is greater than the number to guess
            if (userGuess > numberToGuess) {
                System.out.println("The number is lower than " + userGuess + ". Guess again!");
                attempts++; // Increment the number of attempts
            }
            // Check if the user's guess is less than the number to guess
            else if (userGuess < numberToGuess) {
                System.out.println("The number is higher than " + userGuess + ". Guess again!");
                attempts++;
            }
            // The user guessed the correct number
            else {
                System.out.println("You successfully guessed the number!");
                break; // Exit the loop since number was correctly guessed
            }
        }

        // If the user has exhausted the maximum number of attempts, end the game
        if (attempts == maxGuessAttempts) {
            System.out.println("You have exhausted your trials");
        }

        // Close the scanner to free up resources
        scanner.close();
    }
}
