import java.util.Scanner;

public class MultiplesOfNumber {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Loop from 100 to 1 to find the multiples of the number
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            // Check if i is a multiple of the number
            if (i % number == 0) {
                System.out.println(i); // Print the multiple
            }
        }

        // Close the scanner
        scanner.close();
    }
}
