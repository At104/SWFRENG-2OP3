package circle;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Atul Rao:
 * This class contains functions to find the area and circumference of a circle, and returns them
 */
public class App {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console, and get radius from user
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        
        // Create a DecimalFormat object to format the output to 2 decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        
        // Close the scanner
        sc.close();
        
        //Create an instance of the circle class, and pass radius as a parameter
        Circle circle = new Circle(radius);

        // Get the area and circumference of the circle using the functions, and apply the decimal format to them
        String area = df.format(circle.findArea());
        String circumference = df.format(circle.findCircumference());

        // Print the final values
        System.out.println(area);
        System.out.println(circumference);
    }
    
    
}

