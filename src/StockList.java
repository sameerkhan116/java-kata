public class StockList { 
	
	// 1st parameter is the stocklist (L in example), 
	// 2nd parameter is list of categories (M in example)
	
	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
		
		if(lstOfArt == null || lstOf1stLetter == null || lstOf1stLetter.length == 0 || lstOfArt.length == 0) {
			return "";
		}
		
		int a = lstOfArt.length;
		String[] words = new String[a];
		int[] vals = new int[a];
		int n = lstOf1stLetter.length;
		
		for(int i = 0; i < a; i++) {
			String[] part = lstOfArt[i].split("(?<=\\D)(?=\\d)");
			words[i] = part[0].trim();
			vals[i] = Integer.parseInt(part[1]);
		}

		String some = "";
		for(String f : lstOf1stLetter) {
			some += f;
		}
		
		int[] count = new int[n];
		for(int j = 0; j < words.length; j++) {
			for(int i = 0; i < n; i++) {
				if(lstOf1stLetter[i].charAt(0) == words[j].charAt(0)) {
					count[some.indexOf(words[j].charAt(0))] += vals[j];
				}
			}
		}
		
		String returnVal = "";
		for(int i = 0; i < n - 1; i++) {
			returnVal += "(" + lstOf1stLetter[i] + " : " + count[i] + ") - ";
		}
		returnVal +=  "(" + lstOf1stLetter[n - 1] + " : " + count[n - 1] + ")";
		
		return returnVal;
	}
	
	public static void main(String[] args) {
		System.out.println(stockSummary(new String[] {"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"}, new String[] {"A", "B"}));
	}
}