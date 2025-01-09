import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Check if the divisor is not zero
        if (number2 != 0) {
            // Calculate quotient and remainder
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Print the result
            System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + 
                               " of two numbers " + number1 + " and " + number2);
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        // Close the scanner
        scanner.close();
    }
}
