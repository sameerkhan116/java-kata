
public class atoi {
	public static String num2text(int n) {
		StringBuilder sb = new StringBuilder();
		
		if(n < 10) {
			sb.append(n);
			return sb.toString();
		}
		else {
			sb.append(n/10);
			sb.append(n % 10);
			num2text(n/10);
		}
		
		return sb.toString();	
	}
	
	public static void main(String[] arg) {
		System.out.println(num2text(1312));
	}
} 
