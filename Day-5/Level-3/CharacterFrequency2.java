import java.util.Scanner;

public class CharacterFrequency2 {

    // Method to find unique characters in a string
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueCharacters = new char[length]; // Array to store unique characters
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in the uniqueCharacters array
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueCharacters[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If the character is unique, add it to the uniqueCharacters array
            if (isUnique) {
                uniqueCharacters[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueCharacters[i];
        }

        return result;
    }

    // Method to find the frequency of unique characters
    public static String[][] findCharacterFrequency(String text) {
        char[] uniqueCharacters = findUniqueCharacters(text); // Get unique characters
        int[] charFrequency = new int[uniqueCharacters.length]; // Array to store frequencies

        // Calculate frequencies of unique characters
        for (int i = 0; i < uniqueCharacters.length; i++) {
            char currentChar = uniqueCharacters[i];
            for (int j = 0; j < text.length(); j++) {
                if (currentChar == text.charAt(j)) {
                    charFrequency[i]++;
                }
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] result = new String[uniqueCharacters.length][2];
        for (int i = 0; i < uniqueCharacters.length; i++) {
            result[i][0] = Character.toString(uniqueCharacters[i]); // Store the character
            result[i][1] = Integer.toString(charFrequency[i]); // Store the frequency
        }

        return result;
    }

    public static void main(String[] args) {
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
