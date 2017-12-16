import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumDigits {
    
	 public static long[] maxSumDig(long nmax, int maxsm) {
		 List<Integer> a = new ArrayList<Integer>();
		 int result = 0;
		 long smallest = nmax;
		 
		 for(int i = 1000; i <= nmax; i++) {
			 List<Boolean> x = sameSumOfDigits(i, maxsm);
			 if(!x.contains(false)) a.add(i); 
		 }
		 
		 for(int x : a) {
			 result += x;
		 }
		 
		 int mean = result/a.size();
		 int mid = 0;
		 
		 for(int x : a) {
			 if(Math.abs(mean - x) < smallest) smallest = Math.abs(result/a.size() - x);
		 }
		 
		 for(int x : a) {
			 if(Math.abs(mean - x) == smallest) mid = x;
		 }
		 
		 return new long[] {a.size(), mid, result};
	 }
	 
	 public static List<Boolean> sameSumOfDigits(long n, int nmax) {
		 String[] x = Long.toString(n).split("");
		 int len = x.length;
		 List<Boolean> newArray = new ArrayList<Boolean>();
		 for(int i = 0; i < len - 3; i++) {
			 newArray.add(sumOfArr(Arrays.copyOfRange(x, i, i + 4)) <= nmax);
		 }
		 return newArray;
	 }
	 
	 public static int sumOfArr(String[] arr) {
		 int result = 0;
		 for(String s : arr) {
			 result += Integer.parseInt(s);
		 }
		 return result;
	 }
	 
	 public static void main(String[] args) {
		 System.out.println(maxSumDig(40184, 7));
		 System.out.println(sameSumOfDigits(82715, 15));
	 }
	 
}