import java.util.Scanner;

class FindFactors{
	public static void main(String [] args){
		//create scanner object 
		Scanner input = new Scanner(System.in);
		
		// Asking for number 
		System.out.println("Enter number");
		int number = input.nextInt();
		
		// call findFactors method
		int [] factors = findFactors(number);
		
		// call sumOfFactors method
		int factorsSum = sumOfFactors(factors);
		
		// call productOfFactors method
		int factorsProduct = productOfFactors(factors);
		
		// call squareSum method
		int sumOfSquare = squareSum(factors);
		
		// this loop print factors
		System.out.println("Factors of number "+number+" are");
		for(int i = 0; i < factors.length; i++){
			System.out.print(factors[i]+" ");
		}
		
		// print sum, factors and sum of square of factors
		System.out.println("The sum of factors is "+factorsSum+", product is "+factorsProduct+" and sum of factors's square is "+sumOfSquare);
		
		//close scanner object
		input.close();
		
	}
	
	//static method to find factors 
	public static int[] findFactors(int number){
		int count = 0; // initialize count variable with 0
		
		// first loop for the count of factors 
		for(int i = 1; i <= number; i++){
			if(number % i == 0) count++;
		}
		
		// create array to hold factors
		int [] factors = new int[count];
		
		int index = 0; // to track the position in the factors array
		
		// second loop to save factors into array
		for (int i = 1; i <= number; i++) {
        if (number % i == 0) {
            factors[index] = i;
            index++;
        }
    }
		//return factors array
			return factors;
	}
	
	// Method to sum all factors
	public static int sumOfFactors(int [] factors){
		// create and initialize sum variable with 0
		int sum = 0;
		
		// for loop to extract factors from array
		for(int i = 0; i < factors.length; i++){
			sum += factors[i]; // calculate sum
		}
		// return sum of factors
		return sum;
	}
	
	//Method to product factors
	public static int productOfFactors(int [] factors){
		// create and initialize product variable with 1
		int product = 1;
		
		// for loop to extract factors from array
		for(int i = 0; i < factors.length; i++){
			product *= factors[i]; // calculate product
		}
		// return sum of factors
		return product;
	}
	
	//Method to sum of square of factors
	public static int squareSum(int [] factors){
		// create and initialize sum variable with 0
		int sum = 0;
		
		// for loop to extract factors from array
		for(int i = 0; i < factors.length; i++){
			sum += Math.pow(factors[i],2); // calculate sum of square of factors
		}
		// return sum of factors
		return sum;
	}
}