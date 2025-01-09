import java.util.Scanner;

class UniversityFeeDiscount{
	public static void main(String [] args){
		// create a scanner object to take user input
		Scanner input = new Scanner(System.in);
	
		float fee, discountPercent, discount;
		
		// prompt for user to enter fee 
		System.out.println("Enter fee");
		fee = input.nextFloat();
		
		// prompt for user to enter discount Percent
		System.out.println("Enter discount percentage");
		discountPercent = input.nextFloat();
		
		discount = (fee * discountPercent)/100; // calculate the discount amount
		
		// display the result
		System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+(fee - discount));
		
		input.close(); // close the scanner object
	}
}