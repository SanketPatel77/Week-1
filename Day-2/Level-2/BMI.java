import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for weight in kg and height in cm
        System.out.print("Enter weight (in kg): ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height (in cm): ");
        double height = scanner.nextDouble();

        // Convert height from cm to meters
        height = height / 100;

        // Calculate BMI using the formula BMI = weight / (height * height)
        double bmi = weight / (height * height);

        // Display the BMI value
        System.out.println("Your BMI is: " + bmi);

        // Determine the weight status based on the BMI value
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        // Close the scanner
        scanner.close();
    }
}
