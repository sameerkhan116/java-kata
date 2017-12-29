
import java.util.Arrays;
import java.util.Stack;

public class DirReduction {
	
    public static String[] dirReduc(String[] arr) {
    		Stack<String> x = new Stack<String>();
    		for(String direction : arr) {
    			String lastElem = x.size() > 0 ? x.lastElement() : null;
    			
    			switch(direction) {
    			case "NORTH":
    				if ("SOUTH".equals(lastElem)) {
    					x.pop();
    				}
    				else {
    					x.push(direction);
    				}
    				break;
    			case "SOUTH":
				if ("NORTH".equals(lastElem)) {
					x.pop();
				}
				else {
					x.push(direction);
				}
				break;
    			case "EAST":
    				if ("WEST".equals(lastElem)) {
    					x.pop();
    				}
    				else {
    					x.push(direction);
    				}
    				break;
    			case "WEST":
    				if ("EAST".equals(lastElem)) {
    					x.pop();
    				}
    				else {
    					x.push(direction);
    				}
    				break;
			}
    		}
    		return x.stream().toArray(String[]::new);
    }
    
    public static void main(String[] args) {
    		System.out.println(Arrays.toString(dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" })));
//    		System.out.println(dirReduc(new String[] { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" }));
    		System.out.println(Arrays.toString(dirReduc(new String[] { "NORTH","SOUTH","SOUTH","EAST","WEST","NORTH","NORTH" })));
//    		System.out.println(dirReduc(new String[] { "NORTH","SOUTH","SOUTH","EAST","WEST","NORTH","NORTH" }));
    		
    }
    
}