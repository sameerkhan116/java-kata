import java.util.HashSet;
import java.util.Set;

public class nearbyDuplicate {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> x = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
        		if(x.add(nums[i]) == false) return true;
        		if(x.size() == k + 1) x.remove(nums[i - k]);
        }
        return false;
    }
	
	public static void main(String[] args) {
		nearbyDuplicate x = new nearbyDuplicate();
		System.out.println(x.containsNearbyDuplicate(new int[] {99,99}, 2));
	}
}
