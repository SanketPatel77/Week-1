import java.util.Scanner;

class FindFactors{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number"); // taking a number by user
		int number = input.nextInt(); 
		
		
		// create array of factors and maxFactor and index variables
		int maxFactor = 10;
		int [] factor = new int [maxFactor];
		int index = 0;
		
		for(int i = 1; i <= number; i++){
			if(number % i == 0){
				if(maxFactor == index){
					maxFactor *= 2;
					int [] temp = new int[maxFactor];
					
					// copy element
					for(int j = 0; j< factor.length; j++){
						temp[j] = factor[j];
					}
					
					factor = temp; // assigning  factor's reference to temp
				}
				factor[index++] = i;
			}
			
		}
		
		//display result 
		System.out.println("Factor of the number "+number);
		for(int i = 0; i < index ; i++){
			System.out.print(factor[i]+" ");
		}
		
		// close Scanner object
		input.close();
	}
	
}