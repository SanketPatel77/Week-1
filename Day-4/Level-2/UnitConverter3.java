import java.util.Scanner;

class UnitConverter3 {

    // Main method for testing
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking input from the user for various conversions
        System.out.println("Enter Fahrenheit to convert to Celsius:");
        double fahrenheit = input.nextDouble();

        System.out.println("Enter Celsius to convert to Fahrenheit:");
        double celsius = input.nextDouble();

        System.out.println("Enter pounds to convert to kilograms:");
        double pounds = input.nextDouble();

        System.out.println("Enter kilograms to convert to pounds:");
        double kilograms = input.nextDouble();

        System.out.println("Enter gallons to convert to liters:");
        double gallons = input.nextDouble();

        System.out.println("Enter liters to convert to gallons:");
        double liters = input.nextDouble();

        // Displaying the conversion results
        System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
        System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");
        System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");

        // Close the Scanner object
        input.close();
    }

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
}
