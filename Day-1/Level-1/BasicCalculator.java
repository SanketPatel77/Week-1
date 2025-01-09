import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

		float number1, number2;
		
		System.out.println("Enter first number ");
		number1 = input.nextFloat();
		
		System.out.println("Enter Second number ");
		number2 = input.nextFloat();
		
		float addition = number1 + number2; // addition operation on input
		
		float substraction = number1 - number2;  // substraction operation on input
		
		float multiplication = number1 * number2; // multiplication operation on input
		
		float division = number1 / number2; // divide operation on input
		
		System.out.println("The addition, substraction, multiplication and division value of 2 number "+number1+" and "+number2+" is "+addition+", "+substraction+", "+multiplication+", and "+division);
        
        // Close the scanner object
        input.close();
    }
}
