import java.util.*;

public class SmileFaces {
  
	public static int countSmileys(List<String> arr) {
		int count = 0;
		for(String x : arr) {
			if(x.matches("[:;][-~]?[)D]")) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add(":)"); a.add(":D"); a.add(":-}"); a.add(":-()");
		System.out.println(countSmileys(a));
	}
}