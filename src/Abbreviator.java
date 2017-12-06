
public class Abbreviator {
	
	public String abbreviate(String string) {
		String[] str = string.split("(?<=\\W+)");
		String s = "";
		for(int i = 0; i < str.length; i++) {
			if(str[i].matches(".*\\W") && str[i].length() > 4) {
				s += abbr(str[i]);
			}
			else if(!(str[i].matches(".*\\W")) && str[i].length() > 3) {
				s += abbr(str[i]);
			}
			else {
				s += str[i];
			}
		}
		return s;
	}
	
	public static String abbr(String string) {
		StringBuilder sb = new StringBuilder(string);
		if(string.matches(".*\\W")) {
			sb.replace(1, string.length() - 2 , String.valueOf(string.length() - 3));
		}
		else {
			sb.replace(1, string.length() - 1 , String.valueOf(string.length() - 2));
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Abbreviator x = new Abbreviator();
		System.out.println(x.abbreviate("sits: mat; double-barreled"));
	}
}
