import java.util.Scanner;

public class TemperatureConversionToFahrenheit {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Print the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");

        // Close the scanner
        scanner.close();
    }
}
