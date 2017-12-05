
public class reverseBasic {
	public String reverseString(String s) {
		StringBuilder x = new StringBuilder();
		return x.append(s).reverse().toString();
	}
	
	public static void main(String[] args) {
		reverseBasic y = new reverseBasic();
		System.out.println(y.reverseString("Hello"));
	}
}
