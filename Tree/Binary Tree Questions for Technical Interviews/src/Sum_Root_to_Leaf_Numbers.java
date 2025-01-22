public class Sum_Root_to_Leaf_Numbers {
    public int sumNumbers(TreeNode root) {
        // If root is null, return 0 as no path exists
        if (root == null) {
            return 0;
        }
        // Call helper function with initial sum as 0
        return helper(root, 0);
    }

    // Helper function to traverse the tree
    public int helper(TreeNode root, int sum) {
        // Base case: when a leaf node is reached
        if (root.left == null && root.right == null) {
            return sum * 10 + root.val; // Return the final number formed
        }

        // Recursively calculate sum for left and right subtrees
        int sumLeft = 0, sumRight = 0;
        if (root.left != null) {
            sumLeft = helper(root.left, sum * 10 + root.val); // Left child
        }
        if (root.right != null) {
            sumRight = helper(root.right, sum * 10 + root.val); // Right child
        }

        // Return sum of left and right subtree results
        return sumLeft + sumRight;
        /*
            Left child (2):
            Next call: sum = 1, root = 2.
            root.left == null and root.right == null (because 2 is a leaf node).
            Base case is triggered: sum = 1 * 10 + 2 = 12.
            Return 12.
        *
        *  */

    }
}


/*
Time Complexity: O(N) where N is the number of nodes in the tree.
- We visit each node exactly once.

Space Complexity: O(H) where H is the height of the tree.
- This is the space used by the recursion stack in the worst case (H can be O(N) in the worst case of a skewed tree).
*/
