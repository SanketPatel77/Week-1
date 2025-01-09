import java.util.Scanner;

public class CalculateSideOfSquare {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

		System.out.println("Enter perimeter of square ");
		float perimeter = input.nextFloat();
		
		float side = perimeter/4; // calculate side of the square
		
		System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
				
        // Close the scanner object
        input.close();
    }
}
