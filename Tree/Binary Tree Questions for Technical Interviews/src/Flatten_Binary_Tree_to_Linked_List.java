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
    public void flatten(TreeNode root) {
        if (root == null) return; // Base case: If the tree is empty, nothing to flatten.

        Stack<TreeNode> stack = new Stack<>(); // Stack to assist in preorder traversal.
        stack.add(root); // Start with the root node.
        TreeNode prev = null; // To track the previously processed node.

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop(); // Pop the current node from the stack.

            if (prev != null) {
                // If there's a previously processed node, adjust its pointers:
                // Set the right child to the current node.
                prev.right = node;

                // Set the left child to null as per the "flattened tree" requirement.
                prev.left = null;
            }

            // Push the right child first to ensure the left child is processed first (preorder).
            if (node.right != null) {
                stack.push(node.right);
            }

            // Push the left child to the stack so it is processed next.
            if (node.left != null) {
                stack.push(node.left);
            }

            // Update `prev` to the current node before moving to the next iteration.
            prev = node;
        }
    }
}


/* This approach ensures an O(n) time complexity and uses O(h) space for the stack, where h is the height of the tree.*/