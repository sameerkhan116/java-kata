import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {
	public static List<String> fizzBuzz(int n) {
		List<String> x = new ArrayList<String>();
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0 && i % 5 == 0) x.add("FizzBuzz");
			else if(i % 3 == 0) x.add("Fizz");
			else if(i % 5 == 0) x.add("Buzz");
			else x.add(String.valueOf(i));
		}
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(fizzBuzz(15));
	}
}
