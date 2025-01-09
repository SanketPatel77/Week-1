import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

		System.out.println("Enter distance in feet "); // prompt to ask user to enter distance in feet
		float distanceInFeet = input.nextFloat();
		
		float distanceInYard = distanceInFeet/3; // calculate distance in yard
		
		float distanceInMiles = distanceInYard / 1760;
		System.out.println("The distance in miles is "+distanceInMiles+" and in yards "+distanceInYard+" whose distance in feet is "+distanceInFeet);
				
        // Close the scanner object
        input.close();
    }
}
