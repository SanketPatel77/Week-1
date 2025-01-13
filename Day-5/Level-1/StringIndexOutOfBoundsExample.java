import java.util.Scanner;

public class StringIndexOutOfBoundsExample {

    // Method to generate the Exception
    public static void generateException(String input) {
        System.out.println("Generating StringIndexOutOfBoundsException...");
        // Access an index beyond the length of the String
        System.out.println("Character at position " + input.length() + ": " + input.charAt(input.length()));
    }

    // Method to handle the Exception
    public static void handleException(String input) {
        try {
            System.out.println("Handling StringIndexOutOfBoundsException...");
            // Access an index beyond the length of the String
            System.out.println("Character at position " + input.length() + ": " + input.charAt(input.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
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
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception in generateException: " + e.getMessage());
        }

        // Call the method to handle the Exception
        handleException(userInput);

        scanner.close();
    }
}
