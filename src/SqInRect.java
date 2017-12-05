import java.util.List;
import java.util.ArrayList;

public class SqInRect {
	
	public static List<Integer> sqInRect(int lng, int wdth) {
		
		List<Integer> fin = new ArrayList<Integer>();
		
		if(lng==wdth) {
			return null;
		}
		
		int i = 0;
		int tot = lng * wdth;
		
		while(tot - i * i > 0) {
			i++;
		}
		
		while(i > lng || i > wdth) {
			i--;
		}
	
		int j = i;
		while(j > 0) {
			if(tot - j * j >= 0) {
				while(tot - j * j >= 0) {
					fin.add(j);
					tot -= j * j;
				}
			}
			j /= 2;
		}
		
		return fin;
	}
	
	public static void main(String[] args) {
		System.out.println(sqInRect(5,3));
	}
}