import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Level_Order_Traversal_II {
    /**
     * Perform a bottom-up level order traversal of a binary tree.
     *
     * @param root the root node of the binary tree
     * @return a list of lists where each sublist contains the values of nodes at each level,
     *         starting from the bottom-most level to the top level.
     *
     * Time Complexity: O(n)
     * - Each node in the tree is processed exactly once.
     *
     * Space Complexity: O(w)
     * - The queue can hold at most the number of nodes at the widest level of the tree (w),
     *   and the result list holds all the nodes (n).
     * - Therefore, the space complexity is O(w), where w is the maximum width of the tree.
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        // If the tree is empty, return an empty list.
        if (root == null) {
            return new ArrayList<>();
        }

        // Use a LinkedList to store levels in reverse order (bottom-up).
        LinkedList<List<Integer>> result = new LinkedList<>();

        // Queue for performing level-order traversal.
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root); // Start with the root node.

        // Perform BFS to traverse the tree level by level.
        while (!nodeQueue.isEmpty()) {
            // List to store values at the current level.
            List<Integer> currentLevel = new ArrayList<>();

            // Number of nodes in the current level.
            int levelSize = nodeQueue.size();

            // Process each node in the current level.
            for (int i = 0; i < levelSize; i++) {
                // Remove a node from the queue.
                TreeNode currentNode = nodeQueue.remove();

                // Add the node's value to the current level list.
                currentLevel.add(currentNode.val);

                // Add the left child to the queue if it exists.
                if (currentNode.left != null) {
                    nodeQueue.add(currentNode.left);
                }

                // Add the right child to the queue if it exists.
                if (currentNode.right != null) {
                    nodeQueue.add(currentNode.right);
                }
            }

            // Add the current level list to the beginning of the result.
            result.addFirst(currentLevel);
        }

        // Convert the LinkedList to an ArrayList before returning.
        return new ArrayList<>(result);
    }
}
