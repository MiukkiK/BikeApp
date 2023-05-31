import java.time.LocalDateTime;
import java.lang.IllegalArgumentException;

/**
 * Data class that contains the departure and return times and stations of a bike trip.
 * @author Mia Kallio
 *
 */
public class BikeTrip {
	LocalDateTime departureDateTime;
	String departureStation;
	int departureStationId;
	LocalDateTime returnDateTime;
	String returnStation;
	int returnStationId;
	int distance;
	int duration;

/**
 * Bike trip constructor from a String array of data
 * @param data Array of String to import.
 */
	public BikeTrip (String[] data) {
		departureDateTime = LocalDateTime.parse(data[0]);
		departureStationId = Integer.parseInt(data[2]);
		departureStation = data[3];
		returnDateTime = LocalDateTime.parse(data[1]);
		returnStationId = Integer.parseInt(data[4]);
		returnStation = data[5];
		distance = Integer.parseInt(data[6]);
		duration = Integer.parseInt(data[7]);
		if ((distance < 10) || (duration < 10) || (departureStationId == 0) || (returnStationId == 0)) {
			throw new IllegalArgumentException();
		}
	}
	
	public LocalDateTime getDepartureDateTime() {
		return departureDateTime;
	}
	
	public String getDepartureStation() {
		return departureStation;
	}
	
	public int getDepartureStationId() {
		return departureStationId;
	}
	
	public LocalDateTime getReturnDateTime() {
		return returnDateTime;
	}
	
	public String getReturnStation() {
		return returnStation;
	}
	
	public int getReturnStationId() {
		return returnStationId;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public int getDuration() {
		return duration;
	}
}
	