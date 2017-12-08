import java.util.ArrayList;
import java.util.List;

public class PeacefulYard {
    public static boolean peacefulYard(String[] yard, int minDistance) {
    		
        String[][] x = StringToArray(yard);
        int count = 0;
        List<Integer> a = new ArrayList<Integer>();
        List<Integer> b = new ArrayList<Integer>();
        
        for(int i = 0; i < x.length; i++) {
        		for(int j = 0; j < x[0].length; j++) {
        			if(x[i][j].equals("L") || x[i][j].equals("M") || x[i][j].equals("R")) {
        				count++;
        				a.add(i);
        				b.add(j);
        			}
        		}
        }
        
        if(count == 1 || count == 0) {
        		return true;
        }
        else if(count == 2) {
        		return (Math.sqrt( Math.pow(b.get(1) - b.get(0), 2) + Math.pow(a.get(1) - a.get(0), 2)) >= minDistance);
        }
        else if(count == 3) {
        		if ((Math.sqrt( Math.pow(b.get(1) - b.get(0), 2) + Math.pow(a.get(1) - a.get(0), 2)) >= minDistance) &&
        				(Math.sqrt( Math.pow(b.get(2) - b.get(1), 2) + Math.pow(a.get(2) - a.get(1), 2)) >= minDistance) &&
        				(Math.sqrt( Math.pow(b.get(0) - b.get(2), 2) + Math.pow(a.get(0) - a.get(2), 2)) >= minDistance)) {
        			return true;
        		}
        		return false;
        }
        
        return false;
        
    }
    
    // Function to convert given string to 2d array
    public static String[][] StringToArray(String[] x) {
    		String[][] a = new String[x.length][x[0].length()];
        
        for(int j = 0; j < x.length; j++) {
        		String[] p = x[j].split("");
        		for(int i = 0; i < x[j].length(); i++) {
        			a[j][i] = p[i];
        		}
        }
        return a;
    }
    
    public static void main(String[] args) {
//    		System.out.println(peacefulYard(new String[] {"------------", "------------", "-L----------", "------------", "------------", "------------"}, 10));
    		System.out.println(peacefulYard(new String[] {"------------", "---M--------", "------------", "------------", "-------R----", "------------"}, 6));
    }
}