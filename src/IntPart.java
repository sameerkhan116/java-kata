import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntPart {
	
	public static String part(long n) {
	    List<List<String>> x = partition(n, n, new ArrayList<String>(), new ArrayList<List<String>>());
	    List<Integer> prod = new ArrayList<Integer>();
	    
	    for(List<String> a : x) {
	    		int result = 1;
	    		for(String i : a) {
	    			result *= Integer.parseInt(i);
	    		}
	    		if(!prod.contains(result)) {
	    			prod.add(result);
	    		}
	    }
	    int[] thisisit = new int[prod.size()];
	    double total = 0;
	    
	    for(int i = 0; i < thisisit.length; i++) {
	    		thisisit[i] = prod.get(i);
	    		total += prod.get(i);
	    }
	    
	    Arrays.sort(thisisit);
	    
	    int range = thisisit[thisisit.length - 1] - thisisit[0];
	    double average = total/thisisit.length;
	    double median = 0;
	    
	    if(prod.size() % 2 == 0) {
	    		median = (thisisit[thisisit.length / 2] + thisisit[(thisisit.length / 2) - 1]) / 2.0;
	    }
	    else {
	    		median = thisisit[thisisit.length / 2];
	    }
	    
	    return "Range: " + range + " Average: " + String.format("%.2f", average) + " Median: " + String.format("%.2f", median);
//	    return prod.toString();
	}
	
	public static List<List<String>> partition(long x, long y, List<String> suffix, List<List<String>> lst) {
		int target = Integer.parseInt(Long.toString(x));
		int max = Integer.parseInt(Long.toString(y));
		
		if(target == 0) {
			lst.add(suffix);
		}
		else {
			if(y > 1) {
				partition(target, max - 1, suffix, lst);
			}
			if(y <= target) {
				List<String> tmp = new ArrayList<String>();
				tmp.add(0, String.valueOf(max));
				tmp.addAll(suffix);
				partition(target-max, max, tmp, lst);
			}
		}
		return lst;
//		return lst.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println(part(50));
//		System.out.println(partition(5,5, new ArrayList<String>(), new ArrayList<List<String>>()));
	}
}