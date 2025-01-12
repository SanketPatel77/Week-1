import java.util.Scanner;

class UnitConverter {

    // Main method for testing
    public static void main(String[] args) {
		//create scanner object for input
		Scanner input = new Scanner(System.in);
		
        // Taking input from user for conversion
        System.out.println("Enter km to convert in miles");
		double km = input.nextDouble();
		
		System.out.println("Enter miles to convert in km");
		double miles = input.nextDouble();
		
		System.out.println("Enter meter to convert in feet");
		double meter = input.nextDouble();
		
		System.out.println("Enter feet to convert in meters");
		double feet = input.nextDouble();

        System.out.println(km + " kilometers is " + convertKmToMiles(km) + " miles.");
        System.out.println(miles + " miles is " + convertMilesToKm(miles) + " kilometers.");
        System.out.println(meter + " meters is " + convertMetersToFeet(meter) + " feet.");
        System.out.println(feet + " feet is " + convertFeetToMeters(feet) + " meters.");
    }
	
	
    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

}
