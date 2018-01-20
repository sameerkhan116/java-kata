import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class repeatedDNA {
	public List<String> findRepeatedDNA(String word) {
		Set<String> seen = new HashSet<String>();
		List<String> repeated = new ArrayList<String>();
		for(int i = 0; i < word.length() - 9; i++) {
			String sub = word.substring(i, i+10);
			if(!seen.add(sub)) repeated.add(sub);
		}
		return repeated;
	}
	
	public static void main(String[] args) {
		repeatedDNA x = new repeatedDNA();
        System.out.println(x.findRepeatedDNA("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        System.out.println(x.findRepeatedDNA("AAAAAAAAAAA"));  
	}
}
