package divisibleints;


/**
 * Atul Rao
 * This class takes a number n as input, and returns all the numbers from 0 to n that are divisible by 3, 5, or both in a string
 */
public class DivisibleNums {
    private int num; // Variable to store the input number

    public DivisibleNums(int n) {
        num = n; // Initialize the input number
    }


    /**
     * This method gets the numbers from 1 to n that are divisible by 3, 5, or both, then adds them to strings that can be printed
     * @return divStrings, the strings to be printed
     */
    public String[] getDivisibleNumbers() {
        // Strings to store the numbers divisible by 3, 5, and both
        String divByThree = "Divided by 3 -> ";
        String divByFive = "Divided by 5 -> ";
        String divByBoth = "Divided by 3 and 5 -> ";

        // Loop through numbers from 1 to the inputted num
        for (int i = 1; i <= num; i++) {

            // Check if the number is divisible by both 3 and 5, just 3 or just 5, and then add to the string to by printed
            if (i % 3 == 0 && i % 5 == 0) {
                divByBoth = divByBoth + i + ", ";
            } 
            
            else if (i % 3 == 0) {
                divByThree = divByThree + i + ", ";
            } 
        
            else if (i % 5 == 0) {
                divByFive = divByFive + i + ", ";
            }
        }

        // Remove the trailing comma and space, and add a period at the end
        // In if statements as if there is no numbers added to the string, it will remove parts of the original
        if (divByThree.endsWith(", ")) {
            divByThree = divByThree.substring(0, divByThree.length() - 2) + ".";
        }
        if (divByFive.endsWith(", ")) {
            divByFive = divByFive.substring(0, divByFive.length() - 2) + ".";
        }
        if (divByBoth.endsWith(", ")) {
            divByBoth = divByBoth.substring(0, divByBoth.length() - 2) + ".";
        }

        // Return the results as an array of strings
        String[] divStrings = new String[]{divByThree, divByFive, divByBoth};
        return divStrings;
    }
}
