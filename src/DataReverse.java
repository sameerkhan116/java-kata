
public class DataReverse {
	public static int[] DataReverse(int[] data) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < data.length; i++) {
			sb.append(data[i]);
		}
		String[] str = new String[data.length/8];
		int j = 0;
		int lastIndex = str.length - 1;
		for(int i = lastIndex; i >= 1; i--) {
			str[i] = sb.toString().substring(j, j + 8);
			j += 8;
		}
		str[0] = sb.toString().substring(j);

		int[] x = new int[data.length];
		StringBuilder fin = new StringBuilder();
		for(int i = 0; i < str.length; i++) {
			fin.append(str[i]);
		}
		
		for(int i = 0; i < fin.length(); i++) {
			x[i] = fin.toString().charAt(i) - '0';
		}
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(DataReverse(new int[] {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0}));
	}
}
