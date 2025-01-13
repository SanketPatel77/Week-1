import java.util.Scanner;

class ConvertToUpperCase{
	public static void main(String [] args){
		// create scanner oject for input
		Scanner input = new Scanner(System.in);
		
		// taking input from user
		System.out.println("Enter String");
		String string = input.nextLine();
		
		// call convertToUpperCase method to convert in uppercase
		String uppercaseString1 = convertToUpperCase(string);

		// build in method to convert in uppercase
		String uppercaseString2 = string.toUpperCase();
		
		boolean result = compareStrings(uppercaseString1, uppercaseString2);
		
		System.out.println("Uppercase string by user is "+uppercaseString1);
		System.out.println("Uppercase string by build in method is "+uppercaseString2);
		
		if(result){
			
			System.out.println("Both strings are equal");
		}else{
			System.out.println("Both strings are different");
		}
		
		// close scanner object 
		input.close();
	}
	
	// Method to convert uppper case
	public static String convertToUpperCase(String string){
		// empty string variable to store uppercase string
		String uppercaseString = "";
		
		for(int i = 0; i < string.length(); i++){
			if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
				uppercaseString += (char)(string.charAt(i) - 32);
			}else{
				uppercaseString += string.charAt(i);
			}
		}
		
		return uppercaseString;
	}
	
	
	// Method to compare strings
	public static boolean compareStrings(String uppercaseString1, String uppercaseString2){
		
		if(uppercaseString1.length() != uppercaseString2.length()){
			return false;
		}
		
		// compare strings using chaAt()
		for(int i = 0; i < uppercaseString1.length(); i++){
			if(uppercaseString1.charAt(i) != uppercaseString2.charAt(i)){
				return false;
			}
		}
		
		return true;
	}
	
}