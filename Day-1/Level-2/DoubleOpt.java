import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input three double values
        System.out.print("Enter value for a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter value for b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter value for c: ");
        double c = scanner.nextDouble();

        // Calculate the operations
        double result1 = a + b * c;        
        double result2 = a * b + c;        
        double result3 = c + a / b;        
        double result4 = a % b + c;        

        // Print the results
        System.out.println("The results of Double Operations are:"+result1+", "+result2+", "+result3+", "+result4);

        // Close the scanner
        scanner.close();
    }
}
