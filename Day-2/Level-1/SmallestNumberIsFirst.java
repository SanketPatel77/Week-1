import java.util.Scanner;

class SmallestNumberIsFirst{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		// taking input for number1, number2, number3
		System.out.println("Enter first number ");
		int number1 = input.nextInt();
		
		System.out.println("Enter second number ");
		int number2 = input.nextInt();
		
		System.out.println("Enter third number ");
		int number3 = input.nextInt();
		
		String result = "No"; // result variable to diclare divisibility is yes or not
		
		// checking the divisibility by 5
		if(number1<number2 && number1 < number3){
			result = "Yes";
		}
		// Display the result
		System.out.println("Is the first number the smallest? "+result);
		
		//close the scanner object
		input.close();
	}
}