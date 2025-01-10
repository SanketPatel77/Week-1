import java.util.*;

class ArmstrongNumber{
	public static void main(String [] args){
		// Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // taking input of number
        System.out.print("Enter the first number: ");
        int number = input.nextInt();
		
		int originalNumber = number; // assigning number's value in originalNumber
		
		int sumVariable = 0; // assigning sum variable with 0
		
		while(number > 0){
			int remainder = number % 10;
		    sumVariable += remainder * remainder * remainder;
			number /= 10;
		}
		
		if(sumVariable == originalNumber){ 
			System.out.println("Armstrong number");
		}else{
			System.out.println("Not a Armstrong number");
		}
		
		// close scanner object
		input.close();
		
		
	}
}