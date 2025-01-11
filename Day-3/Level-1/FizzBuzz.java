import java.util.Scanner;

class FizzBuzz{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number"); // taking a number by user
		int number = input.nextInt(); 
		
		//create string array of size number
		String [] results = new String [number+1];
		
		for(int i = 0; i <=number; i++){
			if (i % 3 == 0 && i % 5 == 0){
                results[i] = "FizzBuzz";
            }else if(i % 3 == 0){
                results[i] = "Fizz";
            }else if(i % 5 == 0){
                results[i] = "Buzz";
            }else{
				results[i] = String.valueOf(i);
			}
				
		}
		
		//display result 
		for(int i = 1; i <= number ; i++){
			System.out.println("Position "+i+" = "+results[i]);
		}
		
		// close Scanner object
		input.close();
	}
	
}