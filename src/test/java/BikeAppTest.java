import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BikeAppTest {

	@Test
	void testMainMethod() {
		BikeApp.main("src\\test\\resources\\test_20rows.csv");
	}

}
