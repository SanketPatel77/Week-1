import java.util.Scanner;

class CreateSubstring{
	public static void main(String [] args){
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		// taking first input 
		System.out.println("Enter first String");
		String string = input.next();
		
		// take startIndex from user
		System.out.println("Enter starting index");
		int startIndex = input.nextInt();
		
		// take endIndex from user
		System.out.println("Enter ending index");
		int endIndex  = input.nextInt();
		
		if(startIndex >= 0 && endIndex <= string.length()){
			// call of createSubstring
			String subString1 = createSubstring(string, startIndex, endIndex);

			// useing inbuild method of string
			String subString2 = string.substring(startIndex, endIndex);

			//call compare method
			boolean result = compare(subString1, subString2);
			
			// compare both compare method's and build in equals method's result
			if( subString1.equals(subString2)== true && result == true){
				System.out.println("Sub string 1 is "+subString1+" and sub string 2 is "+subString2);
				System.out.println("Both sub strings are same");
			}else {
				System.out.println("Both sub strings are different");
			}
		}else{
				System.out.println("Please enter valid indexes");
		}			
		
		//close scanner objectl
		input.close();
	}
	
	// Method to create sub string
	public static String createSubstring(String string, int startIndex, int endIndex){
		// create subString variable of type string and assign empty string to it
		String subString = "";
		
		for(int i = startIndex; i < endIndex; i++){
			subString += string.charAt(i); // adding characters to subString
		}
		
		return subString;
	}
	
	public static boolean compare(String subString1, String subString2){
		// check length of substrings
		if(subString1.length() != subString2.length()){
			return false;
		}
		
		// compare both sub strings  
		for(int i = 0; i < subString1.length(); i++){
			if(subString1.charAt(i) != subString2.charAt(i)) 
				return false;
		}
		
		return true;
	}
}