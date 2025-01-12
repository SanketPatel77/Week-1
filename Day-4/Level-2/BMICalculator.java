import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
		//create scanner
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][3]; // 10 rows for members, 3 columns for weight, height, and BMI

        // Input weight and height for 10 members
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(data);

        // Get BMI status for each person
        String[] bmiStatus = getBMIStatus(data);

        // Display height, weight, BMI, and BMI status
		System.out.println("Weight (kg) Height (cm) BMI BMI Status");
		for (int i = 0; i < 10; i++) {
		System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2] + " " + bmiStatus[i]);
}

    }

    // Method to calculate BMI and populate the array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert height from cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // BMI formula
        }
    }

    // Method to determine BMI status
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25 && bmi <= 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
}
