package statcalc;

/**
 * Main class to demonstrate the use of the StatisticsCalculator class
 * Atul Rao, 2024
 */
public class App {
    public static void main(String[] args) {
        try {
            int[] data = {10,20,30,40,50};
            StatisticsCalculator calculator = new StatisticsCalculator(data);

            System.out.println("Average: " + calculator.calculateAverage());
            System.out.println("Median: " + calculator.calculateMedian());

            int[] emptyData = {};
            calculator.updateArray(emptyData);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
