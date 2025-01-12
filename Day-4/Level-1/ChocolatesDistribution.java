import java.util.*;

class ChocolatesDistribution{
	public static void main(String [] args){
		// create scanner object for input
		Scanner input = new Scanner(System.in);
		
		// asking user to enter number
		System.out.println("Enter number of children");
		int numberOfChildren = input.nextInt();
		
		System.out.println("Enter number of chocolate");
		int numberOfChocolate = input.nextInt();
		
		
		// calling method and store result in array
		int [] array = findRemainderAndQuotient(numberOfChildren, numberOfChocolate);
		
		// Display the answer 
		System.out.println("Chocolates child gets is "+array[0]+" and remaining chocolates "+array[1]);
		
		// close scanner object
		input.close();
	}
	
	public static int[] findRemainderAndQuotient(int numberOfChildren, int numberOfChocolate){
		int [] array = new int [2];
		// calculate remainder and quotient
		int quotient = numberOfChocolate / numberOfChildren;
		int remainder = numberOfChocolate % numberOfChildren;
		
		// put remainder and quotient in array
		array[0] = quotient;
		array[1] = remainder;
		
		// return the array
		return array;
	}
}