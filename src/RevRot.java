import java.util.ArrayList;
import java.util.List;

class RevRot {
    
	public static String revRot(String string, int sz) {
		if(string.length() == 0 || sz <= 0) return "";
		List<String> x = new ArrayList<String>();
		List<String> b = new ArrayList<String>();
		int i = 0;
		while(i + sz <= string.length()) {
			x.add(string.substring(i, i + sz));
			i += sz;
		}
		for(String a : x) {
			int result = 0;
			for(char c : a.toCharArray()) {
				result += Math.pow((c - '0'), 3);
			}
			if(result % 2 == 0) {
				b.add(new StringBuilder(a).reverse().toString());
			}
			else {
				b.add(a.substring(1) + a.charAt(0));
			}
		}
		return String.join("", b.stream().toArray(String[]::new));
	}
	
	public static void main(String[] args) {
		System.out.println(revRot("123456987654", 6));
		System.out.println(revRot("733049910872815764", 5));
		System.out.println(revRot("1234", 5));
	}
}