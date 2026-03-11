
public class PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String input = "madam";

        // Start recursion with the first and last index
        boolean isPalindrome = check(input, 0, input.length() - 1);

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }


    private static boolean check(String s, int start, int end) {
        // Base Condition: If pointers cross or meet, all matches were successful
        if (start >= end) {
            return true;
        }

        // Compare characters at current outer positions
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call: Move inward by incrementing start and decrementing end
        return check(s, start + 1, end - 1);
    }
}