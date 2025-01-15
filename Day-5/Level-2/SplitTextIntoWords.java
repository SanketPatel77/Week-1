import java.util.Scanner;
import java.util.Arrays;

class SplitTextIntoWords{
	public static void main(String [] args){
		// create Scanner object for input
		Scanner input = new Scanner(System.in);
		
		// Ask user to input string
		System.out.println("Enter Text");
		String text = input.nextLine(); // hold user input to text variable
		
		// call splitText method 
		String [] wordArray1 = splitText(text);
		
		// split string using pre defined method split();
		String [] wordArray2 = text.split(" ");
		
		boolean result = compareStrings(wordArray1, wordArray2);
		
		System.out.println("user defined string array"+Arrays.toString(wordArray1));
		System.out.println("pre defined string array"+Arrays.toString(wordArray2));
		
		if(result){
			System.out.println("Both string arrays are equal");
		}else{
			System.out.println("Both string arrays are different");
		}
		
		input.close(); //Scanner object close
	}
	
	// Method to find length of string
	public static int findLength(String string){
		
		int count = 0; // create and initialize count variable with zero to store length of string
		//infinite loop to count each character until exception occurs
		// handle exception
		try{
			while(true){
				string.charAt(count); // this line will give exception 
				count++; // increase count variable
			}
		}catch(StringIndexOutOfBoundsException ex){
			return count;
		}catch(RuntimeException ex){
			return count;
		}
	}
	
	// Method to split text into words
	public static String[] splitText(String string){
		
		string = string.trim(); // trim the string
		int count = 0; // create empty variable called count to store length of the array
		
		// find what will be the length of array
		for(int i = 0; i < string.length(); i++){
			if(string.charAt(i) == ' ') {
				count++;
			}
		}
		
		// create array of size count
		String [] wordArray = new String [count+1];
		
		int index = 0; // create empty variable index to store word at that index

		String word = ""; // create empty string word to store word before spaces then push to array 
		
		for(int i = 0; i < string.length(); i++){
			char ch = string.charAt(i);
			
			if(string.charAt(i) == ' ') {
				wordArray[index++] = word; // store words to wordArray
				word = ""; // again empty word to store next word
			}else{
				word += ch; // concat character to word
			}
		}
		wordArray[index] = word;
		
		return wordArray;
	}
	
	// Method to compare two string
	public static boolean compareStrings (String [] wordArray1, String [] wordArray2){
		if(wordArray1.length != wordArray2.length) 
			return false;
		
		for(int i = 0; i < wordArray1.length; i++){
			if(!wordArray1[i].equals(wordArray2[i]))
				return false;
		}
		return true;
	}
}