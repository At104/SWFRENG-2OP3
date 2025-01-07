package printtriangle;

/**
 * Atul Rao
 * This class makes the right angle triangle to output
 */
public class TriangleMaker {
    private int maxNum; // Maximum number up to which the triangle will be printed, private to prevent unintended edits

    // Constructor to initialize the number
    public TriangleMaker(int n) {
        maxNum = n;
    }

    /**
     *  Method to display the right angle triangle
     */
    public void displayTriangle() {
        String toPrint = ""; // String to accumulate the numbers to be printed
        //The loop goes until it reaches the max number, and prints out the triangle line by line
        for (int i = 1; i <= maxNum; i++) {
            toPrint += i; // Append the current number to the string
            System.out.println(toPrint); // Print the current state of the string
        }
    }
}
