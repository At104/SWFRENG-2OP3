package quadratic;
import java.util.Scanner;

/**
 * Atul Rao
 * This class takes the inputs a,b and c of a quadratic equation, passes it to another class and returns the roots
 */
public class App {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);
        
        // Read integer inputs for the coefficients a, b, and c of the quadratic equation
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Create an Equation object with the coefficients a, b, and c
        Equation solver = new Equation(a, b, c);
        
        // Solve the quadratic equation and print the result
        String result = solver.solveQuadratic();
        System.out.println(result);
        
        // Close the Scanner object to free up resources
        sc.close();
        }

      

    }

