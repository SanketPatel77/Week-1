import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a scanner object
        Scanner input = new Scanner(System.in);

        // Ask the user for the year
        System.out.println("Enter a year (>= 1582):");
        int year = input.nextInt();

        // Check if the year is valid
        if (year < 1582) {
            System.out.println("The program only works for years >= 1582.");
            System.exit(0);
        }

        // Check if the year is a leap year
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        // Close the scanner
        input.close();
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Year divisible by 4
        //   Year is not divisible by 100, or it is divisible by 400
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }
}
