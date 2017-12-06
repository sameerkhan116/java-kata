public class NumberFun {
	public static long findNextSquare(long sq) {
		double sqrt = Math.sqrt((double)sq);
		int x = (int)sqrt;
		if(Math.pow(sqrt, 2) == Math.pow(x, 2)) {
			return (long)Math.pow(sqrt + 1, 2);
		}
		else {
			return -1;
		}
	}
	  
	public static void main(String[] args) {
		System.out.println(findNextSquare(15241383936L));
	}
  
}