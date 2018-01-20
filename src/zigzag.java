import java.util.ArrayList;
import java.util.List;

public class zigzag {
	public List<List<Integer>> listed(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		bfs(result, root, 1);
		return result;
	}
	
	public void bfs(List<List<Integer>> result, TreeNode root, int level) {
		if(root == null) return;
		
		if(result.size() <= level) {
			result.add(new ArrayList<Integer>());
		}
		
		List<Integer> collection = result.get(level);
		if(level % 2 == 0) collection.add(root.val);
		else collection.add(0, root.val);
		
		bfs(result, root.left, level + 1);
		bfs(result, root.right, level + 1);
	}
}
