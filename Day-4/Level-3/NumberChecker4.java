import java.util.Scanner;

public class NumberChecker4 {

    public static void main(String[] args) {
        // create scanner object
		Scanner scanner = new Scanner(System.in);
		
		// input from user
		System.out.println("Enter number");
        int number = scanner.nextInt();

        // Check if the number is a prime number
        boolean isPrime = isPrime(number);
        System.out.println("Is Prime: " + isPrime);

        // Check if the number is a neon number
        boolean isNeon = isNeon(number);
        System.out.println("Is Neon: " + isNeon);

        // Check if the number is a spy number
        boolean isSpy = isSpy(number);
        System.out.println("Is Spy: " + isSpy);

        // Check if the number is an automorphic number
        boolean isAutomorphic = isAutomorphic(number);
        System.out.println("Is Automorphic: " + isAutomorphic);

        // Check if the number is a buzz number
        boolean isBuzz = isBuzz(number);
        System.out.println("Is Buzz: " + isBuzz);
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        
        // Sum the digits of the square of the number
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        return sumOfDigits == productOfDigits;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

   // Method to check if a number is a buzz number
	public static boolean isBuzz(int number) {
		// Check if the number is divisible by 7 or if the last digit is 7
		return number % 7 == 0 || number % 10 == 7;
	}

}
