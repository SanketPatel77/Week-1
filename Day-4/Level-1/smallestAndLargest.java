import java.util.*;

class smallestAndLargest{
	public static void main(String [] args){
		// create scanner object for input
		Scanner input = new Scanner(System.in);
		
		// asking user to enter number
		System.out.println("Enter first number");
		int number1 = input.nextInt();
		
		System.out.println("Enter second number");
		int number2 = input.nextInt();
		
		System.out.println("Enter third number");
		int number3 = input.nextInt();
		
		// calling method and store result in array
		int [] array = findSmallestAndLargest(number1, number2, number3);
		
		// Display the answer 
		System.out.println("Smallest number is "+array[0]+" and largest number is "+array[1]);
		
		// close scanner object
		input.close();
	}
	
	public static int[] findSmallestAndLargest(int number1, int number2, int number3){
		int [] array = new int [2];
		// using inbuilt class to find smallest number
		int smallest = Math.min(number1,Math.min(number2, number3));
		
		// using inbuilt class to find largest number
		int largest = Math.max(number1, Math.max(number2, number3));
		
		// put smallest and largest in array
		array[0] = smallest;
		array[1] = largest;
		// return the array
		return array;
	}
}