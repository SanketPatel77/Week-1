import java.util.*;

class VolumeOfEarth{
	public static void main(String [] args){
		double radius = 6378; // radius of earth
		
		//formula = (4/3) * PI * radius^3
		double volumeOfEarthInKm = ((4.0/3.0) * Math.PI * Math.pow(radius,3)); // volume in cubic kilometers
		double volumeOfEarthInMiles = (volumeOfEarthInKm/(Math.pow(1.6,3))); // volume in cubic miles
		
		// result for volume of earth in cubic kilometer and cubic miles
		System.out.println("The volume of earth in cubic kilometer is "+volumeOfEarthInKm+" and cubic miles is "+volumeOfEarthInMiles);
	}
}