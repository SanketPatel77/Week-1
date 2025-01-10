import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the employee's salary and years of service
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter the number of years of service: ");
        int yearsOfService = input.nextInt();

        // Calculate the bonus
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 0.05;  // 5% bonus for employees with more than 5 years of service
        }

        // Display the bonus amount
        System.out.println("The bonus amount is: " + bonus);

        // Close the scanner
        input.close();
    }
}
