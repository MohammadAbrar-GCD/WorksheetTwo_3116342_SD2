package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class conversionsTest {

	@Test
	public void testEuroToDollar() {
	    conversions conversions = new conversions();
	    
	    // Test different ranges
	    assertEquals(1.1, conversions.euroToDollar(1), 0.001);
	    assertEquals(11.0, conversions.euroToDollar(10), 0.001);
	    assertEquals(0.0, conversions.euroToDollar(0), 0.001);
	}

}
