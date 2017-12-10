//import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Bundesliga
{
	public static String table(String[] results)
	{
//		List<Map<String, String>> teams = new ArrayList<Map<String, String>>();
		List<String> team = new ArrayList<String>();
		List<String> score = new ArrayList<String>();
		
		
		for(String s : results) {
			Map<String, String> temp = split(s);
			team.addAll(temp.keySet());
			score.addAll(temp.values());
		}
		
		int[] scoreArr = new int[score.size()];
		for(int i = 0; i < score.size(); i++) {
			scoreArr[i] = value(score.get(i));
		}
		
		Map<String, Integer> table = new HashMap<String, Integer>();
		
		for(int i = 0; i < score.size(); i++) {
			table.put(team.get(i), scoreArr[i]);
		}
		
		Set<Entry<String, Integer>> set = table.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o1.getKey()).compareTo( o2.getKey() );
            }
        } );
		
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        
        
        String x = "";
        
        
        for(int i = 0; i < list.size(); i++) {
        		int played = score.get(team.indexOf(list.get(i).getKey())).charAt(0) == '-' ? 0 : 1;
        		int won = value(score.get(team.indexOf(list.get(i).getKey()))) > 0 ? 1 : 0;
        		int draw = value(score.get(team.indexOf(list.get(i).getKey()))) == 0 && played == 1 ? 1 : 0;
        		int lost = value(score.get(team.indexOf(list.get(i).getKey()))) < 0 ? 1 : 0;
        		String scores = score.get(team.indexOf(list.get(i).getKey()));
        		int points = won == 1 ? 3 : 0;
        				
        		x += String.format("%2s. %-30s%d  %d  %d  %d  %s  %d\n", 
        				i+1, 
        				list.get(i).getKey(), 
        				played, 
        				won, 
        				draw, 
        				lost, 
        				scores, 
        				points);
        }
        x = x.replaceAll("\\s+$", "");
        return x;
//		return list.toString();
//		return team.toString();
//		return score.toString();
	}
	

	
	public static int value(String x) {
		String[] vals = x.split(":");
		if(vals[1].equals("-")) {
			vals[1] = "0";
		}
		if(vals[0].equals("-")) {
			vals[0] = "0";
		}
		return Integer.parseInt(vals[0]) - Integer.parseInt(vals[1]);
	}
	
	public static Map<String, String> split(String x) {
		String[] score = x.split(" ", 2);
		String[] a = score[1].split(" - ");
		Map<String, String> teamstats = new HashMap<String, String>();
		teamstats.put(a[0], score[0]);
		teamstats.put(a[1], new StringBuilder(score[0]).reverse().toString());
		return teamstats;
//		Set<String> teams = new HashSet<String>();
//		teams.addAll(Arrays.asList(a));
//		return teams.toString();
	}
  
  public static void main(String[] args) {
	  String[] results = new String[]
		        {
		        "6:0 FC Bayern Muenchen - Werder Bremen",
		        "-:- Eintracht Frankfurt - Schalke 04",
		        "-:- FC Augsburg - VfL Wolfsburg",
		        "-:- Hamburger SV - FC Ingolstadt",
		        "-:- 1. FC Koeln - SV Darmstadt",
		        "-:- Borussia Dortmund - FSV Mainz 05",
		        "-:- Borussia Moenchengladbach - Bayer Leverkusen",
		        "-:- Hertha BSC Berlin - SC Freiburg",
		        "-:- TSG 1899 Hoffenheim - RasenBall Leipzig"
		        };
	  System.out.println(table(results));
//	  System.out.println(value("6:0"));
//	  System.out.println(split("6:0 FC Bayern Muenchen - Werder Bremen"));
  }
}