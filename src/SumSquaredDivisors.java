import java.util.ArrayList;
import java.util.List;

public class SumSquaredDivisors {
	
	public static String listSquared(long m, long n) {
		int x = Integer.parseInt(Long.toString(m)); 
		int y = Integer.parseInt(Long.toString(n));
		List<String> a = new ArrayList<String>();
		for(int i = x; i < y; i++) {
			if(isPerfectSquare(listOfSquares(i))) a.add("[" + i + ", " + listOfSquares(i) + "]");
		}
		return a.toString();
	}
	
	public static int listOfSquares(int x) {
		List<Integer> a = new ArrayList<Integer>();
		int result = 0;
		for(int i = 1; i <= x; i++) {
			if(x % i == 0) a.add(i*i); 
		}
		for(int s : a) {
			result += s;
		}
		return result;
	}
	
	public static boolean isPerfectSquare(int x) {
		double sqrt = Math.sqrt(x);
		int a = (int)sqrt;
		return Math.pow(a, 2) == Math.pow(sqrt, 2);
	}

/****************** Main function ***********************/
	public static void main(String[] args) {
		System.out.println(listSquared(42,250));
//		System.out.println(listOfSquares(40));
//		System.out.println(isPerfectSquare(2210));
	}
	
}