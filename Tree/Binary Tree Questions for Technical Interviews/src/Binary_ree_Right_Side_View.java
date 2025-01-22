import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_ree_Right_Side_View {
    public static List<Integer> rightSideView(TreeNode root) {
        // If the root is null, return an empty list as there is no right-side view.
        if (root == null) {
            return new ArrayList<>();
        }

        // List to store the right-side view elements.
        List<Integer> result = new ArrayList<>();
        // Queue for level-order traversal (Breadth-First Search).
        Queue<TreeNode> queue = new LinkedList<>();
        // Start the BFS with the root node.
        queue.add(root);

        // Continue the traversal until the queue becomes empty.
        while (!queue.isEmpty()) {
            // Get the number of nodes at the current level.
            int size = queue.size();

            // Iterate through all nodes at the current level.
            for (int i = 0; i < size; i++) {
                // Remove the front node from the queue.
                TreeNode node = queue.remove();

                // If this is the last node of the current level, add its value to the result.
                if (i == size - 1) {
                    result.add(node.val);
                }

                // Add the left child to the queue if it exists.
                if (node.left != null) {
                    queue.add(node.left);
                }
                // Add the right child to the queue if it exists.
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }

        // Return the list containing the right-side view of the binary tree.
        return result;
    }
}

