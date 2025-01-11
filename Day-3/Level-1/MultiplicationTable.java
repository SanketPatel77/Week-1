import java.util.Scanner;

class MultiplicationTable{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		int [] table = new int[10]; //create array of size 10 for storing table of number
		
		// take input for number
		System.out.println("Enter number ");
		int number = input.nextInt();
		
		for(int i = 0; i < table.length; i++){
			table[i] = number * (i+1);
		}
		
		// displaying the result 
		for (int i = 0; i< table.length; i++){
			 System.out.println(number + " * " + (i + 1) + " = " + table[i]);
		}
		
		// close Scanner object
		input.close();
	}
	
}