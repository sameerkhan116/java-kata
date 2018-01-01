import java.util.Arrays;

public class ProdFib { 
	
	// must be public for codewars	
	
	public static long[] productFib(long prod) {
		long x = 0;
		while(fib(x) * fib(x + 1) < prod) x++;
		return fib(x) * fib(x+1) == prod ? (new long[] {fib(x), fib(x+1), 1}) : new long[] {fib(x), fib(x+1), 0};
	}
	
	public static long fib(long n) {
		long a = 0, b = 1, c;
		if(n == 0) return a;
		for(int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}
	
	public static void main(String[] args) {
//		System.out.println(productFib(4895));
		long a = 4456077604922913920L;
		System.out.println(Arrays.toString(productFib(a)));
		System.out.println(Arrays.toString(productFib(4895)));
		System.out.println(fib(9));
	}
	
}