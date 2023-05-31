import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import java.lang.IllegalArgumentException;

class BikeTripTest {

	@Test
	void testDistanceTooShort() {
		assertThrows(IllegalArgumentException.class, () -> {
			new BikeTrip(new String[] {"2021-05-31T23:57:25","2021-06-01T00:05:46","012","Laajalahden aukio","100","Teljäntie","2043","9"});
		});
	}

}
