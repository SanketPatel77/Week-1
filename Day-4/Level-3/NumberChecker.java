import java.util.Scanner;

public class NumberChecker {

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

        // Check if the number is a Duck number
        boolean isDuckNumber = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuckNumber);

        // Check if the number is an Armstrong number
        boolean isArmstrongNumber = isArmstrongNumber(number, digits);
        System.out.println("Is Armstrong Number: " + isArmstrongNumber);

        // Find the largest and second largest elements in the digits array
        int[] largestValues = findLargestAndSecondLargest(digits);
        System.out.println("Largest: " + largestValues[0] + ", Second Largest: " + largestValues[1]);

        // Find the smallest and second smallest elements in the digits array
        int[] smallestValues = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallestValues[0] + ", Second Smallest: " + smallestValues[1]);
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

    // Method to check if a number is a Duck number (has a non-zero digit)
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number, int[] digits) {
        int sum = 0;
        int digitCount = digits.length;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digitCount);
            temp /= 10;
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}
