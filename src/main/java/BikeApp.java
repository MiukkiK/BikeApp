
public class BikeApp {

	public static void main(String... args) {
		
		BikeTrip[] bikeTrips = FileHandler.readTripsFromFile(args[0]);
		System.out.println("Bike trips loaded from file.");
		
	}

}
