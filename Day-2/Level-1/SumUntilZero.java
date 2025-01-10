import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;

        // Prompt the user for the first input
        System.out.print("Enter a number (or 0 to stop): ");
        double userInput = scanner.nextDouble();

        // While loop continues until the user enters 0
        while (userInput != 0) {
            // Add the user input to the total
            total += userInput;

            // Prompt the user for the next input
            System.out.print("Enter another number (or 0 to stop): ");
            userInput = scanner.nextDouble();
        }

        // Display the total
        System.out.println("The total sum is: " + total);

        // Close the scanner object
        scanner.close();
    }
}
