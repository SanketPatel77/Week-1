import java.util.Scanner;

public class NumberFormatExceptionExample {

    // Method to generate the Exception
    public static void generateException(String input) {
        System.out.println("Generating NumberFormatException...");
        // Attempt to parse the input string as an integer
        int number = Integer.parseInt(input);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle the Exception
    public static void handleException(String input) {
        try {
            System.out.println("Handling NumberFormatException...");
            // Attempt to parse the input string as an integer
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
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
        } catch (NumberFormatException e) {
            System.out.println("Caught Exception in generateException: " + e.getMessage());
        }

        // Call the method to handle the Exception
        handleException(userInput);

        scanner.close();
    }
}
