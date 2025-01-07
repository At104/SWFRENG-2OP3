package octalconversion;

import java.util.Scanner;
/**
 * Atul Rao
 * This class takes a base-10 (decimal) number as an input and outputs a base-8 number (octal) number
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner for input
        int x = sc.nextInt(); //Gets the inputted integer
        //Make an instance of the converter class, and passes in the integer
        Conversion converter = new Conversion(x);
        // Convert the decimal number to octal using its method
        int y = converter.decimalToOctal();
        //Display the converted number and close the scanner
        System.out.println(y);
        sc.close();
    }
}
