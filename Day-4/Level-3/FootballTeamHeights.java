import java.util.Arrays;

public class FootballTeamHeights {
    public static void main(String[] args) {
        // Create an array of 11 players' heights
        int[] heights = generateRandomHeights(11);

        // Find results
        int totalHeight = findSum(heights);
        double meanHeight = findMean(totalHeight, heights.length);
        int shortestHeight = findShortest(heights);
        int tallestHeight = findTallest(heights);

        // Display results
        System.out.println("Heights of players: " + Arrays.toString(heights));
		System.out.println("Total Heights of players: " + totalHeight);
        System.out.println("Mean Height: " + String.format("%.2f", meanHeight) + " cm");
        System.out.println("Shortest Height: " + shortestHeight + " cm");
        System.out.println("Tallest Height: " + tallestHeight + " cm");
    }

    // Method to generate an array of random heights between 150 and 250 cm.
    public static int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int) (Math.random() * 101); // Random height between 150 and 250
        }
        return heights;
    }

    //Method to find the sum of all elements in the array.     
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height.
     
    public static double findMean(int totalHeight, int count) {
        return (double) totalHeight / count;
    }

    // Method to find the shortest height.
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            shortest = Math.min(shortest, height);
        }
        return shortest;
    }

    //Method to find the tallest height.
    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }
}
