import java.util.Arrays;

public class Fracts {
	public static String convertFrac(long[][] lst) {
		
		if(lst.length == 0) {
			return "";
		}
		
		System.out.println(Arrays.deepToString(lst));
		long result = lst[0][1];
		String x = "";
		
		for(int i = 1; i < lst.length; i++) {
			result = lcm(result, lst[i][1]);
		}
		
		for(int i = 0; i < lst.length; i++) {
			x += "(" + (result/lst[i][1])*lst[i][0] + "," + result + ")";
		}
		return x.trim();
	}
	
	public static long gcd(long a, long b) {
		while(b > 0) {
			long temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static long lcm(long a , long b) {
		return a * (b / gcd(a, b));
	}
	
	public static void main(String[] args) {
		System.out.println(convertFrac(new long[][] { {1, 2}, {1, 3}, {1, 4} }));
//		System.out.println(gcd(6,24));
	}
}
