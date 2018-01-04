import java.util.ArrayList;
import java.util.List;

public class selfDiv {
	
	public List<Integer> output(int left, int right) {
		List<Integer> nums = new ArrayList<Integer>();
		for(int i = left; i <= right; i++) {
			if(selfDividing(i)) {
				nums.add(i);
			}
		}
		return nums;
	}
	
	public boolean selfDividing(int n) {
		for(char c: String.valueOf(n).toCharArray()) {
			if(c == '0' || n % (c - '0') > 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		selfDiv x = new selfDiv();
		System.out.println(x.output(1, 22));
		
	}
}