import java.util.Arrays;

public class Athletic {
	public static String stat(String n) {
		
		if(n.isEmpty() || n == "" || n == null) {
			return "";
		}
		
		// Split each string into individual records
		String[] each = n.split(", ");
		int[] main = new int[each.length];
		// Split each substring 
		for(int i = 0; i < each.length; i++) {
			int result = 0;
			String[] x = each[i].split("\\|");
			result = 3600 * Integer.parseInt(x[0]) + 60 * Integer.parseInt(x[1]) + Integer.parseInt(x[2]);
			main[i] = result;
		}
		// integer array of results in seconds
		Arrays.sort(main);
		
		int min = main[main.length - 1] - main[0];
		// range as a string
		String minString = secsToHours(min);
		
		// calculating average
		int total = 0;
		for(int i = 0; i < main.length; i++) {
			total += main[i];
		}
		int average = total / main.length;
		
		// 
		String avgString = secsToHours(average);
		
		int median = 0;
		if(main.length % 2 == 0) {
			median = (main[main.length / 2] + main[main.length / 2 - 1]) / 2;
		}
		else {
			median = main[main.length / 2];
		}
		
		String medianString = secsToHours(median);
		
		String abs = "Range: " + minString + " Average: " + avgString + " Median: " + medianString;
		return abs;
	}
	
	public static String secsToHours(int n) {
		int hours = n/3600;
		int remainder = (n - hours * 3600);
		int minutes = remainder/60;
		remainder -= minutes * 60;
		int seconds = remainder;
		// 
		String fin = (hours < 10 ? "0" : "") + hours + "|" + (minutes < 10 ? "0" : "") + minutes + "|" + (seconds < 10 ? "0" : "") + seconds;
		
		return fin;
	}
	
	public static void main(String[] args) {
		System.out.println(stat("01|15|59, 1|47|6, 01|17|20, 1|32|34, 2|3|17"));
	}
}
