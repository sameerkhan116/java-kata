import java.util.ArrayList;
import java.util.Collections;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {
        ArrayList<Character> arr = new ArrayList<Character>();
        for(char c : s1.toCharArray()) {
        		if(!arr.contains(c)) {
        			arr.add(c);
        		}
        }
        for(char c : s2.toCharArray()) {
	    		if(!arr.contains(c)) {
	    			arr.add(c);
	    		}
	    }
        Collections.sort(arr);
        String fin = "";
        
        for(char c : arr) {
        		fin += c;
        }
        return fin;
    }
    
    public static void main(String[] args) {
    		TwoToOne x = new TwoToOne();
    		String a = "xyaabbbccccdefww";
    		String b = "xxxxyyyyabklmopq";
    		System.out.println(x.longest(a, b));
    }
}
