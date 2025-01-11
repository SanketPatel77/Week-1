import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
		// create scanner object for input
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // Array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];
        
        // If the number is 0, handle it separately
        if (number == 0) {
            frequency[0]++;
        } else {
            // Process each digit in the number
            while (number > 0) {
                int digit = number % 10;  // Extract the last digit
                frequency[digit]++;       // Increment the count of the digit
                number = number / 10;     // Remove the last digit from the number
            }
        }
        
        // Display the frequency of each digit
        System.out.println("\nFrequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
        
        input.close(); // Close the scanner
    }
}
