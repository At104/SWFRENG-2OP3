package printtriangle;

import java.util.Scanner;

/**
 * Atul Rao
 * This class takes an input n and print out a right angled triangle of the numbers from 1 to n
 */
public class App {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Read an integer input from the user
        int n = sc.nextInt();
        
        // Create a TriangleMaker object with the input number
        TriangleMaker triangle = new TriangleMaker(n);
        
        // Call the method to display the triangle
        triangle.displayTriangle();
        
        // Close the Scanner object to free up resources
        sc.close();
        
    }

    
}
