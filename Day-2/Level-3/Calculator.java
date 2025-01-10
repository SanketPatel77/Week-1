import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Declare variables for input
        double first, second;
        String op;

        // Get the user input for numbers and operator
        System.out.print("Enter the first number: ");
        first = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        second = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        op = scanner.next();

        // Initialize result variable
        double result = 0;

        // Use switch case to perform operations based on the operator
        switch(op) {
            case "+":
                result = first + second;
                System.out.println("The result of addition is: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("The result of subtraction is: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("The result of multiplication is: " + result);
                break;

            case "/":
                // Check for division by zero
                if (second != 0) {
                    result = first / second;
                    System.out.println("The result of division is: " + result);
                } else {
                    System.out.println("Error! Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator. Please use one of +, -, *, /.");
        }

        // Close the scanner
        scanner.close();
    }
}
