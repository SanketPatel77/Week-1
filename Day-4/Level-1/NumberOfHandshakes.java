import java.util.Scanner;

class NumberOfHandshakes{
	public static void main(String [] args){
		//create scanner for input
		Scanner input = new Scanner(System.in);
		
		// taking input for number of students
		System.out.println("Enter number of students ");
		int  numberOfStudents = input.nextInt();
		
		// create objedct of NumberOfHandshakes class to call combinationOfHandshakes method
		NumberOfHandshakes obj = new NumberOfHandshakes();
		System.out.println("Total number of handshakes "+obj.combinationOfHandshakes(numberOfStudents)); // display the answer return by method
		
	}
	
	// method to find combinationOfHandshakes
	public int combinationOfHandshakes(int number){
		// find handshakes using formula (n*(n-1))/2
		int handshakes = (number * (number - 1)) / 2 ;
		return handshakes; // return handshakes 
	}
}