package divisibleints;

import java.util.Scanner;

/**
 * Atul Rao
 * This class takes a number n as input, and displays all the numbers from 0 to n that are divisible by 3,5 or both
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Scanner for input
        int n = sc.nextInt(); //Gets the inputted integer
        //Make an instance of the DivisibleNums class, and passes in the integer
        DivisibleNums nums = new DivisibleNums(n);

        //Gets the list of divisible numbers as an array, then print them out
        String[] listOfNums = nums.getDivisibleNumbers();
        for (String display: listOfNums) {
            System.out.println(display);
        }

        sc.close(); //Close the scanner 
    }
}