import java.util.ArrayList;
import java.util.List;

class Fibkind {
    
    public static long lengthSupUK(int n, int k) {
    		List<Integer> all = list(n);
    		int count = 0;
    		for(int i : all) {
    			if(i >= k) count++;
    		}
    		return count;
    }
	
	public static int u(int x) {
		List<Integer> custFib = list(x);
		return custFib.get(custFib.size() - 1);
	}
	
	public static List<Integer> list(int x) {
		List<Integer> nums = new ArrayList<Integer>()  ;
		nums.add(1);
		nums.add(1);

		if(x > 1) {
			for(int i = 2; i < x; i++) {
				nums.add(nums.get(i - nums.get(i-1)) + nums.get(i - nums.get(i-2)));
			}
		}
		return nums;
	}
    
    public static long comp(int n) {
    		List<Integer> comp = list(n);
    		int count = 0;
    		for(int i = 0; i < comp.size() - 1; i++) {
    			if(comp.get(i) > comp.get(i + 1)) count++;
    		}
    		return count;
    }
    
    public static void main(String[] args) {
    		System.out.println(lengthSupUK(50, 10));
//    		System.out.println(list(23));
//    		System.out.println(u(900));
    		System.out.println(comp(100));
    }
}