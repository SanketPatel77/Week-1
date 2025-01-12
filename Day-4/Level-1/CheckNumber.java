import java.util.Scanner;

class CheckNumber{
	public static void main(String [] args){
		//create scanner for input
		Scanner input = new Scanner(System.in);
		
		// taking input for number 
		System.out.println("Enter number  ");
		int  number = input.nextInt();
		
		// create objedct of CheckNumber class
		CheckNumber obj = new CheckNumber();
		System.out.println(obj.checkNumber(number)); // display the answer return by method
		
	}
	
	// method to check number is positive, negative of zero
	public int checkNumber(int number){
		// check number is negative, positive, or zero
		
		if(number > 0 ) return 1; // return 1 if number is negative
		if(number < 0) return -1; // return -1 if number is positive
		return 0; // return 0 if number is zero
	}
}