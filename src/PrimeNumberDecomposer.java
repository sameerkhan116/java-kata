import java.util.ArrayList;
import java.util.List;

class PrimeNumberDecomposer {
  /**
     Return value: List of all prime factors of a given number n
  */
	  public static Long[] getAllPrimeFactors(long n) {
		  // Get list of all primes for a number
		  List<Integer> list = new ArrayList<Integer>();
		  for(int i = 2; i <= Math.sqrt(n); i++) {
			  while(n % i == 0) {
				  list.add(i);
				  n /= i;
			  }
		  }
		  if(n > 2) list.add((int)n);
		  
		  // Convert list to long[] type array
		  Long[] arr = new Long[list.size()];
		  for(int i = 0; i < list.size(); i++) {
			  arr[i] = (long)list.get(i);
		  }
		  
		  return arr;
	  }
  /**
     Return value: List containing two lists, first contains all prime factors without duplicates,
     second containing the count, how often each prime factor occurred.
     Return code always contains two lists.
     
     e.g.: getUniquePrimeFactorsWithCount(100) = {{2,5},{2,2}) // prime 2 occurs 2 times, prime 2 occurs 5 times, 
  */
	  public static Long[][] getUniquePrimeFactorsWithCount(long n) {
		  Long[] x = getAllPrimeFactors(n);
		  // Get all unique prime numbers in nums list
		  List<Integer> nums = new ArrayList<Integer>();
		  for(int i = 0; i< x.length; i++) {
			  if(!nums.contains(LongToInt(x[i]))) nums.add(LongToInt(x[i]));
		  }
		  
		  // Get count of all unique prime numbers in count array
		  int[] count = new int[nums.size()];
		  for(Long a : x) {
			  if(nums.contains(LongToInt(a))) count[nums.indexOf(LongToInt(a))] += 1;
		  }
		  
		  // convert nums to long type array
		  Long[] g = new Long[nums.size()];
		  for(int i = 0; i < nums.size(); i++) {
			  g[i] = Long.decode(String.valueOf(nums.get(i)));
		  }
		  // convert count to long type array
		  Long[] h = new Long[nums.size()];
		  for(int i = 0; i < nums.size(); i++) {
			  h[i] = Long.decode(String.valueOf(count[i]));
		  }
		  return new Long[][] {g, h};
	  }
  /**
     Return value: List containing product of same prime factors,
     e.g.: 45 = 3*3*5 ==>  {3^2,5^1} == {9,5}
     e.g.: getUniquePrimeFactorsWithCount(100) = {{2,5},{2,2}) // prime 2 occurs 2 times, prime 2 occurs 5 times, 
  */
	  public static Long[] getPrimeFactorPotencies(long n) {
		  Long[][] a = getUniquePrimeFactorsWithCount(n);
		  Long[] nums = a[0];
		  Long[] count = a[1];
		  int[] result = new int[nums.length];
		  for(int i = 0; i < nums.length; i++) {
			  result[i] = (int) Math.pow(LongToInt(nums[i]), LongToInt(count[i])); 
		  }
		  Long[] b = new Long[nums.length];
		  for(int i = 0; i < nums.length; i++) {
			  b[i] = Long.decode(String.valueOf(result[i]));
		  }
		  return b;
	  }
	  
	  public static int LongToInt(Long x) {
		  return Integer.parseInt(Long.toString(x));
	  }
  
	  public static void main(String[] args) {
		  System.out.println(getAllPrimeFactors(100));
		  System.out.println(getUniquePrimeFactorsWithCount(100));
		  System.out.println(getPrimeFactorPotencies(100));
	  }
}