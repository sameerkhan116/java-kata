import java.util.List;
import java.util.Queue;

public class lowestCommonAncestor {
	public TreeNode lowestCommon(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null || root == p || root == q) return root;
		TreeNode left = lowestCommon(root.left, p, q);
		TreeNode right = lowestCommon(root.right, p, q);
		return left == null ? right : right == null ? left : root;
	}
}
