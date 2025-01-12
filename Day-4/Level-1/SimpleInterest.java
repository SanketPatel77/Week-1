import java.util.Scanner;

class SimpleInterest{
	public static void main(String [] args){
		//create scanner for input
		Scanner input = new Scanner(System.in);
		
		// taking input of principal, rate, and time
		System.out.println("Enter principal amount ");
		double principal = input.nextDouble();
		
		System.out.println("Enter rate of interest ");
		double rate = input.nextDouble();
		
		System.out.println("Enter time ");
		double time = input.nextDouble();
		
		SimpleInterest obj = new SimpleInterest();
		obj.calculateInterest(principal, rate, time);
		
	}
	
	/// method to calculate simple interest
	public void calculateInterest(double principal, double rate, double time){
		double simpleInterest = (principal * rate * time)/100;
		System.out.println("The Simple Interest is "+simpleInterest+" for principal "+principal+", Rate of interest " +rate+" and time "+time);
	}
}