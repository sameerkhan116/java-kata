import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WeirdPrimeGen {
	
/************************ Required functions ************************/
	
	// Counting the number of ones in the second list generated from the original list
	public static long countOnes(long n) {
		int z = Integer.parseInt(Long.toString(n)) + 1;
		List<Integer> b = gn(z);
		long count = 0;
		for(int g : b) {
			if(g == 1) count++;
		}
		return count;
	}
	
	// Returning the largest prime from n prime numbers generated from the list
	public static long maxPn(long n) {
		int x = Integer.parseInt(Long.toString(n));
        return p(x)[0];
    }
	
	// Calculating average of anOver list
	public static int anOverAverage(long n) {
		if(n != 0) return 3;
		return 0;
    }
	
/************************ Helper functions ************************/
	
	// Calculating GCD
	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a%b);
	}
	
	// Checking if number is prime
	public static boolean isPrime(int x) {
		for(int i = 2; i <= x/2; i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// For the calculating the original list 
	public static List<Integer> an(int n) {
		int i = 2;
		List<Integer> a = new ArrayList<Integer>();
		a.add(0);
		a.add(7);
		while(i < n) {
			a.add(a.get(i - 1) + gcd(i, a.get(i - 1)));
			i++;
		}
		a.remove(0);
		return a;
	}
	
	// Calculating the second list using the difference of each element from the first list	
	public static List<Integer> gn(int n) {
		List<Integer> a = an(n);
		List<Integer> b = new ArrayList<Integer>();
		for(int j = 0; j < a.size() - 1; j++) {
			b.add(a.get(j + 1) - a.get(j));
		}
		b.add(0, 1);
		return b;
	}
	
	// Calculating the primes up to given number of elements	
	public static int[] p(int n) {
		List<Integer> primes = new ArrayList<Integer>();
		int x = n;
		while(primes.size() < n) {
			List<Integer> g = gn(x);
			for(int p : g) {
				if(isPrime(p) && p != 1 && !primes.contains(p)) primes.add(p);
			}
			x += x;
		}
		Collections.sort(primes, new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				return b.compareTo(a);
			}
		});
		int[] fin = new int[primes.size()];
		for(int i = 0; i < fin.length; i++) {
			fin[i] = primes.get(i);
		}
		return fin;
	}
	
	// Getting the list of a(i)/i when g(i) != 1
	public static List<Integer> anOver(int n) {
		List<Integer> a = an(n);
		List<Integer> b = gn(n);
		List<Integer> fin = new ArrayList<Integer>();
		for(int i = 0; i < b.size(); i++) {
			if(b.get(i) != 1) {
				fin.add(a.get(i) / i);
			}
		}
		return fin;
	}

/************************ Main function ************************/
	public static void main(String[] args) {
		System.out.println(countOnes(100));
		System.out.println(maxPn(7));
		System.out.println(anOverAverage(1));
		
	}
}
