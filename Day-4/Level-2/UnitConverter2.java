import java.util.Scanner;

class UnitConverter2 {

    // Main method for testing
    public static void main(String[] args) {
        // Create scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking input from the user for conversion
        System.out.println("Enter yards to convert to feet:");
        double yards = input.nextDouble();

        System.out.println("Enter feet to convert to yards:");
        double feet = input.nextDouble();

        System.out.println("Enter meters to convert to inches:");
        double meters = input.nextDouble();

        System.out.println("Enter inches to convert to meters:");
        double inches = input.nextDouble();

        System.out.println("Enter inches to convert to centimeters:");
        double inchesToCm = input.nextDouble();

        // Displaying the conversion results
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");
        System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");
        System.out.println(inchesToCm + " inches is " + convertInchesToCm(inchesToCm) + " centimeters.");

        // Close the scanner object
        input.close();
    }

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
}
