
class PrimeConsec {
    
    public static int consecKprimes(int k, long[] arr) {
    		int count = 0;
    		for(int i = 0; i < arr.length - 1; i++) {
    			if(numPrimeFactors(arr[i]) == k && numPrimeFactors(arr[i+1]) == k) {
    				count++;
    			} 
    		}
    		return count;
    }
    
//    public static int numPrimeFactors(long n) {
//    		int x = Integer.parseInt(Long.toString(n));
//    		List<Integer> a = new ArrayList<Integer>();
//    		while(x % 2 == 0) {
//    			a.add(2);
//    			x /= 2;
//    		}
//    		for(int i = 3; i <= Math.sqrt(x); i += 2) {
//    			while(x % i == 0) {
//    				a.add(i);
//    				x /= i;
//    			}
//    		}
//    		if(x > 2) a.add(x);
//    		return a.size();
//    }
    
    public static int numPrimeFactors(long n) {
		int x = Integer.parseInt(Long.toString(n));
		int count = 0;
		for(int i = 2; i <= Math.sqrt(x); i++) {
			while(x % i == 0) {
				count++;
				x /= i;
			}
		}
		if(x > 1) count++;
		return count;
    }
    
    public static void main(String[] args) {
    		System.out.println(consecKprimes(5, new long[] {10116, 10108, 10092, 10104, 10100, 10096, 10088}));
    		System.out.println(numPrimeFactors(10108));
    }
}