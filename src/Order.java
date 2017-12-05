import java.util.Arrays;
import java.util.Comparator;

public class Order {
	public static String order(String words) {
	    String[] sub = words.split(" ");
	    StringBuilder sb = new StringBuilder();
	    Arrays.sort(sub, new Comparator<String>(){
	    		public int compare(String o1, String o2) {
	    			return numberInString(o1).compareTo(numberInString(o2));
	    		}
	    });
	    for(String s : sub) {
	    		sb.append(s + " ");
	    }
	    return sb.toString().trim();
	}
	
	public static Integer numberInString(String x) {
		int find = 0;
		for(char c : x.toCharArray()) {
			if(Character.isDigit(c)) {
				find = c - '0';
			}
		}
		return find;
	}
	
	public static void main(String[] args) {
		System.out.println(order("4of Fo1r pe6ople g3ood th5e the2"));
	}
}
