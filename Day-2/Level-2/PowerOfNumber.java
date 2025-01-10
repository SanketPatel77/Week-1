import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number and power
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

        // Variable to store the result, initialized to 1
        int result = 1;

        // Loop to compute the power of the number
        for (int i = 1; i <= power; i++) {
            result *= number; // Multiply result by number in each iteration
        }

        // Display the result
        System.out.println(number + " raised to the power of " + power + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
