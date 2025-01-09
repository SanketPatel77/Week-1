import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number (number1): ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number (number2): ");
        int number2 = scanner.nextInt();
		
        // Swap the numbers
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Print the swapped numbers
        System.out.println("The swap numbers are " + number1 + ", and " + number2);

        // Close the scanner
        scanner.close();
    }
}
