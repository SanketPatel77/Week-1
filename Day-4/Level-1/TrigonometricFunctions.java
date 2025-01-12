import java.util.*;

class TrigonometricFunctions {
	public static void main(String [] args){
		// create scanner object for input
		Scanner input = new Scanner(System.in);
		
		// asking user to enter number
		System.out.println("Enter angle (in degree)");
		double angle = input.nextDouble();
		
		//create object for calling method
		TrigonometricFunctions obj = new TrigonometricFunctions();
		
		// calling method
		double [] functions = obj.calculateTrigonometricFunctions(angle);
		
		//display result 
		System.out.println("Radian is "+functions[0]+", sine is "+functions[1]+", cosine is "+functions[2]+", and tangent is "+functions[3]);
		
		// close scanner object
		input.close();
	}
	
	// method to calculate trigonometric functions
	public double[] calculateTrigonometricFunctions(double angle){
	
		//calculate radian, sine, cosine and tangent
		double radian = Math.toRadians(angle);
		double sine = Math.sin(angle);
		double cosine = Math.cos(angle);
		double tangent = Math.tan(angle);
		
		double [] array = new double[4];
		array[0] = radian;
		array[1] = sine;
		array[2] = cosine;
		array[3] = tangent;
		
		return array;
	}
}