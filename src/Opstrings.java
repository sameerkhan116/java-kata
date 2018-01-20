import java.util.function.UnaryOperator;

public class Opstrings {
	public static String diag1Sym(String string) {
		String[] parts = string.split("\n");
		String[] diagParts = new String[parts.length];
		for(int i = 0; i < parts.length; i++) {
			StringBuilder x = new StringBuilder();
			for(String a : parts) {
				x.append(a.charAt(i));
			}			
			diagParts[i] = x.toString();
		}
		return String.join("\n", diagParts);
	}
	
	public static String rot90Clock(String string) {
		String[] now = diag1Sym(string).split("\n");
		String[] rotParts = new String[now.length];
		for(int i = 0; i < now.length; i++) {
			String a = new StringBuilder(now[i]).reverse().toString();
			rotParts[i] = a;
		}
		return String.join("\n", rotParts);
	}
	
	public static String selfieAndDiag1(String string) {
		String[] rot = string.split("\n");
		String[] diag = diag1Sym(string).split("\n");
		String[] combined = new String[diag.length];
		for(int i = 0; i < diag.length; i++) {
			String a = new StringBuilder(rot[i]).append("|").append(diag[i]).toString();
			combined[i] = a;
		}
		return String.join("\n", combined);
	}
	
	public static String rot90Counter(String string) {
		String[] now = diag2Sym(string).split("\n");
		String[] parts = new String[now.length];
		for(int i = 0; i < now.length; i++) {
			String x = new StringBuilder(now[i]).reverse().toString();
			parts[i] = x;
		}
		return String.join("\n", parts);
	}
	
	public static String diag2Sym(String string) {
		String[] parts = string.split("\n");
		String[] reverseDiag = new String[parts.length];
		for(int i = 0, j = parts.length - 1; i < parts.length && j >= 0; i++, j--) {
			StringBuilder x = new StringBuilder();
			for(String a : parts) {
				x.append(a.charAt(i));
			}
			reverseDiag[j] = x.reverse().toString();
		}
		return String.join("\n", reverseDiag);
	}
	
	public static String selfieDiag2Counterclock(String string) {
		String[] parts = string.split("\n");
		String[] second = diag2Sym(string).split("\n");
		String[] third = rot90Counter(string).split("\n");
		String[] combined = new String[parts.length];
		for(int i = 0; i < parts.length; i++) {
			String x = new StringBuilder(parts[i]).append("|").append(second[i]).append("|").append(third[i]).toString();
			combined[i] = x;
		}
		return String.join("\n", combined);
	}
		
	public static String oper(UnaryOperator<String> operator, String s) {
		return operator.apply(s);
	}
	
	public static void main(String[] args) {
//		System.out.println(diag1Sym("abcd\nefgh\nijkl\nmnop"));
//		System.out.println(rot90Clock("abcd\nefgh\nijkl\nmnop"));
//		System.out.println(selfieAndDiag1("abcd\nefgh\nijkl\nmnop"));
//		System.out.println(rot90counter("abcd\nefgh\nijkl\nmnop"));
//		System.out.println(diag2Sym("abcd\nefgh\nijkl\nmnop"));
		System.out.println(selfieDiag2Counterclock("abcd\nefgh\nijkl\nmnop"));
	}
}
