class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
       
        if (root != null) {
            if (root.val == targetSum && root.left == null && root.right == null) {
                return true; 
            } else {
                return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
            }
        } else {
            return false; 
        }
    }
}