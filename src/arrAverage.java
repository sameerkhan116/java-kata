public class arrAverage{
  public static double find_average(int[] array) {
	  double result = 0;
	  for(int i : array) {
		  result += i;
	  }
	  return result / array.length;
  }
  
  public static void main(String[] args) {
	  arrAverage x = new arrAverage();
	  System.out.println(x.find_average(new int[] {1,2,3}));
  }
}