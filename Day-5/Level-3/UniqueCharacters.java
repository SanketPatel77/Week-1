import java.util.Scanner;

public class UniqueCharacters {

    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Reached the end of the string
        }
        return length;
    }

    // Method to find unique characters in a string using charAt()
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
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

        // Create a new array to store the unique characters without extra spaces
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueCharacters[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Display unique characters
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();

        scanner.close();
    }
}
