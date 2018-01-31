/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums == null) return null;
        return build(nums, 0, nums.length - 1);
    }
    
    public TreeNode build(int[] nums, int start, int end) {
        if(start > end) return null;
        
        int max = start;
        for(int i = start + 1; i <= end; i++) {
            if(nums[i] > nums[max]) max = i;
        }
        
        TreeNode root = new TreeNode(nums[max]);
        
        root.left = build(nums, start, max - 1);
        root.right = build(nums, max + 1, end);
        return root;
    }
}