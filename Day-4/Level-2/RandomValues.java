import java.util.Arrays;

public class RandomValues {
    public static void main(String[] args) {
        // Generate an array of five 4-digit random numbers
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Find average, min, and max
        double[] results = findAverageMinMax(randomNumbers);

        // Print results
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));
        System.out.printf("Average: %.2f%n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }

    // Method to generate an array of 4-digit random numbers.
     
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + (int) (Math.random() * 9000); // Generate a number between 1000 and 9999
        }
        return numbers;
    }

    // Method to find the average, minimum, and maximum values of an array.
     
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        // Calculate sum, min, and max
        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Return results
        return new double[]{average, min, max};
    }
}
