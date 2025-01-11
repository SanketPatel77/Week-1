import java.util.Scanner;

class LargestAndSecondLargest {
    public static void main(String[] args) {
		// create scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an array to store the digits and initialize variables
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        //  Extract digits from the number and store them in the array
        while (number != 0) {
            if (index == maxDigit) {
                System.out.println("Maximum digit limit reached; remaining digits ignored.");
                break;
            }
            digits[index++] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
        }

        // Find the largest and second largest digits
        int largest = 0, secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
		
		// close Scanner object
		scanner.close();
    }
}
