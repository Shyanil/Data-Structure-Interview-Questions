import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS_traversal_of_a_Tree {

    // Method to perform Depth First Search (DFS) traversal of a binary tree
    public static List<Integer> DFS_traversal_of_a_Tree_Method(TreeNode root) {
        // If the root is null, return an empty list as there is no tree to traverse
        if (root == null) {
            return new ArrayList<>();
        }

        // Stack to help in iterative DFS traversal
        Stack<TreeNode> stack = new Stack<>();
        // List to store the DFS traversal order
        List<Integer> list = new ArrayList<>();

        // Start the traversal by pushing the root node onto the stack
        stack.push(root);

        // Loop until the stack becomes empty
        while (!stack.isEmpty()) {
            // Pop the top node from the stack
            TreeNode treeNode = stack.pop();
            // Add the value of the current node to the result list
            list.add(treeNode.val);

            // Push the right child of the current node onto the stack if it exists
            // Right child is pushed first so that the left child is processed first (LIFO order of stack)
            if (treeNode.right != null) {
                stack.push(treeNode.right);
            }

            // Push the left child of the current node onto the stack if it exists
            if (treeNode.left != null) {
                stack.push(treeNode.left);
            }
        }

        // Return the list containing the DFS traversal order
        return list;
    }
}
