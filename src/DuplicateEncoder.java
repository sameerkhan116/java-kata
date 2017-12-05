import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
	static String encode(String word) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < word.length(); i++ ) {
			char c = word.toLowerCase().charAt(i);
			if(map.containsKey(c)) {
				int cnt = map.get(c);
				map.put(c,  ++cnt);
			} else {
				map.put(c, 1);
			}
		}
		
		StringBuilder x = new StringBuilder();
		for(int i = 0; i < word.length(); i++) {
			char c = word.toLowerCase().charAt(i);
			if(map.get(c) > 1) {
				x = x.append(")");
			} else if(map.get(c) == 1) {
				x.append("(");
			}
		}
		
		return x.toString();
	}
	
	public static void main(String[] args) {
		DuplicateEncoder x = new DuplicateEncoder();
		System.out.println(x.encode("Success"));
	}
}
