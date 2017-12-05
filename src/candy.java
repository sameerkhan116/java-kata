import java.util.HashSet;

public class candy {
	public int distributeCandies(int[] candies) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int c : candies) set.add(c);
		return set.size() >= candies.length / 2 ? candies.length / 2 : set.size();
	}
	
	public static void main(String[] args) {
		candy x = new candy();
		System.out.println(x.distributeCandies(new int[] {1,1,2,2,3,3}));
	}
}
