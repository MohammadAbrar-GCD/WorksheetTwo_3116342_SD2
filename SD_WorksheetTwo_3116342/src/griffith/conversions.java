package griffith;

public class conversions {
	
	//Converts euro to dollar
	//1 EUR = 1.1 USD
	public double euroToDollar(double euro) {
	    return euro * 1.1;
	}
	  
	 // Converts Dollars to Euro
	// 1 USD = 0.91 EUR)
    public double dollarToEuro(double dollar) {
        return dollar * 0.91; 
    }
    // Converts a numeric string to an integer
    public int stringToInteger(String val) {
        return Integer.parseInt(val); // Converts string to int
    }


	    public String integerToString(int val) {
	        return ""; // stub method
	    }

	    public String switchCase(String input) {
	        return ""; // stub method
	    }
}
