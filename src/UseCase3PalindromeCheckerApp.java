public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args){
// Data Structure: String
        String original = "radar";
        String reversed = ""; // Initially empty

        // Key Concept: Loop (for loop)
        // We start from the last character and move to the first
        for (int i = original.length() - 1; i >= 0; i--) {
            // Key Concept: String Concatenation (+)
            // Since Strings are Immutable, this creates a new object in each iteration
            reversed = reversed + original.charAt(i);
        }

        // Key Concept: equals() Method
        // Compares actual content ("radar" vs "radar") rather than memory address
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}