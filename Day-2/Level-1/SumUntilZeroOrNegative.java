import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize total to 0.0
        double total = 0.0;

        // Infinite loop to take user input
        while (true) {
            // Prompt the user for input
            System.out.print("Enter a number (0 or negative number to stop): ");
            double userInput = scanner.nextDouble();

            // Check if the user entered 0 or a negative number
            if (userInput <= 0) {
                break; // Exit the loop
            }

            // Add the user input to the total
            total += userInput;
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);

        // Close the scanner object
        scanner.close();
    }
}
