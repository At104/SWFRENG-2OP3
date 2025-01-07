package phonenum;


/**
 * Atul Rao
 * This class takes the phone number from App and converts it to a phone number with just numbers, and sends it back
 */
public class Translate {

    //The phone number that will be used throughout this class
    private String phoneNumber;

    // Constructor to initialize the new Translate object with the specified phone number.
    public Translate(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * Method to translate the alphabet characters to the number versions
     */ 
    public String translatePhoneNumber() {
        //String buffer to prevent unneccesary creation of new objects
        StringBuffer newPhoneNumber = new StringBuffer();

        // Loop through each character in the phone number
        for (char i : phoneNumber.toCharArray()) {
            if (Character.isLetter(i)) {
                // Append the corresponding number for each letter
                newPhoneNumber.append(getNumberForLetter(Character.toUpperCase(i)));
            } else {
                // Add any normal digits or - (non letter characters)
                newPhoneNumber.append(i);
            }
        }

        return newPhoneNumber.toString();
    }

    /**
     * Encapsulated (private) method to change letters into number
     * @param char letter
     */ 
    private static int getNumberForLetter(char letter) {
        //Utilize a switch case that accounts for every letter, and gives its respective number equivalent
        //Switch cases are more effecient for characters and integers, and gives better formatting to this method
        switch (letter) {
            case 'A':
            case 'B':
            case 'C':
                return 2; // A, B, C -> 2
            case 'D':
            case 'E':
            case 'F':
                return 3; // D, E, F -> 3
            case 'G':
            case 'H':
            case 'I':
                return 4; // G, H, I -> 4
            case 'J':
            case 'K':
            case 'L':
                return 5; // J, K, L -> 5
            case 'M':
            case 'N':
            case 'O':
                return 6; // M, N, O -> 6
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return 7; // P, Q, R, S -> 7
            case 'T':
            case 'U':
            case 'V':
                return 8; // T, U, V -> 8
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                return 9; // W, X, Y, Z -> 9
            default:
                return -1; // Invalid input
        }
    }
}
