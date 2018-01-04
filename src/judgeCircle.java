public class judgeCircle {
	public static boolean judgeCircle(String moves) {
        String[] x = moves.split("");
        int tot = 0;
        for(String a : x) {
	        	switch(a) {
	        	case("U"):
	        		tot += 1;
	        		break;
	        	case("D"):
	        		tot -= 1;
	        		break;
	        	case("L"):
	        		tot += 2;
	        		break;
	        	case("R"):
	        		tot += 2;
	        		break;
        	}
        }
        return tot == 0;
    }
	
	public static void main(String[] args) {
		System.out.println(judgeCircle("UD"));
	}
}
