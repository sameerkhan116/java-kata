import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

class levelOrderBTree {
	
	public List<Integer> BFS(TreeNode root) {
		List<Integer> all = new ArrayList<Integer>();
		LevelOrder(root, all);
		return all;
	}
	
    public void LevelOrder(TreeNode root, List<Integer> visited) {
        if(root == null) return;
        Queue<TreeNode> visit = new LinkedList<>();
        visit.add(root);
        while(!visit.isEmpty()) {
            TreeNode curr = visit.poll();
            visited.add(curr.val);
            if(curr.left != null) visit.add(curr.left);
            if(curr.right != null) visit.add(curr.right);
        }
    } 
}