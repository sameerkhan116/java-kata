import java.util.ArrayList;
import java.util.Collections;

public class sortTheOdd {
	public static int[] sortArray(int[] array) {
		
		if(array == null || array.length == 0) {
			return new int[] {};
		}
		
		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0 || array[i] == 0) {
				even.add(i);
			} else odd.add(array[i]);
		}
		Collections.sort(odd);
		for(int i = 0; i < even.size(); i++) {
			odd.add(even.get(i), array[even.get(i)]);
		}
		
		int[] fin = new int[odd.size()];
		
		for(int i = 0; i < odd.size(); i++) {
			fin[i] = odd.get(i);
		}
		return fin;
	}
	
	public static void main(String[] args) {
		System.out.println(sortArray(new int[]{}));
	}
}
