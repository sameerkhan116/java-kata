
public class reverseString {
	public String reverseWords(String s) {
		String[] split = s.split("\\s+");
		String reversed = "";
		for(int i = 0; i < split.length; i++) {
			reversed = reversed + " " + reverse(split[i]);
		}
		return reversed.trim();
	}
	
	private String reverse(String x) {
		StringBuilder y = new StringBuilder();
		y.append(x);
		return y.reverse().toString();
	}
	
	public static void main(String[] args) {
		reverseString x = new reverseString();
		System.out.println(x.reverseWords("Let's take LeetCode contest"));
	}
}
