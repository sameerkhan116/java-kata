
public class atoi {
	public static String num2text(int n) {
		if(n == 0) {
			return "0";
		}
		else if(n < 0) {
			n *= -1;
			return "-" + str(n);
		}
		return str(n);
	}
	
	public static String str(int n) {
		StringBuilder sb = new StringBuilder();
		while(n > 0) {
			int curr = n % 10;
			n /= 10;
			sb.append(curr);
		}
		return sb.reverse().toString();
	}
	
	public static void main(String[] arg) {
		System.out.println(num2text(-15312));
	}
} 
