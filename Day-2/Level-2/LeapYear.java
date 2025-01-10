import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a year
        System.out.print("Enter a year (>= 1582): "); // because only year 1582 and after 1582 can be leap year
        int year = scanner.nextInt();

        // Check if the year is valid (greater than or equal to 1582)
        if (year >= 1582) {
            // Check if the year is divisible by 4
            if (year % 4 == 0) {
                // If divisible by 4, check if it's divisible by 100
                if (year % 100 == 0) {
                    // If divisible by 100, check if it's divisible by 400
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Please enter a year >= 1582.");
        }

        // Close the scanner
        scanner.close();
    }
}
