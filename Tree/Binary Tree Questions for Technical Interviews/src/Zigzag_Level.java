import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/*
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
class Zigzag_Level {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // Handle edge case when the root is null
        if (root == null) {
            return new ArrayList<>();
        }

        // Initialize the result list to store levels
        List<List<Integer>> outer = new ArrayList<>();

        // Use a deque to facilitate zigzag traversal
        Deque<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        // Boolean flag to indicate zigzag direction
        boolean isRev = false;

        // Process nodes level by level
        while (!nodeQueue.isEmpty()) {
            int levelSize = nodeQueue.size(); // Number of nodes at the current level
            List<Integer> integerList = new ArrayList<>();

            // Process all nodes at the current level
            for (int i = 0; i < levelSize; i++) {
                if (!isRev) {
                    // Normal left-to-right traversal
                    TreeNode currNode = nodeQueue.removeFirst();
                    integerList.add(currNode.val);

                    // Add children to the deque in left-to-right order
                    if (currNode.left != null) {
                        nodeQueue.addLast(currNode.left);
                    }
                    if (currNode.right != null) {
                        nodeQueue.addLast(currNode.right);
                    }
                } else {
                    // Reverse right-to-left traversal
                    TreeNode currNode = nodeQueue.removeLast();
                    integerList.add(currNode.val);

                    // Add children to the deque in right-to-left order
                    if (currNode.right != null) {
                        nodeQueue.addFirst(currNode.right);
                    }
                    if (currNode.left != null) {
                        nodeQueue.addFirst(currNode.left);
                    }
                }
            }

            // Add the current level's values to the result
            outer.add(integerList);

            // Toggle the zigzag direction for the next level
            isRev = !isRev;
        }

        return outer;
    }
}

/*
 * Time Complexity: O(N)
 * - Each node in the tree is processed exactly once, where N is the number of nodes in the tree.
 * - Adding/removing elements from the deque and appending to the list are O(1) operations.

 * Space Complexity: O(N)
 * - The space required for the deque is proportional to the maximum number of nodes at any level, which is O(N) in the worst case (for a balanced binary tree).
 * - The space required for the result list is also O(N), as it stores all node values.
 */
