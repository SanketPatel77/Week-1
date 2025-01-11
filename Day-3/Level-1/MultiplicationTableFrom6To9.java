import java.util.Scanner;

class MultiplicationTableFrom6To9{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		int [] table = new int[4]; //create array of size 10 for storing table of number
		
		// take input for number
		System.out.println("Enter number ");
		int number = input.nextInt();
		
		for(int i = 0; i < table.length; i++){
			table[i] = number * (i+6);
		}
		
		// displaying the result 
		for (int i = 0; i< table.length; i++){
			 System.out.println(number + " * " + (i + 6) + " = " + table[i]);
		}
		
		// close Scanner object
		input.close();
	}
	
}