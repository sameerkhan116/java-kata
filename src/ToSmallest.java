import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ToSmallest {
	/*
	 * Get list of all numbers in n and sort them.
	 * Compare orig list with sorted. If element at
	 * orig[curr] > sorted[curr]. orig[curr] = sorted[curr]
	 * orig[indexOf(sorted[0])] = orig[0]
	 * else, compare next two elements in the lists
	 * 
	 */
    
    public static long[] smallest(long n) {
//	public static String smallest(long n) {
		String[] x = Long.toString(n).split("");
		List<Integer> orig = new ArrayList<Integer>();
		List<Integer> sorted = new ArrayList<Integer>();
		int curr = 0;
		String fin = "";
		long dig = 0;
		
		/* Converting n to list of integers */
		for(int i = 0; i < x.length; i++) {
			orig.add(Integer.parseInt(x[i]));
		}
		
		/* Sorting original list of integers */
		Arrays.sort(x, new Comparator<String>() {
			public int compare(String a, String b) {
				Integer x = Integer.parseInt(a);
				Integer y = Integer.parseInt(b);
				return x.compareTo(y);
			}
		});
		
		/* Converting sorted x to list */
		for(int i = 0; i < x.length; i++) {
			sorted.add(Integer.parseInt(x[i]));
		}
		
		/* Moving 1 digit to get the smallest number */
		while(curr < orig.size()) {
			if(orig.get(curr) > sorted.get(curr)) {
				dig = orig.indexOf(sorted.get(curr));
				orig.remove(orig.indexOf(sorted.get(curr)));
				orig.add(curr, sorted.get(curr));
				break;
			}
			else {
				curr++;
			}
		}
		
		/* Converting list to long[] */
		for(int i = 0; i < orig.size(); i++) {
			fin += orig.get(i);
		}
		long main = Long.decode(fin.charAt(0) == '0' ? fin.substring(1) : fin);
	
		return new long[] {main, dig, curr};
    }
    
    public static void main(String[] args) {
    		System.out.println(smallest(261235));
    		System.out.println(smallest(209917));
    		System.out.println(smallest(285365));
    		System.out.println(smallest(269045));
    		System.out.println(smallest(296837));
    }
}