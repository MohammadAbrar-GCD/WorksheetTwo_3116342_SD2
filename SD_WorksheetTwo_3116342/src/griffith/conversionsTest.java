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
	
	 @Test
	    public void testDollarToEuro() {
	        conversions conversions = new conversions(); 

	        // Test different ranges
	        assertEquals(0.91, conversions.dollarToEuro(1), 0.001); 
	        assertEquals(9.1, conversions.dollarToEuro(10), 0.001); 
	        assertEquals(0.0, conversions.dollarToEuro(0), 0.001); 
	    }
	 
	 @Test
	    public void testStringToInteger() {
	        conversions conversions = new conversions();

	        // Test different string inputs
	        assertEquals(123, conversions.stringToInteger("123"));
	        assertEquals(-45, conversions.stringToInteger("-45"));
	        assertEquals(0, conversions.stringToInteger("0"));
	    }
	 
	 public void testIntegerToString() {
	        conversions conversions = new conversions();

	        // Test different integer inputs
	        assertEquals("123", conversions.integerToString(123));
	        assertEquals("-45", conversions.integerToString(-45));
	        assertEquals("0", conversions.integerToString(0));
	    }
	 
	 @Test
	    public void testSwitchCase() {
	        conversions conversions = new conversions();

	        // Test switching case
	        assertEquals("hELLO wORLD", conversions.switchCase("Hello World"));
	        assertEquals("tEsT123", conversions.switchCase("TeSt123"));
	        assertEquals("1234", conversions.switchCase("1234")); //
	    }
	 
	// Switches uppercase letters to lowercase and vice versa
	    public String switchCase(String input) {
	        StringBuilder result = new StringBuilder();
	        
	        for (char c : input.toCharArray()) {
	            if (Character.isUpperCase(c)) {
	                result.append(Character.toLowerCase(c));
	            } else if (Character.isLowerCase(c)) {
	                result.append(Character.toUpperCase(c));
	            } else {
	                result.append(c); // Keep non-alphabetic characters unchanged
	            }
	        }
	        
	        return result.toString();
	    }
	 
	 

}
