class numberToString {
	public static String numberToString(int num) {
	// Return a string of the number here!
		String x = new StringBuilder().append(num).toString();
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(numberToString(123));
	}
}