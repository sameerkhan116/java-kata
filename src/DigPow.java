public class DigPow {
	
	public static long digPow(int n, int p) {
		char[] arr = String.valueOf(n).toCharArray();
		double result = 0;
		for(int i = 0; i < arr.length; i++) {
			result += Math.pow((arr[i] - '0'), p);
			p++;
		}
		double k = result / n;
		if(result % k != 0) {
			return -1;
		}
		return (long)k;
	}
	
	public static void main(String[] args) {
		System.out.println(digPow(625, 2));
	}
	
}