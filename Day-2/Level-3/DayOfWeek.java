public class DayOfWeek {
    public static void main(String[] args) {
        // Get the month, day, and year from the command-line arguments
        int m = Integer.parseInt(args[0]); // month (1-12)
        int d = Integer.parseInt(args[1]); // day (1-31)
        int y = Integer.parseInt(args[2]); // year (e.g., 2025)

        // Apply the formula to calculate the day of the week
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the day of the week (0 = Sunday, 1 = Monday, 2 = Tuesday, etc.)
        System.out.println("Day of the week: " + d0);
    }
}
