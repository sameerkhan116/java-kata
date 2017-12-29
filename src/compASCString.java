
public class compASCString {
	
	public static Boolean compare(String s1, String s2)
		{    
			
//			if(s1 == null || s1.matches(".*[^a-zA-Z].*")) s1 = "";
//			if(s2 == null || s2.matches(".*[^a-zA-Z].*") || s2.equals(null)) s2 = "";
//			int r1 = 0, r2 = 0;
//		    char[] x = s1.toCharArray();
//		    char[] y = s2.toCharArray();
//		    if(s1.length() > 1) {
//		    		for(int i = 0; i < x.length; i++) {
//			      r1 += (int)(Character.toUpperCase(x[i]));
//			    }
//		    }
//		    else {
//		    		r1 = 0;
//		    }
//		    if(s2.length() > 1) {
//		    		for(int i = 0; i < y.length; i++) {
//			      r2 += (int)(Character.toUpperCase(y[i]));
//			    }
//		    }
//		    else {
//		    		r2 = 0;
//		    }
//		    return r1 == r2;
		
			if(s1 == null || !s1.matches("[a-zA-Z]+")) s1 = "";
			if(s2 == null || !s2.matches("[a-zA-Z]+")) s2 = "";
			
			return s1.toUpperCase().chars().sum() == s2.toUpperCase().chars().sum();
		}
	
	public static void main(String[] args) {
		System.out.println(compare("zz1", ""));
		System.out.println(compare(null, ""));
	}
}
