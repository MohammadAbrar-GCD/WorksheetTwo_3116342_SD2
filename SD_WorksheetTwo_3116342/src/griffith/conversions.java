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


    // Converts an integer to a string
    public String integerToString(int val) {
        return String.valueOf(val); // Converts int to string
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
