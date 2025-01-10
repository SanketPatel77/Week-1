import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take the number input from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize the boolean variable isPrime
        boolean isPrime = true;

        // Check if the number is greater than 1
        if (number > 1) {
            // Loop from 2 to the number - 1 to check divisibility
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    // If divisible, set isPrime to false and break the loop
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        }

        // Output the result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        // Close the scanner
        scanner.close();
    }
}
