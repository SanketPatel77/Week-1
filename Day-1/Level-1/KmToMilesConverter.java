import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // Declare a variable for kilometers
        double km;

        // Prompt the user to enter distance in kilometers
        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble(); // Take input for kilometers

        // Convert kilometers to miles using the formula
        double miles = km / 1.6;

        // Display the result
        System.out.printf("The total miles is %.2f miles for the given %.2f km.%n", miles, km);

        // Close the scanner object
        input.close();
    }
}
