import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Check palindrome by comparing characters from start and end
    public static boolean isPalindromeByIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive palindrome check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Check palindrome using character arrays
    public static boolean isPalindromeByCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper method to reverse a string using charAt()
    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reversed = new char[length];

        for (int i = 0; i < length; i++) {
            reversed[i] = text.charAt(length - i - 1);
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the text
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Check palindrome using Logic 1
        boolean result1 = isPalindromeByIndexes(text);
        System.out.println("Logic 1 (Compare Start-End): " + (result1 ? "Palindrome" : "Not Palindrome"));

        // Check palindrome using Logic 2
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Logic 2 (Recursive): " + (result2 ? "Palindrome" : "Not Palindrome"));

        // Check palindrome using Logic 3
        boolean result3 = isPalindromeByCharArray(text);
        System.out.println("Logic 3 (Char Array): " + (result3 ? "Palindrome" : "Not Palindrome"));

        scanner.close();
    }
}
