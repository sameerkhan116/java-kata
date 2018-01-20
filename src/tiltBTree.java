
public class tiltBTree {
	int result = 0;
	
	public int tilt(TreeNode root) {
		postOrder(root);
		return result;
	}
	
	public int postOrder(TreeNode root) {
		if(root == null) return 0;
		int left = postOrder(root.left);
		int right = postOrder(root.right);
		result += Math.abs(left - right);
		return left + right + root.val;
	}
}
