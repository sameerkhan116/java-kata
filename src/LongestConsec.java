import java.util.ArrayList;
import java.util.List;

class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
    		int n = strarr.length;
    		ArrayList<String> arr = new ArrayList<String>();
    		ArrayList<String> tot = new ArrayList<String>();
    		
    		if(n == 0 || k > n || k <= 0) {
    			return "";
    		}
    		
    		for(String s : strarr) {
    			arr.add(s);
    		}
    		
    		for(int i = 0; i < n - k + 1; i++) {
    			String y = "";
    			List<String> x = arr.subList(i, i+k);
    			for(String a : x) {
    				y += a;
    			}
    			tot.add(y);
    		}
    		
    		int largest = tot.get(0).length();
    		int index = 0;
    		
    		for(int i = 0; i < tot.size(); i++) {
    			if(tot.get(i).length() > largest) {
    				largest = tot.get(i).length();
    				index = i;
    			}
    		}
    		
    		return tot.get(index);
    	}
    
    public static void main(String[] args) {
    		System.out.println(longestConsec(new String[] {"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
    }
}