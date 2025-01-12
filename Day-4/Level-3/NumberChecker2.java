import java.util.Scanner;

public class NumberChecker2 {

    public static void main(String[] args) {
        // create scanner object
		Scanner scanner = new Scanner(System.in);
		
		// input from user
		System.out.println("Enter number");
        int number = scanner.nextInt();

        // Find the count of digits in the number
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Store digits in an array
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Find the sum of digits
        int sumOfDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);

        // Find the sum of squares of digits
        double sumOfSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if the number is a Harshad number
        boolean isHarshadNumber = isHarshadNumber(number, sumOfDigits);
        System.out.println("Is Harshad Number: " + isHarshadNumber);

        // Find the frequency of each digit
        int[][] digitFrequency = findDigitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int[] frequency : digitFrequency) {
            System.out.println("Digit " + frequency[0] + ": " + frequency[1] + " times");
        }
    }

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);  // Square the digit
        }
        return sum;
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit
    public static int[][] findDigitFrequency(int[] digits) {
        int[] frequency = new int[10];  // Array to hold the frequency of each digit (0-9)
        
        // Count the frequency of each digit
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Prepare the 2D array to store digit and its frequency
        int[][] digitFrequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                digitFrequency[i][0] = i;
                digitFrequency[i][1] = frequency[i];
            }
        }

        // Return only non-zero frequencies
        int nonZeroCount = 0;
        for (int i = 0; i < 10; i++) {
            if (digitFrequency[i][1] > 0) {
                nonZeroCount++;
            }
        }

        int[][] result = new int[nonZeroCount][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (digitFrequency[i][1] > 0) {
                result[index++] = digitFrequency[i];
            }
        }

        return result;
    }
}
