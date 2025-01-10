import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Loop from 1 to the number to find the factors
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                System.out.println(i); // Print the factor
            }
        }

        // Close the scanner
        scanner.close();
    }
}
