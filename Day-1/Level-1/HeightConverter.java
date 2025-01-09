import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare a variable for height in cm
        double heightInCm;

        // Prompt the user to enter their height in centimeters
        System.out.print("Enter your height in centimeters: ");
        heightInCm = input.nextDouble();

        // Convert height to inches 
        double heightInInches = heightInCm / 2.54;

        // Convert height to feet and remaining inches 
        int foot = (int) (heightInInches / 12); // Whole number part gives feet
        double inches = heightInInches % 12;   // Remainder gives inches

        // Display the results
        System.out.println("Your height in cm is "+heightInCm+" while in foot is "+foot+" and inches is "+inches);

        // Close the scanner object
        input.close();
    }
}
