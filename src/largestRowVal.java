import java.util.ArrayList;
import java.util.List;

public class largestRowVal {
	public List<Integer> rowVal(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		bfs(root, result, 1);
		List<Integer> mins = new ArrayList<Integer>();
		for(List<Integer> x : result) {
			int largest = x.get(0);
			for(int a : x) {
				if(a > largest) largest = a;
			}
			mins.add(largest);
		}
		return mins;
	}
	
	public void bfs(TreeNode root, List<List<Integer>> result, int level) {
		if(root == null) return;
		
		if(result.size() <= level) result.add(new ArrayList<Integer>());
		
		List<Integer> curr = result.get(level);
		curr.add(root.val);
		bfs(root.left, result, level + 1);
		bfs(root.right, result, level + 1);
	}
}
