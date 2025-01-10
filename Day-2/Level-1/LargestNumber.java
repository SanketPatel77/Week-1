import java.util.Scanner;

class LargestNumber{
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
		
		String  isFirstLargest = "No"; // result variable to diclare number1 is largest
		String  isSecondLargest = "No"; // result variable to diclare number2 is largest
		String  isThirdLargest = "No"; // result variable to diclare number3 is largest
		
		if(number1 >= number2 && number1 >= number3){
			isFirstLargest = "Yes";
		}else if(number2 >= number1 && number2 >= number3){
			isSecondLargest = "Yes";
		}else if(number3 >= number1 && number3 >= number2){
			isThirdLargest = "Yes";
		}
		
		// Display the result
		System.out.println("Is the first number the largest? "+isFirstLargest);
		System.out.println("Is the second number the largest? "+isSecondLargest);
		System.out.println("Is the third number the largest? "+isThirdLargest);
		
		//close the scanner object
		input.close();
	}
}