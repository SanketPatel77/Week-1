import java.util.Scanner;

public class CalculateMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		// create arrays of marks (physics, chemistry, maths), percentage, grade 
        int [] physicsMarks = new int[number];
		int [] chemistryMarks = new int[number];
		int [] mathsMarks = new int[number];
		double [] percentage = new double[number];
		char [] grade = new char [number];
		
		
		// taking input for marks of physics, chemistry and maths
		for(int i = 0; i < number; i++){
			// physics
			System.out.println("Enter marks of physics for student "+(i+1));
			int markPhysics = input.nextInt();
			if(markPhysics < 0){
					System.out.println("Enter positive value ");
					i--;
					continue;
			}
			physicsMarks[i] = markPhysics;
			
			// chemistry
			System.out.println("Enter marks of chemistry for student "+ (i+1));			
			int markChemistry = input.nextInt();
			if(markChemistry < 0){
				System.out.println("Enter positive value ");
				i--;
				continue;
			}
			chemistryMarks[i] = markChemistry;
			
			// maths
			System.out.println("Enter marks of maths for student "+ (i+1));			
			int markMaths = input.nextInt();
			if(markMaths < 0){
				System.out.println("Enter positive value ");
				i--;
				continue;
			}
			mathsMarks[i] = markMaths;
		}
		
		// calculate percentage and grade
		for(int i = 0; i < number ; i++){
			double percent = (( mathsMarks[i] + physicsMarks[i] + chemistryMarks[i])/3.0 );
			percentage[i] = percent;
			
			// assigning grades according to percentage
			if(percent >= 80) {
				grade[i] = 'A';
			}else if(percent >= 70){
				grade[i] = 'B';
			}else if(percent >= 60 ){
				grade[i] = 'C';
			}else if(percent >= 50 ){
				grade[i] = 'D';
			}else if(percent >= 40 ){
				grade[i] = 'E';
			}else{
				grade[i] = 'R';
			}
		}
		
		// Display result
		System.out.println("Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < number; i++) {
            System.out.println(physicsMarks[i] + "       " +
                chemistryMarks[i] + "         " +
                mathsMarks[i] + "     " +
                String.format("%.2f", percentage[i]) + "       " +
                grade[i]);
        }
		
        input.close(); // scanner object closed
    }
}
