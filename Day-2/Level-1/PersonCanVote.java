import java.util.Scanner;

class PersonCanVote{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		// ask user to enter age
		System.out.println("Enter your age ");
		int age = input.nextInt();
		
		// checking the number is natural number or not and print the result
		if(age >= 18){
			System.out.println("The person's age is "+age+" and can vote.");
		}else{
			System.out.println("The person's age is "+age+" and cannot vote.");
		}
		
		//close the scanner object
		input.close();
	}
}