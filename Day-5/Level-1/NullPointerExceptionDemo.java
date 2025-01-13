public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null; // Initialize the variable to null
        System.out.println("Generating NullPointerException...");
        // Attempt to call a method on the null object
        System.out.println(text.length()); // This will throw NullPointerException
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        String text = null; // Initialize the variable to null
        try {
            System.out.println("Attempting to call a method on null...");
            System.out.println(text.length()); // This will throw NullPointerException
        } catch (NullPointerException e) {
            // Handling the exception
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call the method to generate NullPointerException
        try {
            generateNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        System.out.println("\nNow calling the method with exception handling...");

        // Call the method with exception handling
        handleNullPointerException();
    }
}
