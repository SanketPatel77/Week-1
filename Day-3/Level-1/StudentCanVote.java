import java.util.Scanner;

class StudentCanVote{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		int [] studentAge = new int[10]; //create array of size 10
		
		// take input for ages of the students
		System.out.println("Enter 10 student's age");
		for(int i = 0; i< studentAge.length; i++){
			System.out.println("Age of student "+(i+1));
			studentAge[i] = input.nextInt();
		}
		
		// check eligibility 
		for (int i = 0; i< studentAge.length; i++){
			if(studentAge[i] <= 0) System.out.println("Invalid age");
			else if(studentAge[i] >= 18){
				System.out.println("The student with the age "+studentAge[i]+" can vote.");
			}else{
				System.out.println("The student with the age "+studentAge[i]+" cannot vote.");
			}
		}
		
		// close Scanner object
		input.close();
	}
	
}