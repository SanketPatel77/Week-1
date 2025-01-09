import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

		System.out.println("Enter the price of item "); // prompt to ask user to enter price of item
		int unitPrice = input.nextInt();
		
		System.out.println("Enter the quantity "); // prompt for user to enter quantity
		int quantity = input.nextInt();
		
		int totalPrice = unitPrice * quantity; // calculate total price
		
		// displaying result
		System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
		
        // Close the scanner object
        input.close();
    }
}
