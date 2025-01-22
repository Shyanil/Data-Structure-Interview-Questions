import java.util.LinkedList;
import java.util.Queue;

public class Level_Order_Successor {

    // Function to find the level-order successor of a given node in a binary tree
    public static TreeNode Successor(TreeNode root, int key) {
        // If the tree is empty, return null
        if (root == null) {
            return null;
        }

        // Initialize a queue for level-order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root); // Start with the root node

        // Traverse the tree in level-order
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove(); // Remove the current node from the queue

            // Add the left child to the queue if it exists
            if (node.left != null) {
                queue.add(node.left);
            }

            // Add the right child to the queue if it exists
            if (node.right != null) {
                queue.add(node.right);
            }

            // Check if the current node matches the key
            if (node.val == key) {
                // The next node in the queue (if any) is the level-order successor
                return queue.isEmpty() ? null : queue.peek();
            }
        }

        // If the key is not found or has no successor, return null
        return null;
    }
}
