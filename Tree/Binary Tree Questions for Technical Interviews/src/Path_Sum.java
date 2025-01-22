public class Path_Sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) {
            return false; // If the current node is null, no path exists, return false
        }

        // If we reach a leaf node and the targetSum equals the current node's value, return true
        if(root.val == targetSum && root.left == null && root.right == null) {
            return true;
        }

        // Recursively check the left subtree, subtracting the current node's value from targetSum
        if (hasPathSum(root.left, targetSum - root.val)) return true;

        // Recursively check the right subtree, subtracting the current node's value from targetSum
        return hasPathSum(root.right, targetSum - root.val);
    }

}
