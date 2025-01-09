import java.util.Scanner;

public class NumberOfHandshakes {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
	
		// prompt for user to enter number of students
		System.out.println("Enter the number of students");
		int numberOFStudents = input.nextInt();
		
		int handshakes = ( numberOFStudents * (numberOFStudents - 1) )/2;
		
		// display result
		System.out.println("The total number of handshakes are "+handshakes);
		
        // Close the scanner object
        input.close();
    }
}
