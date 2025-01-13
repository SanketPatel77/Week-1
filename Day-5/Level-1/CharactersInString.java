import java.util.Scanner;
import java.util.Arrays;

class CharactersInString{
	public static void main(String [] args){
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		// taking first input 
		System.out.println("Enter String");
		String string = input.next();
		
		// call method countCharacters 
		char [] charArray1 = countCharacters(string);
		
		// create character array using pre define function (toCharArray())
		char [] charArray2 = string.toCharArray();
		
		//call for compare method
		
		boolean result = compare(charArray1, charArray2);
		
		// print both arrays
		System.out.println("First array is "+Arrays.toString(charArray1));
		System.out.println("Second array is "+Arrays.toString(charArray2));
		
		if(result){
			System.out.println("Both arrays are same");
		}else{
			System.out.println("Both arrays are different");
		}
		
		//close scanner objectl
		input.close();
	}
	
	// Method to create sub string
	public static char[] countCharacters(String string){
		// create character to store string's character
		char [] charArray = new char[string.length()];
		
		// assigning characters of string to array
		for(int i = 0; i < string.length(); i++){
			charArray[i] = string.charAt(i);
		}
		
		return charArray;
	}
	
	// Method to compare arrays
	public static boolean compare(char[] charArray1, char[] charArray2){
		
		// compare both array 
		for(int i = 0; i < charArray1.length; i++){
			if(charArray1[i] != charArray2[i])
				return false;
		}
		
		return true;
	}
}