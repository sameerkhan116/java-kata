import java.util.List;
import java.util.ArrayList;

public class SqInRect {
	
	public static List<Integer> sqInRect(int lng, int wdth) {
		
		List<Integer> fin = new ArrayList<Integer>();
		
		if(lng==wdth) {
			return null;
		}
		
		while(lng * wdth > 0) {
			if(lng > wdth) {
				fin.add(wdth);
				lng -= wdth;
			} else {
				fin.add(lng);
				wdth -=lng;
			}
		}
		
		return fin;
	}
	
	public static void main(String[] args) {
		System.out.println(sqInRect(5,3));
	}
}