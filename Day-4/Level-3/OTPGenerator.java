import java.util.HashSet;

public class OTPGenerator {

    public static void main(String[] args) {
        // Array to store OTPs
        int[] otps = new int[10];
        
        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }
        
        // Check if OTPs are unique
        if (areUnique(otps)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Some OTPs are duplicate.");
        }
    }
    
    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999 (6 digits)
        return 100000 + (int)(Math.random() * 900000);
    }
	
    // Method to check if the OTPs are unique
	public static boolean areUnique(int[] otps) {
		// Loop through each OTP and compare it with the other OTPs
		for (int i = 0; i < otps.length; i++) {
			for (int j = i + 1; j < otps.length; j++) {
				// If any two OTPs are the same, return false
				if (otps[i] == otps[j]) {
					return false;
			}
		}
    }
		// If no duplicates were found, return true
		return true;
	}

}
