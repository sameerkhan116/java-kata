public class Accumul {
    
    public static String accum(String s) {
    		char[] x = s.toCharArray();
    		StringBuilder sb = new StringBuilder();
    		for(int i = 0; i < x.length; i++) {
    			sb.append(Character.toUpperCase(x[i]));
    			for(int j = 0; j < i; j++) {
    				sb.append(Character.toLowerCase(x[i]));
    			}
    			sb.append("-");
    		}
    		sb.deleteCharAt(sb.length() - 1);
    		return sb.toString();
    }
    
    public static void main(String[] args) {
    		System.out.println(accum("RqaEzty"));
    }
}