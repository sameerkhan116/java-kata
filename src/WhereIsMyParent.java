import java.util.ArrayList;
import java.util.Arrays;

class WhereIsMyParent {
	static String findChildren(final String text) {
////	    String[] parents = text.split("(?=[A-Z])");
////	    String[] child = text.split("(?=[a-z])");
//		ArrayList<Character> parents = new ArrayList<Character>();
//		ArrayList<Character> child = new ArrayList<Character>();
//	   	for(char c : text.toCharArray()) {
//	   		if(Character.isUpperCase(c)) parents.add(c);
//	   		if(Character.isLowerCase(c)) child.add(c);
//	   	}
//	   	
//	   	ArrayList<String> fin = new ArrayList<String>();
//	   	
//	   	char[] some = new char[parents.size()];
//	   	
//	   	for(int i = 0; i < some.length; i++) {
//	   		some[i] = parents.get(i);
//	   	}
//	   	
//	   	Arrays.sort(some);
//	   	
//	   	
//	   	for(int i = 0; i < parents.size(); i++) {
//	   		String temp = some[i] + "";
//	   		for(char x : child) {
//		   		if(some[i] == Character.toUpperCase(x)) {
//		   			temp += x;
//		   		}
//	   		}
//	   		fin.add(temp);
//	   	}
//	   	
//	   	String out = "";
//	   	
//	   	for(int i = 0; i < fin.size(); i++) {
//	   		out += fin.get(i);
//	   	}
////	   	return parents.toString();
//	   	return out;
		
		String[] sorted = text.split("");
		Arrays.sort(sorted);
		Arrays.sort(sorted, String.CASE_INSENSITIVE_ORDER);
		return String.join("", sorted);
	}
	
	public static void main(String[] args) {
		System.out.println(findChildren("xXfuUuuF"));
	}
}