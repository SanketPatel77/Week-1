public class SpringSeason {
    public static void main(String[] args) {
		// ensure user give 2 arguments
		if(args.length != 2){
			System.out.println("Please enter both arguments");
			return;
		}
        
        // Parse the command-line arguments for month and day
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the date falls in the spring season
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) || // March 20–31
                           (month == 4 && day >= 1 && day <= 30) ||  // April 1–30
                           (month == 5 && day >= 1 && day <= 31) ||  // May 1–31
                           (month == 6 && day >= 1 && day <= 20);    // June 1–20

        // Output the result
        if (isSpring) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
