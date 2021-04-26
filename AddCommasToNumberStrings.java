package week3;

import acm.program.ConsoleProgram;

public class AddCommasToNumberStrings extends ConsoleProgram {
	// Adds commas to number input by user.
	private String addCommasToNumericString(String digits) {
		String result = ""; 
		int length = digits.length();
		int rem = length % 3;
		int div = length / 3;
		int index1 = 0;
		int index2 = length;
			if(div == 1 && rem > 0) {
				//char dig = digits.charAt(index1);
				//result = Character.toString(dig);
				String dig1 = digits.substring(index1, rem) + ",";
				String dig2 = digits.substring(rem, index2);
				digits = dig1 + dig2;
				return digits;
			} else if (div == 2 && rem == 0) {
				String dig3 = digits.substring(index1, 3) + ",";
				String dig4 = digits.substring(3, 6);
				digits = dig3 + dig4;
				return digits;
			} else if (div == 2 && rem > 0) {
				String dig3r = digits.substring(index1, rem) + ",";
				String dig4r = digits.substring(rem, 5) + ",";
				String dig5r = digits.substring(5, 8);
				digits = dig3r + dig4r + dig5r;
				return digits;	
			} else if (div == 3 && rem == 0) {
				String dig5 = digits.substring(index1, 3) + ",";
				String dig6 = digits.substring(3, 6) + ",";
				String dig7 = digits.substring(6, 9);
				digits = dig5 + dig6 + dig7;
				return digits;
			} else if (div == 3 && rem > 0) {
				String dig5r = digits.substring(index1, rem) + ",";
				String dig6r = digits.substring(rem, 6) + ",";
				String dig7r = digits.substring(6, 9);
				digits = dig5r + dig6r + dig7r;
				return digits;
			} else if (div <= 1) {
				return digits;
			}
			
			return result;
			
	}

	public void run() {
		while (true) {
			String digits = readLine("Enter a numberic string: ");
			if (digits.length() == 0) break;
			println(addCommasToNumericString(digits));
		}
	}

	
	
}
