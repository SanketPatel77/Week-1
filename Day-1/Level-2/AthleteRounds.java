import java.util.Scanner;

public class AthleteRounds {

    public static void main(String[] args) {
        
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking the lengths of the sides of the triangle as input
        System.out.print("Enter the length of side 1 (in meters): ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the length of side 2 (in meters): ");
        int side2 = scanner.nextInt();

        System.out.print("Enter the length of side 3 (in meters): ");
        int side3 = scanner.nextInt();

        // Calculate the perimeter of the triangle
        int perimeter = side1 + side2 + side3;

        // Convert 5 kilometers to meters
        int totalDistance = 5000;

        // Calculate the number of rounds needed to complete 5 kilometers
        int rounds = totalDistance / perimeter;

        // Print the result
        System.out.println("The total number of rounds the athlete will run to complete 5 km is: " + rounds);

        // Close the scanner
        scanner.close();
    }
}
