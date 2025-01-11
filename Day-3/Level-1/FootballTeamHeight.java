import java.util.Scanner;

class FootballTeamHeight{
	public static void main(String [] args){
		// create a scanner object for input
		Scanner input = new Scanner(System.in);
		
		 double[] heights = new double[11];

        // Prompt the user to input heights
        System.out.println("Enter the heights (in cm) of 11 football team players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }

        // Calculate the sum of heights
        double sum = 0;
        for (double height : heights) {
            sum += height;
        }

        // Calculate the mean height
        double mean = sum / heights.length;
		
		// Display the mean height
        System.out.println("The mean height of the football team is: "+ mean);

		
		// close Scanner object
		input.close();
	}
	
}