import java.util.Scanner;

public class SimpleInterestCalculator {

    public static void main(String[] args) {
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking input for Principal, Rate of Interest, and Time
        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();

        // Calculate the Simple Interest using the formula
        double simpleInterest = (principal * rate * time) / 100;

        // Print the result
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + 
                           principal + ", Rate of Interest " + rate + " and Time " + time);

        // Close the scanner
        scanner.close();
    }
}
