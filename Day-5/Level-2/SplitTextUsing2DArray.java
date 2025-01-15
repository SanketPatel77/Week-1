import java.util.Scanner;
import java.util.Arrays;

class SplitTextUsing2DArray{
	public static void main(String [] args){
		// create scanner objec for input
		Scanner input = new Scanner(System.in);
	
		// taking string input from user
		System.out.println("Enter string");
		String string = input.nextLine();
	
		// call splitWords method
		String [] wordArray = splitWords(string);
		
		System.out.println("word array "+Arrays.toString(wordArray));
		int lengthOfString = stringLength(string);
		System.out.println("Length is "+lengthOfString);
		
		// call of 2D string array
		String [][] stringArray = storeWordAndLength(wordArray);
		//Display 2D array
		System.out.println("------------------------------------");
		System.out.println("Words       |  Length");
		System.out.println("------------------------------------");
		for (int i = 0; i < wordArray.length; i++) {
			// Calculate the length of each word
			int length = wordArray[i].length();
    
			// Print in tabular format using printf
			System.out.printf("%-12s|  %d%n", wordArray[i], length);
		}
		System.out.println("------------------------------------");

	
		// close scanner object
		input.close();
	} 	
	
	// method to calculate string length
	public static int stringLength(String string){
		int length = 0; // create and initialize length variable with zero
		for(int i = 0; i < string.length(); i++){
			length++;
		}
		return length;
	}
	
	// Method to split in words
	public static String[] splitWords(String str){
		String string = str.trim();
		
		int count = 0; // variable to store word count 
		String word = ""; // intialize empty string
		
		for(int i = 0; i < string.length(); i++){
			if(string.charAt(i) == ' '){
				count++;
			}
		}
		
		// create word array
		String [] wordArray = new String[count+1];
		int index = 0;
		for(int i = 0; i < string.length(); i++){
			if(string.charAt(i) == ' '){
				wordArray[index++] = word;
				word = "";
			}else{
				word += string.charAt(i);
			}
		}
		
		wordArray[index] = word;
		
		return wordArray;
	}
	
	// Method to create 2D array and store word and corresponding length
	public static String[][] storeWordAndLength(String [] wordArray){
		// create 2D array which hold string and corresponding length
		String [][] stringArray = new String[wordArray.length][2];
		
		for(int i = 0; i < wordArray.length; i++){
			for(int j = 0; j < 2 ; j++){
				stringArray[i][0] = wordArray[i];
				stringArray[i][1] = String.valueOf(stringLength(wordArray[i]));
			}
		}
		
		return stringArray;
	}		
}