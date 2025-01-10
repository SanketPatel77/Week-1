import java.util.Scanner;

class NaturalNumber{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		// ask user to enter number
		System.out.println("Enter number ");
		int number = input.nextInt();
		
		// checking the number is natural number or not and print the result
		if(number > 0){
			int result = number * (number + 1)/2;
			System.out.println("The sum of "+number+" natural numbers is "+result);
		}else{
			System.out.println("The number "+number+" is not a natural number");
		}
		
		//close the scanner object
		input.close();
	}
}