public class Decompose {

	public String decompose(long n) {
		String result = decomposer(n * n, n);
		if(result != null) {
			return result.trim();
		}
		return null;
	}
	
	public String decomposer(long s, long i){
		if(s < 0) {
			return null;
		}
		if(s == 0) {
			return "";
		}
		for(long x = i - 1; x >= 0; x--) {
			String sub = decomposer(s - x*x, x);
			if(sub != null) {
				sub += x + " ";
				return sub;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		Decompose x = new Decompose();
		System.out.println(x.decompose(16));
	}
}