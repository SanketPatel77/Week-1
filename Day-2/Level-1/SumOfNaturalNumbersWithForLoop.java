import java.util.Scanner;

public class SumOfNaturalNumbersWithForLoop {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a natural number (greater than 0): ");
        int n = scanner.nextInt();

        // Check if the input is a natural number
        if (n <= 0) {
            System.out.println("The entered number is not a natural number.");
        } else {
            // Compute the sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // Compute the sum using a for loop
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i;
            }

            // Compare the two results
            System.out.println("Sum computed using formula: " + formulaSum);
            System.out.println("Sum computed using for loop: " + loopSum);

            // Verify if both results are the same
            if (formulaSum == loopSum) {
                System.out.println("The results from both computations are correct and match!");
            } else {
                System.out.println("There is a discrepancy in the results.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
