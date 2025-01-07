package textanalyze;

import java.util.Arrays;
import java.util.HashSet;


public class TextAnalyzer extends StringAnalyzer {

    /**
     * Constructs a TextAnalyzer object with the given input string, and sends the string to StringAnalyzer.
     * @param str
     */
    public TextAnalyzer(String str) {
        super(str);
    }
    
    /**
     * Calculates the average word length in the input string.
     * @return the average word length
     */
    public double calculateAverageWordLength() {
        String[] words = this.splitString();
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        return (double) (totalLength / words.length);
    }
    
    /**
     * Removes duplicate words from the input string.
     * @return a string containing the unique words in the input string
     */
    public String[] removeDuplicates() {
        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : this.splitString()) {
            uniqueWords.add(word);
        }
        return uniqueWords.toArray(new String[0]);
    }
    
    /**
     * Prints the unique words in the input string in alphabetical order.
     */
    public void printWordsInAlphabeticalOrder() {
        String[] words = removeDuplicates();
        Arrays.sort(words);
        
        for (String word : words) {
            System.out.println(word);
        }
        
    }

    
}
