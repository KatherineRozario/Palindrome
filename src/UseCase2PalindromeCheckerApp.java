public class UseCase2PalindromeCheckerApp {
    // Main Method: The entry point of your application
    public static void main(String[] args) {

        // String Literal: Stored in the String constant pool
        String original = "madam";
        String reverse = "";

        // Logic to reverse the string
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        // Conditional Statement: Checking if original equals reverse
        if (original.equals(reverse)) {
            // Console Output
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}