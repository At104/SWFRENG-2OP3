package textanalyze;

import java.util.HashMap;


//Applies the open/closed principle by since the StringAnalyzer class is open for extension but closed for modification.
public class StringAnalyzer {
    // The StringCleaner class is used to clean the input string before analyzing it
    private StringCleaner cleaner;
    private String str;
    public StringAnalyzer(String str) {
        this.cleaner = new StringCleaner();
        this.str = cleaner.cleanString(str);
    }


    public String getString() {
        return str;
    }
    
    public String[] splitString() {
        return getString().split(" ");
    }

    /**
     * Calculates the frequency of each word in the cleaned string.
     * @param str the input string
     * @return a map where the keys are words and the values are the number of times each word appears
     */
    public HashMap<String, Integer> wordFrequencyCount() {
        // Clean the string by removing punctuation, converting to lowercase, and removing extra spaces

        String[] words = splitString();

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }

    /**
     * Finds the longest word in the cleaned string.
     * @param str the input string
     * @return the longest word
     * @throws ArithmeticException if the string is empty
     */
    public String findLongestWord() {
        
        if (str.isEmpty()) {
            throw new ArithmeticException("String is empty after cleaning.");
        }
        // Split the cleaned string into words
        String[] words = splitString();
        String longestWord = "";

        // Find the longest word by comparing the length of each word
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

    public String removeAllSpaces(){
        return str.replaceAll(" ", "");
    }

    /**
     * Checks if the cleaned string is a palindrome.
     * @param str the input string
     * @return true if the string is a palindrome, false otherwise
     * @throws ArithmeticException if the string is empty
     */
    public boolean isPalindrome() {
        String newStr = removeAllSpaces();
        if (newStr.isEmpty()) {
            throw new ArithmeticException("The input string is empty after cleaning.");
        }

        // Check if the string is a palindrome by comparing characters from the start and end
        int len = newStr.length();
        for (int i = 0; i < len / 2; i++) {
            if (newStr.charAt(i) != newStr.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }

    

    
}