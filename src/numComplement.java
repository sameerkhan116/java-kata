
public class numComplement {
	public int findComplement(int num) {
		int i = 0, j = 0;
		while(i < num) {
			i += Math.pow(2, j);
			j++;
		}
		return i - num;
	}
	
	public static void main(String[] args) {
		numComplement x = new numComplement();
		System.out.println(x.findComplement(5));
	}
}
