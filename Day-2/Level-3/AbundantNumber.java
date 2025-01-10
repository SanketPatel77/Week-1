import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize sum to 0
        int sum = 0;

        // Run a for loop from 1 to less than the number
        for (int i = 1; i < number; i++) {
            // Check if i is a divisor of number
            if (number % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        // Check if the sum of divisors is greater than the number itself
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        // Close the scanner
        scanner.close();
    }
}
