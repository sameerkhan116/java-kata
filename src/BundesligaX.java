import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BundesligaX
{
	public static String table(String[] results)
	{
		List<String> teams = new ArrayList<String>();
		List<String> scores = new ArrayList<String>();
		
		for(String s : results) {
			String x = "";
			String y = "";
			Matcher m =  Pattern.compile("[0-9|-]:[0-9|-]").matcher(s);
			Matcher n = Pattern.compile("(((\\d\\.)|\\w+)?\\s)?\\w+(\\s(\\w+|\\d+))?\\s-\\s(((\\d\\.)|\\w+)?\\s)?\\w+(\\s(\\w+|\\d+))?").matcher(s.replaceAll("[0-9-]:[0-9-]\\s", ""));

			while(m.find()) {
				x = m.group();
			}
			while(n.find()) {
				y = n.group();
			}
			String[] tempteams = y.split("\\s-\\s");
			teams.add(tempteams[0]);
			scores.add(x);
			teams.add(tempteams[1]);
			scores.add(new StringBuilder(x).reverse().toString());
		}
		
		String[] sortedGoals = new String[scores.size()];

		String[] teamSorted = new String[sortedGoals.length];
		
		for(int i = 0; i < scores.size(); i++) {
			sortedGoals[i] = scores.get(i);
			teamSorted[i] = teams.get(i);
		}
		
		Arrays.sort(sortedGoals, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if(value(o1).compareTo(value(o2)) == 0) {
					Character x = o2.charAt(0);
					Character y = o1.charAt(0);
					if(x.compareTo(y) == 0) {
						return o1.compareToIgnoreCase(o2);
					}
					return x.compareTo(y);
				}
				return value(o2).compareTo(value(o1));
			}
		});
		
		Arrays.sort(teamSorted, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if(value(scores.get(teams.indexOf(o1))).compareTo(value(scores.get(teams.indexOf(o2)))) == 0) {
					Character x = scores.get(teams.indexOf(o2)).charAt(0);
					Character y = scores.get(teams.indexOf(o1)).charAt(0);
					if(x.compareTo(y) == 0) {
						return o1.compareToIgnoreCase(o2);
					}
					return x.compareTo(y);
				}
				return value(scores.get(teams.indexOf(o2))).compareTo(value(scores.get(teams.indexOf(o1))));
			}
		});
		
		String[] end = new String[teamSorted.length];
		
		for(int i = 0; i < end.length; i++) {
			int played = sortedGoals[i].charAt(0) == '-' ? 0 : 1;
			int won = value(sortedGoals[i]) > 0 ? 1 : 0;
			int draw = played == 1 && value(sortedGoals[i]) == 0 ? 1 : 0;
			int lost = value(sortedGoals[i]) < 0 ? 1 : 0;
			int points = 0;
			if(won == 1) points = 3;
			else if(draw == 1) points = 1;
			
			
			end[i] = String.format("%2s. %-30s%d  %d  %d  %d  %s  %d\n", i + 1, teamSorted[i], played, won, draw, lost, sortedGoals[i].charAt(0) == '-' ? "0:0" : sortedGoals[i], points);
		}
		
		for(int i = 0; i < end.length - 1; i++) {
			if(end[i].substring(34).equals(end[i+1].substring(34))) {
				end[i+1] = end[i+1].replaceFirst("\\s?\\d?\\d\\.\\s", end[i].substring(0, 4));
			}
		}
		
		String x = "";
		for(int i = 0; i < end.length; i++) {
			x += end[i];
		}
		
		x = x.replaceAll("\\s+$", "");
		return x;

	}
	
	public static Integer value(String x) {
		return (x.charAt(0) - '0') - (x.charAt(2) - '0');
	}	
	
	public static void main(String[] args) {
		String[] results = new String[]
			      {
			        "6:0 FC Bayern Muenchen - Werder Bremen",
			        "1:0 Eintracht Frankfurt - Schalke 04",
			        "0:2 FC Augsburg - VfL Wolfsburg",
			        "1:1 Hamburger SV - FC Ingolstadt",
			        "2:0 1. FC Koeln - SV Darmstadt",
			        "2:1 Borussia Dortmund - FSV Mainz 05",
			        "2:1 Borussia Moenchengladbach - Bayer Leverkusen",
			        "2:1 Hertha BSC Berlin - SC Freiburg",
			        "2:2 TSG 1899 Hoffenheim - RasenBall Leipzig"
			      };
		System.out.println(table(results));
	}
}