import java.util.Arrays;

public class Tortoise {
	public static int[] race(int v1, int v2, int g) {
		return intToHours((g*1.0/(v2-v1)));
	}
	
	public static int[] intToHours(double x) {
		int totalSecs = (int)Math.round(x * 60.0 * 60.0);
		if(totalSecs == 0) return null;
		int hours = (int)totalSecs / 3600;
		totalSecs -= hours * 3600;
		int mins = (int)totalSecs/60;
		totalSecs -= (int)mins * 60;
		return new int[] {hours, mins, totalSecs};
	}
	
	public static void main(String[] args) {
		System.out.println(race(720,850, 70));
		System.out.println(race(80,91, 37));
		System.out.println(Arrays.toString(race(720,850,37)));
	}
}
