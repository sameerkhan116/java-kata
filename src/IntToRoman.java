public class IntToRoman {
	private static final String[] numerals = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	private static final int[] values = new int[] {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

	public String intToRoman(int value) {
		
		int i = 0;
		StringBuilder numeral = new StringBuilder();
		
		if(value > 3999 || value < 1) throw new IllegalArgumentException("Please try a number greater than 0 and less than 4000");
		
		while (value > 0) {
			if(value - values[i] >= 0) {
				numeral.append(numerals[i]);
				value -= values[i];
			} else {
				i++;
			}
		}
		return numeral.toString();
	}

	public static void main(String[] args) {
		IntToRoman x = new IntToRoman();
		System.out.println(x.intToRoman(18));
	}

}