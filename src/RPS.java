
public class RPS {
	public static String rps(String p1, String p2) {
	    String[] options = new String[] {"rock", "paper", "scissors"};
	    String result = "";
	    int x = 0, y = 0;
	    for(int i = 0; i < options.length; i++) {
	    		if(options[i].equals(p1)) {
	    			x = i;
	    		}
	    		if(options[i].equals(p2)) {
	    			y = i;
	    		}
	    }
	    if(x == y) {
	    		result = "Draw!";
	    } else if (x == 2 && y == 0) {
	    		result = "Player 2 won!";
	    } else if (y == 2 && x == 0) {
			result = "Player 1 won!";
	    } else if (x > y) {
	    		result = "Player 1 won!";
	    } else if (x < y) {
	    		result = "Player 2 won!";
	    } 
	    return result;
	}
	
	public static void main(String[] args) {
		RPS x = new RPS();
		System.out.println(x.rps("rock", "scissors"));
	}
}
