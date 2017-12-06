
public class mergeBinaryTrees {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1 == null) return t2;
		if(t2 == null) return t1;
		t1.val += t2.val;
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t1.right, t2.right);
		return t1;
	}
	
	public static void main(String[] args) {
//		mergeBinaryTrees x = new mergeBinaryTrees();
//		TreeNode[] t1 = new TreeNode[] {1,2,3,4};
//		TreeNode[] t2 = new TreeNode[] {2,1,3,null,4,null,7};
//		System.out.println(x.mergeTrees(t1,t2));
	}
}
