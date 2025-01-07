package octalconversion;

import java.util.ArrayList;
import java.util.Collections;

/**
 * The Conversion class provides a method to convert a decimal number to its octal representation.
 */
public class Conversion {
    private int numToConvert; //Private int for encapsulation and preventing unintended modifications

    // Class Constructor to take input
    public Conversion(int x) {
        numToConvert = x;
    }
    /**
     * A function to convert a decimal number to octal
     * @return octalNum, the converted number
     */
    public int decimalToOctal() {
        int octalNum; // int to be returned

        ArrayList<String> octalDigits = new ArrayList<>(); // List to store octal digits
        boolean sign = numToConvert < 0; // Check if the number is negative
        numToConvert = Math.abs(numToConvert); // Convert number to positive for processing


        //The routine gets the remainder of the decimal number, which will be a digit in the octal number
        //It then divides continously until the quotient is less than 0, repeatedly getting the numbers
        while (numToConvert > 0) {
            int remainder = numToConvert % 8; // Get the remainder when divided by 8
            octalDigits.add(Integer.toString(remainder)); // Add remainder to the list
            numToConvert /= 8; // Update number by dividing by 8
        }
        // Reverse the list to get the correct order, as the last digit converted will be the first digit of the octal number
        Collections.reverse(octalDigits); 

        String octalString = ""; // String to store the octal number
        for (String digit : octalDigits) {
            octalString += digit; // Append each digit to the string
        }

        octalNum = Integer.parseInt(octalString); // Convert the string to an integer
        
        if (sign) {
            octalNum *= -1; // If the original number was negative, make the octal number negative
        }

        return octalNum; 
    }
}

