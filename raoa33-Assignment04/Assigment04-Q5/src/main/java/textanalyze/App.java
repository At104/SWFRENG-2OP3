package textanalyze;

/**
 * Test the TextAnalyzer class
 */
public class App {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";
        try {
            TextAnalyzer analyzer = new TextAnalyzer(input);
       
            double averageWordLength = analyzer.calculateAverageWordLength();
            System.out.println("Average word length: " + averageWordLength);


            System.out.println("Words in alphabetical order:");
            analyzer.printWordsInAlphabeticalOrder();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        
    }
}
