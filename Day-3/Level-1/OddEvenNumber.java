import java.util.Scanner;

class OddEvenNumber{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number"); // taking a number by user
		int number = input.nextInt(); 
		
		// check for natural number
		if(number < 1) {
			System.err.println("Not a natural number"); // print error message
			System.exit(0); // terminate the program
		}
		// create array for even and odd numbers 
		int [] evenNumber = new int [number / 2+1];
		int [] oddNumber = new int [number / 2+1];
		
		int evenIndex = 0;
		int oddIndex = 0;
		
		// saving odd and even number in corresponding array
		for(int i = 1; i <= number; i++){
			if(i % 2 == 0){
				evenNumber[evenIndex] = i;
				evenIndex++;
			}else{
				oddNumber[oddIndex] = i;
				oddIndex++;
			}
		}
		// display even numbers
		System.out.println("Even numbers");
		for(int i = 0; i < evenIndex; i++){
			System.out.print(evenNumber[i]+" ");
		}
		
		// display odd numbers
		System.out.println("\nOdd numbers");
		for(int i = 0; i <oddIndex; i++){
			System.out.print(oddNumber[i]+" ");
		}
		
		
		
		// close Scanner object
		input.close();
	}
	
}