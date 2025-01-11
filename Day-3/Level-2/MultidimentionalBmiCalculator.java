import java.util.Scanner;

public class MultidimentionalBmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
		// create arrays of weight, height, weightStatus and bmi
        double [][] personData = new double[number][3];
		String [] weightStatus = new String [number];
		
		// taking input for weight and height of the person	
		for(int i = 0; i < number; i++){
			for(int j = 0; j < 2; j++){
			
				if(j == 0){
					System.out.println("Enter height of person "+(i+1)+"(in cm)");
					double height = input.nextDouble();
					// check the value is positive of negative 
					if(height < 0){
						System.out.println("Enter positive value ");
						j--;
						continue;
					}
					personData[i][j] = height;
				}else{
					System.out.println("Enter weight of person "+(i+1));
					double weight = input.nextDouble();
					// check the value is negative and positive
					if(weight < 0){
						System.out.println("Enter positive value ");
						j--;
						continue;
					}	
					personData[i][j] = weight;
				}
			}
		}
		
		// calculate bmi store in array and store weightStatus accordingly
		for(int i = 0; i < number ; i++){
			for(int j = 0; j < 1; j++){
				// calculate bmi using fomula (weight / height^2)
				double bmi = personData[0][1] / ( personData[0][0]/100.0 *  personData[0][0]/100.0);
				personData[i][2] = bmi;
				
				// checking weight status
				if(bmi <= 18.4) {
					weightStatus[i] = "Underweight";
				}else if(bmi >= 18.5 && bmi <= 24.9){
					weightStatus[i] = "Normal";
				}else if(bmi >=25 && bmi <= 39.9){
					weightStatus[i] = "Overweight";
				}else{
					weightStatus[i] = "Obese";
				}
			}
		}
		
		// display the result
		for(int i = 0; i< number; i++){
			System.out.println("Height is "+
			personData[i][0] + ", Weight is "+
			personData[i][1] + ", Bmi is " +
			personData[i][2] + ", and Weight status is " +
			weightStatus[i]);
		}
		
        input.close(); // scanner object closed
    }
}
