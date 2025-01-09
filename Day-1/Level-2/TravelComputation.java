import java.util.Scanner;

class TravelComputation {
   
   public static void main(String[] args) {

      // Create a Scanner object for user input
      Scanner scanner = new Scanner(System.in);

      // Taking user input for name
      System.out.print("Enter your name: ");
      String name = scanner.nextLine();

      // Taking user input for cities
      System.out.print("Enter the starting city: ");
      String fromCity = scanner.nextLine();

      System.out.print("Enter the via city: ");
      String viaCity = scanner.nextLine();

      System.out.print("Enter the destination city: ");
      String toCity = scanner.nextLine();

      // Taking user input for distances 
      System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in km): ");
      double distanceFromToVia = scanner.nextDouble();

      System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in km): ");
      double distanceViaToFinalCity = scanner.nextDouble();

      // Taking user input for time taken 
      System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (hours): ");
      int hoursFromToVia = scanner.nextInt();
      System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (minutes): ");
      int minutesFromToVia = scanner.nextInt();

      System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (hours): ");
      int hoursViaToFinalCity = scanner.nextInt();
      System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (minutes): ");
      int minutesViaToFinalCity = scanner.nextInt();

      // Compute the total distance
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Convert the time to minutes and compute total time
      int totalTimeInMinutes = (hoursFromToVia * 60 + minutesFromToVia) + (hoursViaToFinalCity * 60 + minutesViaToFinalCity);
      
      // Convert total time to hours and minutes
      int totalHours = totalTimeInMinutes / 60;
      int totalMinutes = totalTimeInMinutes % 60;

      // Print the travel details
      System.out.println("\nTravel Details for " + name + ":");
      System.out.println("The total distance from " + fromCity + " to " + toCity + " via " + viaCity + " is " 
                         + totalDistance + " km.");
      System.out.println("The total time taken for the journey is " + totalHours + " hours and " + totalMinutes + " minutes.");
      
      // Close the scanner
      scanner.close();
   }
}
