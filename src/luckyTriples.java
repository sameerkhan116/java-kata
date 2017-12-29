import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class luckyTriples {
	
	public static int answer(int[] l) {
		List<int[]> list = new ArrayList<int[]>();
		combine(l, list);
		int count = 0;
		for(int[] x : list) {
			if(x[0] <= x[1] && x[1] <= x[2]) {
				if(x[2] % x[1] == 0 && x[1] % x[0] == 0) {
					count++;
				}
			}
		}
		return count;
    }
	
	public static void combine (int[] arr, List<int[]> list){
        for(int i = 0; i<arr.length-2; i++)
            for(int j = i+1; j<arr.length-1; j++)
                for(int k = j+1; k<arr.length; k++)
                    list.add(new int[]{arr[i],arr[j],arr[k]});
    }
	
	public static void main(String[] args) {
		int[] l = new int[] {1,1,1};
		System.out.println(answer(l));
	}
}
