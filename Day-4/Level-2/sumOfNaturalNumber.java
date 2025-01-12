import java.util.Scanner;

class sumOfNaturalNumber{
	public static void main(String [] args){
		//create scanner object 
		Scanner input = new Scanner(System.in);
		
		// Asking for number 
		System.out.println("Enter number");
		int number = input.nextInt();
		
		// check for natural number
		if ( number < 1 ) {
			System.exit(0);
		}
		
		// create object
		sumOfNaturalNumber obj = new sumOfNaturalNumber();
		int sumUsingRecursion = obj.calculateSum(number);
		int sumUsingFormula = obj.calculateSumUsingFormula(number);
		
		if(sumUsingFormula == sumUsingRecursion) System.out.println("Computation is correct");
		else System.out.println("Wrong computation");
		
		
		// close scanner object
		input.close();
	}
	
	// for calculate sum of natural number using recursion
	public int calculateSum(int number){
		
		if(number <= 0){
			return 0;
		}
		return number + calculateSum(number - 1);
	}
	
	// for calculate sum of natural number using recursion
	public int calculateSumUsingFormula(int number){
		return number*(number+1)/2; // Formula for sum of the first 'n' natural numbers
	}
}