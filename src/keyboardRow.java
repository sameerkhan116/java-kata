import java.util.ArrayList;

public class keyboardRow {
	public String[] findWords(String[] words) {
		ArrayList<String> out = new ArrayList<String>();
		for(String word : words) {
			if(word.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")) {
				out.add(word);
			}
		}
		return out.toArray(new String[out.size()]);
	}
	
	public static void main(String[] args) {
		keyboardRow x = new keyboardRow();
		System.out.println(x.findWords(new String[] {"Hello", "Alaska", "Dad", "Peace"}));
	}
}