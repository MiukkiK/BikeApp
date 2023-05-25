/**
 * Data class that contains the departure and return times and stations of a bike trip.
 * @author Mia Kallio
 *
 */
public class BikeTrip {
	String departureTime;
	String departureDate;
	String departureStation;
	int departureStationId;
	String returnTime;
	String returnDate;
	String returnStation;
	int returnStationId;

/**
 * Bike trip constructor from a String array of data
 * @param data Array of String to import.
 */
	public BikeTrip (String[] data) {
		String[] timeAndDate = data[0].split("T");
		departureTime = timeAndDate[0];
		departureDate = timeAndDate[1];
		timeAndDate = data[1].split("T");
		returnTime = timeAndDate[0];
		returnDate = timeAndDate[1];
		departureStationId = Integer.parseInt(data[2]);
		departureStation = data[3];
		returnStationId = Integer.parseInt(data[4]);
		returnStation = data[5];
	}
	
	public String getDepartureTime() {
		return departureTime;
	}
	
	public String getDepartureDate() {
		return departureDate;
	}
	
	public String getDepartureStation() {
		return departureStation;
	}
	
	public int getDepartureStationId() {
		return departureStationId;
	}
	
	public String getReturnTime() {
		return returnTime;
	}
	
	public String getReturnDate() {
		return returnDate;
	}
	
	public String getReturnStation() {
		return returnStation;
	}
	
	public int getReturnStationId() {
		return returnStationId;
	}
}
	