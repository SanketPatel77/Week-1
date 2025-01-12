import java.util.Scanner;

class SumOfNumber{
	public static void main(String [] args){
		// create scanner object for input
		Scanner input = new Scanner(System.in);
		
		// asking user to enter number
		System.out.println("Enter number");
		int number = input.nextInt();
		
		// create object 
		SumOfNumber obj = new SumOfNumber();
		System.out.println("The sum of n numbers is "+obj.calculateSum(number));
		
	}
	
	// method for calculate sum of n numbers
	public int calculateSum(int number){
		// create variable sum 
		int sum = 0;
		// for loop for calculation
		for(int i = 1; i <= number; i++){
			sum += i;
		}
		return sum ; // return sum of n numbers
	}
}