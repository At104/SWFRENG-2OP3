package stranalyze;



/**
 * Test the StringAnalyzer class
 */
public class App {
    public static void main(String[] args) {
        try {
            String input = "A man, a plan, a canal, Panama";
            StringAnalyzer analyzer = new StringAnalyzer(input);

            System.out.println("Word Frequency Count: " + analyzer.wordFrequencyCount());
            System.out.println("Longest Word: " + analyzer.findLongestWord());
            System.out.println("Is Palindrome: " + analyzer.isPalindrome());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
}
