package strclean;

/**
 * Test the StringCleaner class
 */
public class App {
    public static void main(String[] args) {
        StringCleaner cleaner = new StringCleaner();
        String text = "     Hello, World! How's It going?   ";
        String cleanedText = cleaner.cleanString(text);
        System.out.println("Cleaned Text: "+cleanedText);
    }
}
