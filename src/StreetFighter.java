public class StreetFighter {
	
	public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves){
		if(position.length == 0 || moves.length == 0) return new String[] {};
		String fin = "";
		int x = position[0];
		int y = position[1];
		for(String move : moves) {
			switch(move) {
				case "up": if(x == 1) {
						x = 0; 
					}
					break;
				case "down": if(x == 0) {
						x = 1;
					}
				break;
				case "left": if(y == 0) {
						y = 5;
					} else {
						y -= 1;
					}
				break;
				case "right": if(y == 5) {
						y = 0;
					} else {
						y += 1;
					}
				break;
			}
			fin += fighters[x][y] + ",";
		}
		return fin.substring(0, fin.length() - 1).split(",");
	}
	
	public static void main(String[] args) {
		String[][] fighters = new String[][]{
            new String[] { "Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega" },
            new String[] { "Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison" },
		};
		String[] moves = new String[] { "left", "left", "left", "left", "left", "left", "left", "left" };
		System.out.println(streetFighterSelection(fighters, new int[] {0,0}, moves));
	}

}
