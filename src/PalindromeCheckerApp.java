import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // 1. Declare and initialize the input string
        String input = "noon";

        // 2. Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // 3. Push each character of the string into the stack
        // This effectively "reverses" the string for later comparison
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // 4. Assume palindrome initially
        boolean isPalindrome = true;

        // 5. Iterate again through original string and compare with popped values
        for (char c : input.toCharArray()) {
            // pop() retrieves the top element (Last In, First Out)
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // 6. Print result in the specified format
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}