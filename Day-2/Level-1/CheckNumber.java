import java.util.Scanner;

class CheckNumber{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		// ask user to enter number
		System.out.println("Enter number ");
		int number = input.nextInt();
		
		// checking the number is positive, negative, and zero
		if(number > 0){
			System.out.println("Positive");
		}else if(number < 0){
			System.out.println("Negative");
		}else{
			System.out.println("Zero");
		}
		
		//close the scanner object
		input.close();
	}
}