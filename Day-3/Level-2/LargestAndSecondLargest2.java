import java.util.Scanner;

class LargestAndSecondLargest2 {
    public static void main(String[] args) {
		// create scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

		int maxDigit = 10;  // Initial maximum size of the array
        int[] digits = new int[maxDigit]; // Array to store the digits
        int index = 0;
		
		 while (number != 0) {
            // Check if the index has reached the current max size of the array
            if (index == maxDigit) {
                // Increase the array size by 10 when the array is full
                maxDigit += 10;

                // Create a temporary array with the new size
                int[] temp = new int[maxDigit];

                // Copy elements from the old array to the temporary array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign the temporary array back to the original digits array
                digits = temp;
            }
			 digits[index++] = number % 10;
			 number /= 10;
		 }
		
		// Find the largest and second largest digits
        int largest = 0, secondLargest = 0;
		
		// Loop through the digits array to find the largest and second largest numbers
        for (int i = 0; i < index; i++) {
            // Update the largest and second largest
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
