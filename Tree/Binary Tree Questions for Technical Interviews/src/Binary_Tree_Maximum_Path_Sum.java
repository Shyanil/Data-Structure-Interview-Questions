public class Binary_Tree_Maximum_Path_Sum {

    // Global variable to store the maximum path sum
    public static int ANS = Integer.MIN_VALUE;

    /**
     * Method to calculate the maximum path sum in a binary tree.
     * @param root The root of the binary tree.
     * @return The maximum path sum.
     */
    public static int maxPathSum(TreeNode root) {
        // Helper function to calculate the maximum sum and update ANS
        helperMAXSUM(root);
        return ANS;
    }

    /**
     * Helper method to calculate the maximum path sum for a subtree.
     * @param root The current root node of the subtree.
     * @return The maximum path sum for the subtree rooted at 'root' considering only one branch.
     */
    private static int helperMAXSUM(TreeNode root) {
        // Base case: If the node is null, return 0 as it contributes nothing to the path sum
        if (root == null) {
            return 0;
        }

        // Recursively calculate the maximum path sum for the left and right subtrees
        int left = helperMAXSUM(root.left);
        int right = helperMAXSUM(root.right);

        // If the sum of a subtree is negative, we ignore it by taking a maximum with 0
        left = Math.max(left, 0);
        right = Math.max(right, 0);

        // Calculate the path sum including the current node and both branches (left + right)
        int pathSum = left + right + root.val;

        // Update the global maximum path sum if the current pathSum is greater
        ANS = Math.max(ANS, pathSum);

        // Return the maximum path sum considering only one branch (left or right) plus the current node value
        return Math.max(left, right) + root.val;
    }
}
//
//  ### **Time Complexity**:
//The time complexity of the given solution is **O(N)**, where \( N \) is the number of nodes in the binary tree.
//- The function `helperMAXSUM` performs a single post-order traversal of the binary tree, visiting each node exactly once to compute the maximum path sum for the subtree rooted at that node.
//
//        ---
//
//        ### **Space Complexity**:
//The space complexity is **O(H)**, where \( H \) is the height of the binary tree.
//- This comes from the recursion stack during the traversal.
//- In the worst case:
//        - **Skewed Tree**: \( H = N \), so the space complexity is \( O(N) \).
//        - **Balanced Tree**: \( H = \log N \), so the space complexity is \( O(\log N) \).
//
//        ---
//
//        ### Summary:
//        - **Time Complexity**: \( O(N) \)
//        - **Space Complexity**: \( O(H) \), where \( H \) is the height of the binary tree.
//
