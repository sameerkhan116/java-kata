import java.util.Stack;

public class baseballGame {
	public int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<Integer>();
		
		for(String op : ops) { 
			
			if(op.equals("+")) {
				int top = stack.pop();
				int newtop = top + stack.peek();
				stack.push(top);
				stack.push(newtop);
			}
			else if(op.equals("D")) {
				stack.push(stack.peek() * 2);
			}
			else if(op.equals("C")) {
				stack.pop();
			}
			else {
				stack.push(Integer.parseInt(op));
			}
		}
		
		int sum = 0;
		
		for(int s : stack) {
			sum += s;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		baseballGame x = new baseballGame();
		System.out.println(x.calPoints(new String[] {"5","2","C","D","+"}));
	}
}
