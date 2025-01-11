import java.util.Scanner;

class ZaraEmployeeBonus{
	public static void main(String [] args){
		// create scanner object for input
		Scanner input = new Scanner(System.in);
		
		// constant variable holds emplyee count
		int EMPLOYEE_COUNT = 10;
		
		// create arrays
		double [] salaries = new double[EMPLOYEE_COUNT];
		double [] yearOfService = new double[EMPLOYEE_COUNT];
		double [] newSalaries = new double[EMPLOYEE_COUNT];
		double [] bonus = new double [EMPLOYEE_COUNT];
		
		double totalBonus = 0;
		double totalOldSalary = 0;
		double totalNewSalary = 0;
		
		// loop for input salaries and year of experience
		for(int i = 0; i < EMPLOYEE_COUNT; i++){
			System.out.println("Enter details of emplyee"+(i+1));
		
            // Input salary with validation
            System.out.print("Salary: ");
            double salary = input.nextDouble();
            if (salary <= 0) {
                System.out.println("Invalid salary! Please enter a positive number.");
                i--; // Decrement index to re-enter for the same employee
                continue; // Skip further input for this iteration
            }
            salaries[i] = salary;

            // Input years of service with validation
            System.out.print("Years of Service: ");
            double years = input.nextDouble();
            if (years < 0) {
                System.out.println("Invalid years of service! Please enter a non-negative number.");
                i--; // Decrement index to re-enter for the same employee
                continue; // Skip further input for this iteration
            }
            yearOfService[i] = years;

		}
		
		// calculate bonus, new salaries and totals
		for(int i = 0; i < EMPLOYEE_COUNT; i++){
			double bonusPercentage = (yearOfService[i] > 5) ? 0.05 : 0.02;
			bonus[i] = salaries[i] * bonusPercentage;
			newSalaries[i] = salaries[i] + bonus[i];
			
			totalBonus += bonus[i];
			totalOldSalary += salaries[i];
			totalNewSalary += newSalaries[i];
		}
		
		// display result 
		 for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("  Old Salary: " + salaries[i]);
            System.out.println("  Years of Service: " + yearOfService[i]);
            System.out.println("  Bonus: " + bonus[i]);
            System.out.println("  New Salary: " + newSalaries[i]);
        }
		input.close(); // closer scanner object
	}
}