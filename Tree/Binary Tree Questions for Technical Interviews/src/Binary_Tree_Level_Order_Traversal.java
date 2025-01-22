import java.util.*;
public class Binary_Tree_Level_Order_Traversal {
    // https://leetcode.com/problems/binary-tree-level-order-traversal/description/

    /**
     * This method performs a level-order traversal of a binary tree.
     * It processes nodes level by level and returns a list of lists,
     * where each inner list contains the values of the nodes at a particular level.
     *
     * @param root The root of the binary tree
     * @return A list of lists containing node values level by level
     */
    public static List<List<Integer>> levelOrder(TreeNode root) {
        // Initialize the result list to store the final level order traversal
        List<List<Integer>> result = new ArrayList<>();

        // If the tree is empty, return an empty list
        if (root == null) {
            return result;
        }

        // Initialize a queue to help with level order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        // Add the root node to the queue to start the traversal
        queue.add(root);

        // Loop until the queue is empty (i.e., all nodes are processed)
        while (!queue.isEmpty()) {
            // Determine the number of nodes at the current level
            int levelSize = queue.size();
            // Create a list to store the values of nodes at the current level
            List<Integer> currLevel = new ArrayList<>(levelSize);

            // Process all nodes in the current level
            for (int i = 0; i < levelSize; i++) {
                // Remove the front node from the queue
                TreeNode currNode = queue.remove();
                // Add the value of the current node to the current level list
                currLevel.add(currNode.val);

                // If the current node has a left child, add it to the queue
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                // If the current node has a right child, add it to the queue
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }
            // Add the current level's list to the result list
            result.add(currLevel);
        }

        // Return the final result containing level order traversal
        return result;
    }
}
