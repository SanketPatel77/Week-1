import java.util.Scanner;

public class CharacterFrequency3 {

    // Method to find the frequency of characters in a string
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray(); // Convert the text to a character array
        int[] frequency = new int[characters.length]; // Array to store the frequency of each character

        // Outer loop to iterate through each character
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') { // Skip characters already marked as duplicate
                frequency[i] = 1; // Initialize frequency to 1

                // Inner loop to check for duplicates
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++;
                        characters[j] = '0'; // Mark duplicate characters as '0'
                    }
                }
            }
        }

        // Count the number of unique characters
        int uniqueCount = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        // Create a 1D String array to store characters and their frequencies
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + " : " + frequency[i];
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
        String[] frequencies = findCharacterFrequency(text);

        // Display the frequencies
        System.out.println("Character : Frequency");
        for (String entry : frequencies) {
            System.out.println(entry);
        }

        scanner.close();
    }
}
