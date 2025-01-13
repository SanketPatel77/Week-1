import java.util.Scanner;

public class IllegalArgumentExceptionExample {

    // Method to generate the Exception
    public static void generateException(String input) {
        System.out.println("Generating IllegalArgumentException...");
        // Use substring with start index greater than end index
        System.out.println("Substring: " + input.substring(5, 2));
    }

    // Method to handle the Exception
    public static void handleException(String input) {
        try {
            System.out.println("Handling IllegalArgumentException...");
            // Use substring with start index greater than end index
            System.out.println("Substring: " + input.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the String
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Call the method to generate the Exception
        try {
            generateException(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught Exception in generateException: " + e.getMessage());
        }

        // Call the method to handle the Exception
        handleException(userInput);

        scanner.close();
    }
}
