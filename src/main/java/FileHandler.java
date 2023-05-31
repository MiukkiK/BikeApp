import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;

public class FileHandler {
	public static BikeTrip[] readTripsFromFile(String source) {
		var list = new LinkedList<BikeTrip>();
		try(BufferedReader reader = new BufferedReader(new FileReader(source))) {
			String line;
			reader.readLine();
			while ((line = reader.readLine()) != null) {
				try {
					list.add(new BikeTrip(line.split(",")));
				} catch (IllegalArgumentException e) {
					// TODO add counter for ignored input lines
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list.toArray(new BikeTrip[list.size()]);
	}
}
