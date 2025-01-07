package quadratic;

/**
 * Atul Rao
 * This class takes the inputs a,b and c of a quadratic equation, and solves it
 */
public class Equation {

    // Coefficients of the quadratic equation
    // Are private and final to prevent unintentional data modification
    private final int a, b, c;

    // Constructor to initialize the coefficients
    public Equation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method to solve the quadratic equation and return the roots as a formatted string
    */
    public String solveQuadratic() {
         // The discriminant is used to determine the number of solutions of a quadratic equation
        double discriminant = (Math.pow(b, 2)) - (4 * a * c);
        // > 0 means 2 solutions
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a); //Do the quadratic formula to get the roots
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            // Return with string formatting to 2 decimal places
            return String.format("For a=%d, b=%d and c=%d, the roots are %.2f and %.2f", a, b, c, root1, root2); 
        }
        // Exactly 0 means one solution
        else if (discriminant == 0) {
            double root = -b / (2.0 * a); //Since the number under the sqrt is 0, it does not need to be in the equation
            return String.format("For a=%d, b=%d and c=%d, the root is %.2f", a, b, c, root);
        } 
        else { // When the discriminant is negative, there are no roots
            return "The equation has no real roots";
        }

    }

}
