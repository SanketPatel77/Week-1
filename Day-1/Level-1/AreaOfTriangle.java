import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare variables for base, height, and areas
        double base, height, areaInInches, areaInCm;

        // Prompt the user to enter the base in inches
        System.out.print("Enter the base of the triangle in inches: ");
        base = input.nextDouble();

        // Prompt the user to enter the height in inches
        System.out.print("Enter the height of the triangle in inches: ");
        height = input.nextDouble();

        // Calculate the area in square inches
        areaInInches = 0.5 * base * height;

        // Convert the area to square centimeters 
        areaInCm = areaInInches * 6.4516;

        // Display the results
        System.out.println("The area of the triangle is "+areaInInches+" square inches and "+areaInCm+" square centimeters.");

        // Close the scanner object
        input.close();
    }
}
