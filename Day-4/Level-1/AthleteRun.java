import java.util.Scanner;
import java.lang.Math;

class AthleteRun{
	public static void main(String [] args){
		//create scanner for input
		Scanner input = new Scanner(System.in);
		
		// taking input of sides in meter
		System.out.println("Enter first side ");
		double  firstSide = input.nextDouble();
		
		System.out.println("Enter second side ");
		double  secondSide = input.nextDouble();
		
		System.out.println("Enter third side ");
		double  thirdSide = input.nextDouble();
		
		// calculate perimete of triangle
		double perimeter = firstSide + secondSide + thirdSide;
		
		// create objedct of class AthleteRun 
		AthleteRun obj = new AthleteRun();
		System.out.println("Total number of rounds "+obj.calculateRounds(perimeter)); // display the answer return by method
		
	}
	
	// method for calculate rounds athlete need to complete
	public double calculateRounds(double perimeter){
		// calculate how many rounds athlete need to complete
		double rounds = 5000 / perimeter ; // convert 5km to 5000 meter
		
		return rounds; // return handshakes 
	}
}