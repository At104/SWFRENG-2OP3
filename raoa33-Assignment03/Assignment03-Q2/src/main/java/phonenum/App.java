package phonenum;

import java.util.Scanner;

/**
 * Atul Rao
 * This class takes a phone number with letters as an input, then passes it to another class to convert it to a phone number
 * with just digits
 */
public class App {

    // Main method to handle user input and display the output
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Read the phone number input from the user
        String phoneNumber = sc.nextLine();

        // Create a Translate object then use it to convert the phone number with letters to digits, 
        Translate translator = new Translate(phoneNumber);
        String translatedPhoneNumber = translator.translatePhoneNumber();

        // Print the translated phone number
        System.out.println("The phone number for " + phoneNumber + " is " + translatedPhoneNumber + ".");

        // Close the Scanner
        sc.close();
    }

}
