import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for age and height of each friend
        System.out.print("Enter the age of Amar: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter the height of Amar (in cm): ");
        double amarHeight = scanner.nextDouble();

        System.out.print("Enter the age of Akbar: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter the height of Akbar (in cm): ");
        double akbarHeight = scanner.nextDouble();

        System.out.print("Enter the age of Anthony: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter the height of Anthony (in cm): ");
        double anthonyHeight = scanner.nextDouble();

        // Find the youngest friend based on age
        int youngestAge = amarAge;
        String youngestFriend = "Amar";
        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Find the tallest friend based on height
        double tallestHeight = amarHeight;
        String tallestFriend = "Amar";
        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // Display the youngest and tallest friends
        System.out.println("The youngest friend is: " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " cm");

        // Close the scanner
        scanner.close();
    }
}
