import java.util.ArrayList;
import java.util.List;

public class KPrimes {
    
    public static long[] countKprimes(int k, long start, long end) {
		List<Long> a = new ArrayList<Long>();
	    for(long i = start; i <= end; i++) {
	    		if(numPrimeFactors(i) == k) {
	    	 		a.add(i);
	    	 	}
	    }
	    long[] arr = new long[a.size()];
	    for(int i = 0; i < a.size(); i++) {
	    		arr[i] = a.get(i);
	    }
	    return arr;
    }
         
    public static int puzzle(int s) {
    		int result = 0;
    		for(long i : countKprimes(1,1,s)) {
    			for(long j : countKprimes(3,1,s)) {
    				for(long k : countKprimes(7,1,s)) {
    					if(i + j + k == s) result++; 
    				}
    			}
    		}
    		return result;
    }
      
     public static int numPrimeFactors(long n) {
 		int count = 0;
 		for(int i = 2; i <= Math.sqrt(n); i++) {
 			while(n % i == 0) {
 				count++;
 				n /= i;
 			}
 		}
 		if(n > 1) count++;
 		return count;
     }
         
     public static void main(String[] args) {
    	 	System.out.println(countKprimes(2, 0, 100));
    	 	System.out.println(puzzle(143));
     }
}