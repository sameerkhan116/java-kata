import java.util.ArrayList;
import java.util.List;

public class factorCombo {
	
	public static List<List<Integer>> factors(int n) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		helper(result, new ArrayList<Integer>(), n, 2);
		return result;
	}
	
	public static void helper(List<List<Integer>>result, List<Integer>item, int n, int start) { 
		if(n <= 1) {
			if(item.size() > 1) result.add(new ArrayList<Integer>(item));
			return;
		}
		
		for(int i = start; i <= n; ++i) {
			if(n % i == 0) {
				item.add(i);
				helper(result, item, n/i, i);
				item.remove(item.size() - 1);
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(factors(8));
	}
}
