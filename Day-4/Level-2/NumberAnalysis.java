import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
		// create scanner object
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Analyze each number
        for (int number : numbers) {
            if (isPositive(number)) {
                System.out.print(number + " is Positive ");
                if (isEven(number)) {
                    System.out.println("and Even.");
                } else {
                    System.out.println("and Odd.");
                }
            } else {
                System.out.println(number + " is Negative.");
            }
        }

        // Compare the first and last elements
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("Comparison of first and last elements: ");
        if (comparisonResult == 1) {
            System.out.println("The first element is greater than the last element.");
        } else if (comparisonResult == 0) {
            System.out.println("The first and last elements are equal.");
        } else {
            System.out.println("The first element is less than the last element.");
        }
    }

    // Method to check whether a number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }
}
