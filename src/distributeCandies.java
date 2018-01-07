import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class distributeCandies {
	public static int distributeCandies(int[] candies) {
		List<Integer> x = new ArrayList<Integer>();
		for(int a : candies) x.add(a);
        List<Integer> y = x.stream().distinct().collect(Collectors.toList());
        return x.size() / 2 >= y.size() ? y.size() : x.size() / 2;
    }
	
	public static void main(String[] args) {
		System.out.println(distributeCandies(new int[] {1,1,2,2,3,3}));
		System.out.println(distributeCandies(new int[] {1,1,2,3}));
		System.out.println(distributeCandies(new int[] {1,2,3,4,5,5}));
		System.out.println(distributeCandies(new int[] {1,1,1,1,2,2,2,3,3,3}));
	}
}	
