import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input salary
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Input bonus
        System.out.print("Enter your bonus : ");
        double bonus = scanner.nextDouble();

        // total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence Total Income is INR " + totalIncome + ".");

        // Close the scanner
        scanner.close();
    }
}
