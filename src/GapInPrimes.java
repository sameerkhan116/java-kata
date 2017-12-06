class GapInPrimes {
    
    public static long[] gap(int g, long m, long n) {
        long lastPrime = 0;
        int x = Integer.parseInt(Long.toString(m));
        int y = Integer.parseInt(Long.toString(n));
        for(int i = x; i < y; i++) {
        		if(isPrime(i)) {
        			if(lastPrime == 0) {
        				lastPrime = i;
        			} else if(i - lastPrime == g) {
        				return new long[] {lastPrime, i};
        			} else {
        				lastPrime = i;
        			}
        		}
        }
        return null;
    }
    
    public static boolean isPrime(long n) {
    		if(n == 2) {
    			return true;
    		}
    		if(n % 2 != 0) {
    			for(int i = 2; i <= n/2; i++) {
    				if(n % i == 0) {
    					return false;
    				}
    			}
    			return true;
    		}
    		return false;
    }
    
    public static void main(String[] args) {
    		System.out.println(gap(2,3,50));
    }
}