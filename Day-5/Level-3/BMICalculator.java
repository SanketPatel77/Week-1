import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] heightWeightArray) {
        String[][] bmiData = new String[10][4]; // 2D String array to store height, weight, BMI, and status

        for (int i = 0; i < 10; i++) {
            double weight = heightWeightArray[i][0];
            double heightInCm = heightWeightArray[i][1];
            double heightInMeters = heightInCm / 100; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters); // Calculate BMI

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }

            // Store data in the 2D String array
            bmiData[i][0] = String.format("%.2f", heightInCm);
            bmiData[i][1] = String.format("%.2f", weight);
            bmiData[i][2] = String.format("%.2f", bmi);
            bmiData[i][3] = status;
        }

        return bmiData;
    }

    // Method to display BMI data in a tabular format
    public static void displayBMIData(String[][] bmiData) {
        System.out.printf("%10s %10s %10s %15s\n", "Height (cm)", "Weight (kg)", "BMI", "Status");
        System.out.println("----------------------------------------------------------");

        for (String[] personData : bmiData) {
            System.out.printf("%10s %10s %10s %15s\n", personData[0], personData[1], personData[2], personData[3]);
        }
    }

    public static void main(String[] args) {
		//create scanner object
        Scanner scanner = new Scanner(System.in);
        double[][] heightWeightArray = new double[10][2]; // Array to store height and weight

        System.out.println("Enter the weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d:\n", i + 1);
            System.out.print("Weight (kg): ");
            heightWeightArray[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            heightWeightArray[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and status
        String[][] bmiData = calculateBMI(heightWeightArray);

        // Display BMI data
        displayBMIData(bmiData);

        scanner.close();
    }
}
