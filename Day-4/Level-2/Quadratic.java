import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
		//create scanner object
        Scanner scanner = new Scanner(System.in);

        // Input coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Find roots
        double[] roots = findRoots(a, b, c);

        // Display results
        if (roots.length == 2) {
            System.out.println("The equation has two distinct roots:");
            System.out.println("Root 1: " + roots[0]);
            System.out.println("Root 2: " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The equation has one repeated root:");
            System.out.println("Root: " + roots[0]);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }

	//Method to find roots of a quadratic equation.
    public static double[] findRoots(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("Coefficient 'a' cannot be zero for a quadratic equation.");
        }

        // Calculate discriminant (delta)
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta > 0) {
            // Two distinct roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        } else if (delta == 0) {
            // One repeated root
            double root = -b / (2 * a);
            return new double[]{root};
        } else {
            // No real roots
            return new double[]{}; // Empty array
        }
    }
}
