import java.util.Scanner;

class StudentVoteChecker{
	public static void main(String [] args){
		// create scanner object for input
		Scanner input = new Scanner(System.in);
		
		// create array of size 10
		int [] studentsAge  = new int [10];
		
		// taking user input and fill data in array using loop
		for(int i = 0; i < 10; i++) {
			System.out.println("Enter age of student "+(i+1));
			studentsAge[i] = input.nextInt();
		}
		
		//create object of class 
		StudentVoteChecker obj = new StudentVoteChecker();
		
		// loop through array and check student can vote
		for(int i = 0; i < 10; i++){
			boolean canVote = obj.canStudentVote(studentsAge[i]);
			
			if(canVote){
				System.out.println("Student " + (i + 1) + " can vote.");
			}else{
				System.out.println("Student " + (i + 1) + " cannot vote.");
			}
		}
		
		// close scanner object
		input.close();
	}
	
	// Method to check if student can vote
	public boolean canStudentVote(int age){
		// check for negative age
		if(age < 0) {
			return false;
		}
		
		// check age is 18 of above
		return age >=18;
	}
}