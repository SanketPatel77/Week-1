import java.util.Scanner;

class CheckDivisibility{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number ");
		int number = input.nextInt();
		
		String result = "No"; // result variable to diclare divisibility is yes or not
		
		// checking the divisibility by 5
		if(number % 5 == 0){
			result = "Yes";
		}
		// Display the result
		System.out.println("Is the number "+number+" divisible by 5? "+result);
		
		//close the scanner object
		input.close();
	}
}