import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize count to 0
        int count = 0;

        // Use a loop to count the digits
        while (number != 0) {
            // Remove the last digit from the number
            number /= 10;

            // Increase the count by 1 for each iteration
            count++;
        }

        // Display the count
        System.out.println("The number of digits is: " + count);

        // Close the scanner
        scanner.close();
    }
}
