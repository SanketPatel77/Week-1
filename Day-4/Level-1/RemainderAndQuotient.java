import java.util.*;

class RemainderAndQuotient{
	public static void main(String [] args){
		// create scanner object for input
		Scanner input = new Scanner(System.in);
		
		// asking user to enter number
		System.out.println("Enter first number");
		int number = input.nextInt();
		
		System.out.println("Enter divisor");
		int divisor = input.nextInt();
		
		
		// calling method and store result in array
		int [] array = findRemainderAndQuotient(number, divisor);
		
		// Display the answer 
		System.out.println("Quotient is "+array[0]+" and remainder is "+array[1]);
		
		// close scanner object
		input.close();
	}
	
	public static int[] findRemainderAndQuotient(int number, int divisor){
		int [] array = new int [2];
		// calculate remainder and quotient
		int quotient = number / divisor;
		int remainder = number % divisor;
		
		// put remainder and quotient in array
		array[0] = quotient;
		array[1] = remainder;
		
		// return the array
		return array;
	}
}