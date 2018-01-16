import java.util.List;
import java.util.ArrayList;

public class uniquePermute {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(nums.length == 0) return result;
		backtrack(result, nums, new ArrayList<Integer>(), 0);
		return result;
	}
	
	public void backtrack(List<List<Integer>> result, int[] nums, List<Integer> curr, int index) {
		if(curr.size() == nums.length) {
			result.add(curr);
			return;
		}
		
		int n = nums[index];
		for(int i = 0; i <= curr.size(); i++) {
			List<Integer> copy = new ArrayList<Integer>(curr);
			copy.add(i, n);
			backtrack(result, nums, copy, index + 1);
		}
	}
	
	public static void main(String[] args) {
		uniquePermute x = new uniquePermute();
		System.out.println(x.permute(new int[] {1,2,3}));
		System.out.println(x.permute(new int[] {1,1,2}));
	}
}
