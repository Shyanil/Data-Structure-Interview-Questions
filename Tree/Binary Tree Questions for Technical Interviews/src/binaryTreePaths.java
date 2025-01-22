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
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        // Base case: if the tree is empty, return an empty list.
        if (root == null) {
            return new ArrayList<>();
        }

        // List to store all root-to-leaf paths.
        List<String> ans = new ArrayList<>();

        // Queue to perform BFS traversal on the tree.
        Queue<TreeNode> queue = new LinkedList<>();
        // Queue to store the paths corresponding to the nodes in the `queue`.
        Queue<String> pathQueue = new LinkedList<>();

        // Initialize the queues with the root node and its value as the starting path.
        queue.add(root);
        pathQueue.add(String.valueOf(root.val));

        // BFS loop to traverse the tree.
        while (!queue.isEmpty()) {
            // Remove the current node and its corresponding path from the queues.
            TreeNode currNode = queue.remove();
            String currNodeP = pathQueue.remove();

            // If the current node is a leaf (no left or right children),
            // add the current path to the result list.
            if (currNode.left == null && currNode.right == null) {
                ans.add(currNodeP);
            }

            // If the left child exists, enqueue it and update the path.
            if (currNode.left != null) {
                queue.add(currNode.left);
                pathQueue.add(currNodeP + "->" + currNode.left.val);
            }

            // If the right child exists, enqueue it and update the path.
            if (currNode.right != null) {
                queue.add(currNode.right);
                pathQueue.add(currNodeP + "->" + currNode.right.val);
            }
        }

        // Return the list of all root-to-leaf paths.
        return ans;
    }
}
