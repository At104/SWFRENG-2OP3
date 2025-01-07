package textanalyze;

public class StringCleaner {

    /**
     * Removes all punctuation characters from the given string.
     * @param str the input string
     * @return the string without punctuation
     */
    public String removePunctuation(String str) {
        return str.replaceAll("[\\p{Punct}]", "");
    }

    /**
     * Converts the entire string to lowercase.
     * @param str the input string
     * @return the string in lowercase
     */
    public String convertToLowercase(String str) {
        return str.toLowerCase();
    }

    /**
     * Removes leading, trailing, and extra spaces between words in the string.
     * @param str the input string
     * @return the string with extra spaces removed
     */
    public String removeExtraSpaces(String str) {
        return str.trim().replaceAll(" ", " ");
    }

    public String cleanString(String str) {
        return removeExtraSpaces(convertToLowercase(removePunctuation(str)));
    }
   
}