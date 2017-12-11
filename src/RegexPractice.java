import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPractice {
	public static void main(String[] args) {
		Matcher m =  Pattern.compile("[0-9|-]:[0-9|-]").matcher("-:- 1. FC Koeln - SV Darmstadt");
		Matcher n = Pattern.compile("(\\d\\.\\s)?\\w+(\\s\\w+)?\\s-\\s(\\d\\.\\s)?+\\w+(\\s\\w+)?").matcher("-:- 1. FC Koeln - SV Darmstadt");;
		while(m.find()) {
			String x = m.group();
			System.out.println(x);
		}
		while(n.find()) {
			System.out.println(n.group());
		}
	}
}
