import java.util.LinkedList;
import java.util.Queue;

// Class to check if a binary tree is symmetric
public class Symmetric_Tree {

    // Method to check if the binary tree is symmetric
    public static boolean isSymmetric(TreeNode root) {
        // If the root is null, the tree is not symmetric
        if (root == null) {
            return false;
        }

        // Initialize a queue to compare nodes level by level
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left); // Add the left child of the root
        queue.add(root.right); // Add the right child of the root

        // Process nodes in the queue
        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // Get the current level size (not used here)

            // Remove two nodes to compare them
            TreeNode node1 = queue.remove();
            TreeNode node2 = queue.remove();

            // If both nodes are null, continue to the next iteration
            if (node1 == null && node2 == null) {
                continue;
            }

            // If either node is null or their values don't match, the tree is not symmetric
            if (node1 == null || node2 == null || node1.val != node2.val) {
                return false;
            }

            // Add children of the nodes to the queue in mirrored order
            queue.add(node1.left);  // Left child of node1
            queue.add(node2.right); // Right child of node2
            queue.add(node1.right); // Right child of node1
            queue.add(node2.left);  // Left child of node2
        }

        // If all comparisons passed, the tree is symmetric
        return true;
    }
}
