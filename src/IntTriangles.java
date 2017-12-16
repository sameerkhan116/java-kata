
public class IntTriangles {
	
    public static int giveTriang(int per) {
    		int count = 0;
    		for(int start = 3; start <= per; start++) {
    			for(int small = 2; small <= start/3; small++) {
    				for(int mid = small; mid <= (start-small)/2; mid++) {
    					int large = start - small - mid;
    					if(small + mid <= large) {
    						continue;
    					}
    					if(large * large == small * small + mid * mid + small * mid) {
    						count++;
    					}
    				}
    			}
    		}
    		return count;
    }
		
    public static void main(String[] args) {
    		System.out.println(giveTriang(30));
    }
}
