import java.util.Scanner;

class YoungestAndTallest{
	public static void main(String [] args){
		// create scanner object for input
		Scanner input = new Scanner(System.in);
		
		//arrays to store name, age, height
		String [] names = {"Amar", "Akbar", "Anthony"};
		int [] ages = new int[3];
		double [] heights = new double[3];
		
		// Input ages and heights for each friend
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.println("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }
		
		// Finding the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Finding the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
		
		// Display the results
        System.out.println("\nThe youngest friend is " + names[youngestIndex] +
                " with an age of " + ages[youngestIndex] + " years.");

        System.out.println("The tallest friend is " + names[tallestIndex] +
                " with a height of " + heights[tallestIndex] + " cm.");
		
		// close scanner object
		input.close();
	}
}