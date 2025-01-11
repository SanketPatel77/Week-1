import java.util.Scanner;

public class StudentGrades2DArray  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number of students
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		// Create a 2D array to store marks of students in physics, chemistry, and maths
        int[][] marks = new int[number][3];
        double[] percentages = new double[number];
        char[] grades = new char[number];
		
		 // Input marks for each student
        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                int marksInput;
                while (true) {
                    System.out.print("Enter marks for " + subject + " (0-100): ");
                    marksInput = input.nextInt();
                    if (marksInput >= 0 && marksInput <= 100) {
                        break;
                    }
                    System.out.println("Invalid input! Marks must be between 0 and 100.");
                }
                marks[i][j] = marksInput;
            }
        }
		
		// Calculate percentages and grades
        for (int i = 0; i < number; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;

            // Assign grades based on percentage
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }
		
		// Display the result using println
		System.out.println("\nPhysics  Chemistry  Maths  Percentage  Grade");
		for (int i = 0; i < number; i++) {
			System.out.println(marks[i][0] + "       " + 
            marks[i][1] + "         " + 
            marks[i][2] + "       " + 
            String.format("%.2f", percentages[i]) + "       " + 
            grades[i]);
		}

		
        input.close(); // scanner object closed
    }
}
