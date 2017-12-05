public class clockAngle {
	
	public double clockAngle(int hour, int minutes) {
		final double MINUTES_PER_HOUR = 60;
		final double DEGREES_PER_MINUTE = 360/MINUTES_PER_HOUR;
		final double DEGREES_PER_HOUR = 360/12;
		
		double minuteAngle = minutes * DEGREES_PER_MINUTE;
		double hourAngle = hour * DEGREES_PER_HOUR + (minutes/MINUTES_PER_HOUR) * DEGREES_PER_HOUR;
		
		double diff = Math.abs(minuteAngle - hourAngle);
		
		if(diff > 180) return 360 - diff;
		return diff;
	}

	public static void main(String[] args) {
		clockAngle x = new clockAngle();
		System.out.println(x.clockAngle(6, 00));
	}
}
