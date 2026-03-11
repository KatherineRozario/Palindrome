
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Hardcoded string to check
        String input = "madam";
        String reversed = "";

        // Iterate from the last character to the first (as per hint)
        // We use String concatenation (+) to build the reversed string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // Compare the original and reversed strings using .equals()
        // Note: Using == would compare memory references, not content.
        if (input.equals(reversed)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

    }
}