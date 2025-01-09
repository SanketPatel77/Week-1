import java.util.Scanner;

public class WeightConverter {

    public static void main(String[] args) {
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking input for weight in pounds
        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // Conversion factor from pounds to kilograms
        double poundsToKilograms = 2.2;

        // Convert weight to kilograms
        double weightInKilograms = weightInPounds / poundsToKilograms;

        // Print the result
        System.out.println("The weight of the person in pounds is " + weightInPounds + 
                           " and in kilograms is " + weightInKilograms);

        // Close the scanner
        scanner.close();
    }
}
