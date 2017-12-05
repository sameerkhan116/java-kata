
public class reverseArrayDigit {
	public static int[] digitize(long n) {
	    char[] arr = new StringBuilder(Long.toString(n)).reverse().toString().toCharArray();
	    int[] fin = new int[arr.length];
	    for(int i = 0; i < arr.length; i++) {
	    		fin[i] = arr[i] - '0';
	    }
	    return fin; 
    }
	
	public static void main(String[] args) {
//		digitize(35231);
		System.out.println(digitize(35231));
	}
}
