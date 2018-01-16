import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelOrder {
	public List<Integer> levels(TreeNode root) {
		List<Integer> all = new ArrayList<Integer>();
		bfs(root, all);
		return all;
	}
	
	public void bfs(TreeNode root, List<Integer> all) {
		if(root == null) return;
		Queue<TreeNode> visited = new LinkedList<TreeNode>();
		visited.add(root);
		while(!visited.isEmpty()) {
			TreeNode curr = visited.poll();
			all.add(curr.val);
			if(curr.left != null) visited.add(curr.left);
			else if(curr.right != null) visited.add(curr.right);
		}
	}
}
