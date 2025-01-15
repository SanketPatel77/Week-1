import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Step 1: Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step 2: Create arrays to store character frequencies (256 for ASCII)
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Step 3: Calculate frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Step 4: Compare character frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter the first text: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter the second text: ");
        String text2 = scanner.nextLine();

        // Call the method and display the result
        boolean result = areAnagrams(text1, text2);
        System.out.println("Are the two texts anagrams? " + (result ? "Yes" : "No"));

        scanner.close();
    }
}
