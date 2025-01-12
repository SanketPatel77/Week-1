import java.util.*;

class CalculateChillTemprature{
	public static void main(String [] args){
		// create scanner object for input
		Scanner input = new Scanner(System.in);
		
		// asking user to enter number
		System.out.println("Enter temprature");
		double temprature = input.nextDouble();
		
		System.out.println("Enter wind speed ");
		double windSpeed = input.nextDouble();
		
		//create object for calling method
		CalculateChillTemprature obj = new CalculateChillTemprature();
		// calling method
		double windChill = obj.calculateWindChill(temprature, windSpeed);
		
		// Display the answer 
		System.out.println("Wind chill temprature is "+windChill);
		
		// close scanner object
		input.close();
	}
	
	// method to calculate wind chill temprature
	public double calculateWindChill(double temprature, double windSpeed){
		// calculate wind chll using formula
		double windChill = 35.74 + 0.6215 * temprature + (0.4275 * temprature - 35.75) * Math.pow(windSpeed, 0.16);
		
		// return wind chill temprature
		return windChill;
	}
}