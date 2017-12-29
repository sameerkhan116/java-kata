import java.util.Arrays;
import java.util.Comparator;

public class HighAndLow {
	public static String HighAndLow(String numbers) {
	    String[] x = numbers.split(" ");
	    int largest = 0, smallest = 0;
	    Arrays.sort(x, new Comparator<String>() {
	    		public int compare(String o1, String o2) {
	    			Integer x = Integer.parseInt(o1);
	    			Integer y = Integer.parseInt(o2);
	    			return x.compareTo(y);
	    		}
	    });
	    return x[0] + " " + x[x.length - 1];
	}
	
	public static void main(String[] args) {
		System.out.println(HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
	}
}
