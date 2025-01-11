import java.util.Scanner;

class CheckNumber{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		int [] number = new int[5]; //create array of size 5
		
		// take input for numbers
		System.out.println("Enter 5 numbers ");
		
		for(int i = 0; i< number.length; i++){
			System.out.println("Enter number "+(i+1));
			number[i] = input.nextInt();
		}
		
		// check number is positive, negative, or zero 
		for (int i = 0; i< number.length; i++){
			if(number[i] < 0) System.out.println("Number is negative");
			else if (number[i] == 0) System.out.println("Number is Zero");
			else {
				if(number[i] % 2 == 0) System.out.println("Number is Even ");
				else System.out.println("Number is Odd ");
			}
		}
		
		   // Compare the first and last elements of the array
        int first = number[0];
        int last = number[number.length - 1];
        System.out.println("\nComparison of the first and last elements:");
        if (first == last) {
            System.out.println("The first (" + first + ") and last (" + last + ") elements are equal.");
        } else if (first > last) {
            System.out.println("The first (" + first + ") element is greater than the last (" + last + ").");
        } else {
            System.out.println("The first (" + first + ") element is less than the last (" + last + ").");
        }
		
		// close Scanner object
		input.close();
	}
	
}