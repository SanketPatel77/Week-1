import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the count of digits in the number
        int tempNumber = number;
        int digitCount = 0;

        // Count the digits
        while (tempNumber != 0) {
            tempNumber /= 10;
            digitCount++;
        }

        // Create an array to store the digits
        int[] digits = new int[digitCount];

        // Store the digits of the number in the array
        tempNumber = number;
        for (int i = digitCount-1; i >= 0; i--) {
            digits[i] = tempNumber % 10; // Get the last digit
            tempNumber /= 10; // Remove the last digit
        }

        // Display the array in reverse order
        System.out.print("Reversed number: ");
        for (int i = digitCount-1; i >= 0; i--) {
            System.out.print(digits[i]);
        }

        scanner.close(); // scanner object closed
    }
}
