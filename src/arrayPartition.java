import java.util.Arrays;

public class arrayPartition {
	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int result = 0;
		for(int i = 0; i < nums.length; i += 2) {
			result += nums[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		arrayPartition x = new arrayPartition();
		int[] arr = new int[] {1,2,3,4};
		System.out.println(x.arrayPairSum(arr));
	}
}
