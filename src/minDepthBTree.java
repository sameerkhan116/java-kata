
public class minDepthBTree {
	public int minDepth(TreeNode root) {
		if(root == null) return 0;
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		return 1 + Math.min(left, right) > 0 ? Math.min(left, right) : Math.max(left, right);
	}
}
