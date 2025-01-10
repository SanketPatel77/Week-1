import java.util.Scanner;

class FindFactorialWithForLoop{
	public static void main(String [] args){
		//  Create a scanner object for user input
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a number
		System.out.println("Enter number for factorial");
		int number = input.nextInt();
		
		if(number < 0){
			System.out.println("Factorial is not defined for negative numbers");
		}else{
			
			// initialize the factorial variable
			int factorial = 1;
			
			// computation of factorial using for loop
			for(int i = 1; i<=number; i++){
				factorial *= i;
			}
			
			// Display the result 
			System.out.println("The factorial of "+number+" is "+factorial);
		}
		input.close(); // close scanner object		
		
	}
}