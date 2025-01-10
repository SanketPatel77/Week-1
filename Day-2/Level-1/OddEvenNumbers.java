import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        // Check if the input is a natural number (positive integer)
        if (number <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            // Iterate from 1 to the entered number
            for (int i = 1; i <= number; i++) {
                // Check if the current number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }

        // Close the scanner
        input.close();
    }
}
