import java.util.Scanner;

public class CharacterFrequency {

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text) {
        int[] charFrequency = new int[256]; // Array to store character frequencies (for all ASCII characters)

        // Loop to calculate the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Count the number of unique characters in the text
        int uniqueCharCount = 0;
        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                uniqueCharCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCharCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                result[index][0] = Character.toString((char) i); // Store the character
                result[index][1] = Integer.toString(charFrequency[i]); // Store the frequency
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
		//create scanner object
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find character frequencies
        String[][] frequencies = findCharacterFrequency(text);

        // Display the frequencies
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] pair : frequencies) {
            System.out.printf("%9s | %9s%n", pair[0], pair[1]);
        }

        scanner.close();
    }
}
