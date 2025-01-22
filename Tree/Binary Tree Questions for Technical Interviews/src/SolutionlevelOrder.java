
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
import java.util.*;

class SolutionlevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // Initialize the result list to store each level's nodes
        List<List<Integer>> result = new ArrayList<>();

        // Base case: If the root is null, return the empty result list
        if (root == null) {
            return result;
        }

        // Initialize a queue to facilitate the level-order traversal (Breadth-First
        // Search)
        Queue<TreeNode> queue = new LinkedList<>();
        // Add the root node to the queue
        queue.add(root);

        // Loop until there are no more nodes to process in the queue
        while (!queue.isEmpty()) {
            // Get the number of nodes in the current level
            int levelSize = queue.size();

            // Create a list to store the current level's nodes
            List<Integer> currLevel = new ArrayList<>(levelSize);

            // Process all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                // Remove the front node from the queue
                TreeNode currNode = queue.remove();

                // Add the current node's value to the current level list
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

            // Add the current level list to the result list
            result.add(currLevel);
        }

        // Return the final result containing all levels
        return result;
    }
}
