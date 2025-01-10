import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Variable to store the greatest factor, starting with 1 (smallest possible factor)
        int greatestFactor = 1;

        // Loop from number-1 to 1 to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                greatestFactor = i; // Update greatestFactor
                break; // Exit the loop once we find the greatest factor
            }
        }

        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " (beside itself) is: " + greatestFactor);

        // Close the scanner
        scanner.close();
    }
}
