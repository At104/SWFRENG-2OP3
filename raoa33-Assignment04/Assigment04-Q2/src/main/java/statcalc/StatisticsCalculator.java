package statcalc;

import java.text.DecimalFormat;
import java.util.Arrays;

public class StatisticsCalculator {
    // Initialize instance variables, private to prevent direct access
    private int[] numbers;
    private DecimalFormat decimalFormat = new DecimalFormat("#.00");

    /**
     * Constructor to initialize the array of numbers
     * @param numbers the array of numbers to be used for calculations
     */
    public StatisticsCalculator(int[] numbers) {
        // Check if the array is null or empty and throw an exception
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Invalid input. Array cannot be null or empty.");
        } else {
            this.numbers = numbers;
        }
    }
    /**
     * Calculate the average of the numbers in the array
     * @return the average of the numbers in the array formatted to 2 decimal places
     */
    public double calculateAverage() {
        // Check if the array is empty and throw an exception
        if (numbers.length == 0) {
            throw new ArithmeticException("Array is empty. Cannot perform operation.");
        }
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.length;
        return Double.parseDouble(decimalFormat.format(average));
    }
    /**
     * Calculate the median of the numbers in the array
     * @return the median of the numbers in the array formatted to 2 decimal places
     */
    public double calculateMedian() {
        
        if (numbers.length == 0) {
            throw new ArithmeticException("Array is empty. Cannot perform operation.");
        }
        // Sort the array
        int[] sortedNumbers = sortArray();
        int middle = sortedNumbers.length / 2;

        // Check if the array has an even number of elements and calculate the median accordingly
        if (sortedNumbers.length % 2 == 0) {
            return (sortedNumbers[middle - 1] + sortedNumbers[middle]) / 2.0;
        } 
        else {
            return sortedNumbers[middle];
        }
    } 

    /**
     * Calculate the mode of the numbers in the array
     * @param newNumbers
     */
    public void updateArray(int[] newNumbers) {
        if (newNumbers == null || newNumbers.length == 0) {
            throw new IllegalArgumentException("Invalid input. Array cannot be null or empty.");
        } else {
            this.numbers = newNumbers;
        }
    }
    /**
     * Calculate the mode of the numbers in the array
     * @return the mode of the numbers in the array without editing the array
     */
    public int[] getNumbers() {
        return Arrays.copyOf(numbers, numbers.length);
    }
    
    /**
     * Sorts the array in ascending order 
     * @return the sorted array of numbers
     */
    private int[] sortArray() {
        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sortedNumbers);
        return sortedNumbers;
    }
}