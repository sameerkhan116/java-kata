import java.util.HashSet;
import java.util.Set;

public class twoSumBTree {
	public boolean findTarget(TreeNode root, int k){
		Set<Integer> set = new HashSet<Integer>();
		return DFS(root, set, k);
	}
	
	public boolean DFS(TreeNode root, Set<Integer> set, int k) {
		if(root == null) return false;
		if(set.contains(k - root.val)) return true;
		set.add(root.val);
		return DFS(root.left, set, k) || DFS(root.right, set, k);
	}
}
