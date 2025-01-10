import java.util.Scanner;

public class LeapYearWithSingleIf {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year (>= 1582): "); // because only year 1582 and after 1582 can be leap year
        int year = scanner.nextInt();

        // Check if the year is a leap year using a single if condition
        if (year >= 1582 && ( (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) )) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        } else {
            System.out.println("Please enter a year >= 1582.");
        }

        // Close the scanner
        scanner.close();
    }
}
