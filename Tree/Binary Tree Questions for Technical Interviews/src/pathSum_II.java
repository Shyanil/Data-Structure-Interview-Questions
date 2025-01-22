/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // This function returns all paths that sum up to the targetSum.
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        // resultList will store all the valid paths that meet the target sum.
        List<List<Integer>> resultList = new ArrayList<>();
        // list will store the current path being explored.
        List<Integer> list = new ArrayList<>();
        // Call the helper function to explore all paths from the root.
        pathSumH(root, targetSum, resultList, list);
        return resultList;  // Return the list of valid paths.
    }

    // Helper function to recursively explore the tree and find valid paths.
    private void pathSumH(TreeNode root, int targetSum, List<List<Integer>> resultList, List<Integer> list) {
        // If the current node is null, there is no path, so return.
        if (root == null) {
            return;
        }
        
        // Add the current node's value to the path.
        list.add(root.val);

        // If we have reached a leaf node and the target sum matches, add the path to the result list.
        if (root.val == targetSum && root.left == null && root.right == null) {
            resultList.add(new ArrayList<>(list));  // Add a copy of the current path to resultList.
        } else {
            // Recursively explore the left subtree with the updated target sum.
            pathSumH(root.left, targetSum - root.val, resultList, list);
            // Recursively explore the right subtree with the updated target sum.
            pathSumH(root.right, targetSum - root.val, resultList, list);
        }

        // Backtrack: Remove the last node added to the path as we explore other paths.
        list.remove(list.size() - 1);
    }
}
