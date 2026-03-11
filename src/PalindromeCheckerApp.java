
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "A man a plan a canal Panama".replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Instantiate the strategy we want to test
        PalindromeStrategy stackStrategy = new StackStrategy();

        // 1. Capture start time in nanoseconds
        long startTime = System.nanoTime();

        // 2. Execute the algorithm
        boolean result = stackStrategy.check(input);

        // 3. Capture end time
        long endTime = System.nanoTime();

        // 4. Calculate duration
        long duration = (endTime - startTime);

        // Display benchmarking results
        System.out.println("--- Benchmarking Result ---");
        System.out.println("Algorithm : Stack-Based Strategy");
        System.out.println("Input     : " + input);
        System.out.println("Result    : " + (result ? "Palindrome" : "Not Palindrome"));
        System.out.println("Execution Time: " + duration + " nanoseconds");
    }
}

/** * Reusing the Interface from UC12
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/** * Reusing StackStrategy from UC12
 */
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean check(String input) {
        java.util.Stack<Character> stack = new java.util.Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}