package cvAssignment;

import java.util.Scanner;

public class romanNUmber {

	public class RomanToInteger {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Roman numeral: ");
	        String romanNumeral = scanner.nextLine().toUpperCase(); // Convert to uppercase for simplicity

	        int result = romanToInteger(romanNumeral);
	        System.out.println("Equivalent integer: " + result);
	    }

	    private static int romanToInteger(String romanNumeral) {
	        int result = 0;

	        for (int i = 0; i < romanNumeral.length(); i++) {
	            char currentChar = romanNumeral.charAt(i);
	            int currentValue = getRomanValue(currentChar);

	            // If the current value is less than the next value, subtract it; otherwise, add it
	            if (i + 1 < romanNumeral.length()) {
	                char nextChar = romanNumeral.charAt(i + 1);
	                int nextValue = getRomanValue(nextChar);

	                if (currentValue < nextValue) {
	                    result -= currentValue;
	                } else {
	                    result += currentValue;
	                }
	            } else {
	                result += currentValue;
	            }
	        }

	        return result;
	    }

	    private static int getRomanValue(char romanChar) {
	        switch (romanChar) {
	            case 'I':
	                return 1;
	            case 'V':
	                return 5;
	            case 'X':
	                return 10;
	            case 'L':
	                return 50;
	            case 'C':
	                return 100;
	            case 'D':
	                return 500;
	            case 'M':
	                return 1000;
	            default:
	                throw new IllegalArgumentException("Invalid Roman numeral character: " + romanChar);
	        }
	    }
	}
}
