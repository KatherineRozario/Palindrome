
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Define the input string
        String input = "radar";

        // Create an instance (Object) of the service class
        PalindromeService service = new PalindromeService();

        // Use the object to check for a palindrome
        boolean isPalindrome = service.checkPalindrome(input);

        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

/**
 * Service class that contains palindrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        // Initialize pointers as per the hint
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }

        return true; // Is a palindrome
    }
}