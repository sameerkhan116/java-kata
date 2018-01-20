import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class secondMinBTree {
	public int secondMin(TreeNode root) {
		List<Integer> all = new ArrayList<Integer>();
		if(root == null) return 0;
		bfs(root, all);
		Collections.sort(all);
		return all.get(1);
		
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
