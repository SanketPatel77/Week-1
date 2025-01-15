import java.util.Scanner;

class FindLength{
	public static void main(String [] args){
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// ask user to input string
		System.out.println("Enter String");
		String string = input.next(); // store 
		
		System.out.println("Length from user define method is "+(findLength(string)));
		System.out.println("Length from built in method is "+(string.length()));
		
		input.close(); // close scanner object
	}
	
	// Method to find length of the string
	public static int findLength(String string){
		
		int count = 0; // create and initialize count variable with zero to store length of string
		//infinite loop to count each character until exception occurs
		// handle exception
		try{
			while(true){
				string.charAt(count); // this line will give exception 
				count++;
			}
		}catch(StringIndexOutOfBoundsException ex){
			return count;
		}catch(RuntimeException ex){
			return count;
		}
	}
}