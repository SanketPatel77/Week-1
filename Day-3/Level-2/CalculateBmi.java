import java.util.Scanner;

public class CalculateBmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		// create arrays of weight, height, weightStatus and bmi
        double [] weight = new double[number];
		double [] height = new double[number];
		double [] bmi = new double [number];
		String [] weightStatus = new String [number];
		
		// taking input for weight and height of the person	
		for(int i = 0; i < number; i++){
			System.out.println("Enter weight of person "+(i+1));
			weight[i] = input.nextDouble();
			
			System.out.println("Enter height of person "+ (i+1)+" (in cm)");
			
			height[i] = input.nextDouble();
		}
		
		// calculate bmi store in array and store weightStatus accordingly
		for(int i = 0; i < number ; i++){
			bmi[i] = weight[i] / (height[i]/100.0 * height[i]/100.0);
			if(bmi[i] <= 18.4) {
				weightStatus[i] = "Underweight";
			}else if(bmi[i] >= 18.5 && bmi[i] <= 24.9){
				weightStatus[i] = "Normal";
			}else if(bmi[i] >=25 && bmi[i] <= 39.9){
				weightStatus[i] = "Overweight";
			}else{
				weightStatus[i] = "Obese";
			}
		}
		
		// display the result
		for(int i = 0; i< number; i++){
			System.out.println("The height is "+height[i]+", weight is "+weight[i]+", BMI is "+bmi[i]+" and weight status is "+weightStatus[i]);
		}
		
        input.close(); // scanner object closed
    }
}
