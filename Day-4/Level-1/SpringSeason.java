
public class SpringSeason {
    public static void main(String[] args) {
        
        // variable to store command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Validate the date
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid date! Please enter a valid month (1-12) and day (1-31).");
        } else {
            // Check if it's Spring season
            if (isSpringSeason(month, day)) {
                System.out.println("It's a Spring Season.");
            } else {
                System.out.println("Not a Spring Season.");
            }
        }
    }
	
	
    // Method to check if the given month and day fall in the Spring season
    public static boolean isSpringSeason(int month, int day) {
        // Spring season is from March 20 to June 20
        if ((month == 3 && day >= 20 && day <= 31) || // March 20 to March 31
            (month == 4 && day >= 1 && day <= 30) ||  // April
            (month == 5 && day >= 1 && day <= 31) ||  // May
            (month == 6 && day >= 1 && day <= 20)) {  // June 1 to June 20
            return true;
        }
        return false;
    }
}
