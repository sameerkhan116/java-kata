
public class posNegArray {
    public static int[] countPositivesSumNegatives(int[] input)
    {
    		int[] arr = new int[2];
    		if(input.length == 0 || input == null) {
    			return new int[0];
    		}
    		else {
    			int count = 0, result = 0;
    			for(int i : input) {
    				if(i > 0) {
    					count++;
    				}
    				else if(i < 0) {
    					result += i;
    				}
    			}
    			arr[0] = count;
    			arr[1] = result;
    			return arr;
    		}
    }
    
    public static void main(String[] args) {
    		System.out.println(countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}));
    }
}
