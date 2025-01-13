import java.util.Scanner;

class ConvertToLowerCase{
	public static void main(String [] args){
		// create scanner oject for input
		Scanner input = new Scanner(System.in);
		
		// taking input from user
		System.out.println("Enter String");
		String string = input.nextLine();
		
		// call convertToLowerCase method to convert in lowercase
		String lowercaseString1 = convertToLowerCase(string);

		// build in method to convert in uppercase
		String lowercaseString2 = string.toLowerCase();
		
		boolean result = compareStrings(lowercaseString1, lowercaseString2);
		
		System.out.println("Lowercase string by user is "+lowercaseString1);
		System.out.println("Lowercase string by build in method is "+lowercaseString2);
		
		if(result){
			System.out.println("Both strings are equal");
		}else{
			System.out.println("Both strings are different");
		}
		
		// close scanner object 
		input.close();
	}
	
	// Method to convert lower case
	public static String convertToLowerCase(String string){
		// empty string variable to store lowercase string
		String lowercaseString = "";
		
		for(int i = 0; i < string.length(); i++){
			if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
				lowercaseString += (char)(string.charAt(i) + 32);
			}else{
				lowercaseString += string.charAt(i);
			}
		}
		
		return lowercaseString;
	}
	
	
	// Method to compare strings
	public static boolean compareStrings(String lowercaseString1, String lowercaseString2){
		if(lowercaseString1.length() != lowercaseString2.length()){
			return false;
		}
		
		// compare strings using chaAt()
		for(int i = 0; i < lowercaseString1.length(); i++){
			if(lowercaseString1.charAt(i) != lowercaseString2.charAt(i)){
				return false;
			}
		}
		
		return true;
	}
	
}