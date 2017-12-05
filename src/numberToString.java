class numberToString {
	public static String numberToString(int num) {
	// Return a string of the number here!
		String x = new StringBuilder().append(num).toString();
		return x;
	}
	
	public static void main(String[] args) {
		numberToString x = new numberToString();
		System.out.println(x.numberToString(123));
	}
}