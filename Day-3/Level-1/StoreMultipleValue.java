import java.util.Scanner;

class StoreMultipleValue{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		double [] numbers = new double[10]; //create array of size 10 
		
		// take input for number
		 double total = 0.0; // Variable to store the total sum
        int index = 0; // Index variable initialized to 0
		
		System.out.println("Enter numbers (up to 10). Enter 0 or a negative number to stop:");
		
		while(true){
			 System.out.print("Enter a number: ");
            double userInput = input.nextDouble();

            // Check if the user entered 0 or a negative number
            if (userInput <= 0) {
                break;
            }
			
			if (index < 10) {
                numbers[index] = userInput;
                index++; // Increment the index
            } else {
                System.out.println("Array is full. Cannot store more numbers.");
                break;
            }
		}
		
		// calculate  the total sum 
		for (int i = 0; i< numbers.length; i++){
			total += numbers[i];
		}
	
		System.out.println("Total of all numbers: " + total);
		// close Scanner object
		input.close();
	}
	
}