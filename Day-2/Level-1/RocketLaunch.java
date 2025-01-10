import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the starting countdown value
        System.out.print("Enter the starting value for the countdown: ");
        int counter = input.nextInt();

        // Countdown using a while loop
        while (counter >= 1) {
            // Print the current countdown value
            System.out.println(counter);
            // Decrement the counter
            counter--;
        }

        // Print the final message 
        System.out.println("Rocket has launched!");

        // Close the scanner object
        input.close();
    }
}
