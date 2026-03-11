import java.util.ArrayDeque;
import java.util.Deque;


public class PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "refer";

        // Create a Deque to store characters
        // ArrayDeque is a highly efficient implementation of the Deque interface
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        // If 0 or 1 element is left, it's naturally a palindrome
        while (deque.size() > 1) {
            // Remove from both ends and compare
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}