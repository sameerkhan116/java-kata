
public class circleRouter {
	
	public boolean judgeCircle(String moves) {
		int v = 0;
		int h = 0;
		for(char c : moves.toCharArray()) {
			if(c == 'U') v++;
			else if(c == 'D') v--;
			else if(c == 'R') h++;
			else if(c == 'L') h--;
		}
		return v == 0 && h == 0;
	}
	
	public static void main(String[] args) {
		circleRouter x = new circleRouter();
		System.out.println(x.judgeCircle("UDR"));
	}
}