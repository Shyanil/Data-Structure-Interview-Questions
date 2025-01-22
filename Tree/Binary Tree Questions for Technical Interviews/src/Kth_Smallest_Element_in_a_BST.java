import java.util.Stack;

public class Kth_Smallest_Element_in_a_BST {

    /**
     * This method finds the k-th smallest element in a BST using an iterative in-order traversal
     * @param root The root of the BST
     * @param k The k-th smallest element to find
     * @return The k-th smallest element's value in the BST
     */
    public static int kthSmallest(TreeNode root, int k) {
        // If the root is null, return 0 (indicating no element is found)
        if (root == null) {
            return 0;
        }

        // Initialize an empty stack to simulate the recursive call stack for in-order traversal
        Stack<TreeNode> stack = new Stack<>();

        // Variable to count the number of visited nodes
        int count = 0;

        // Perform an in-order traversal iteratively
        while (root != null || !stack.isEmpty()) {

            // Push all left nodes onto the stack
            while (root != null) {
                stack.push(root);
                root = root.left;  // Move to the left child
            }

            // Pop the top node from the stack (this is the next smallest element in the traversal)
            root = stack.pop();

            // Increment the count of visited nodes
            count++;

            // If the count matches k, return the current node's value
            if (count == k) {
                return root.val;
            }

            // Move to the right child of the current node for further exploration
            root = root.right;
        }

        // Return 0 if no k-th element is found (although this should not happen in a valid BST)
        return 0;
    }

    /*
     * Time Complexity: O(N), where N is the number of nodes in the tree.
     * In the worst case, all nodes will need to be processed in the in-order traversal.
     *
     * Space Complexity: O(H), where H is the height of the tree.
     * The space complexity comes from the stack used to store the nodes during the traversal.
     * In the worst case (skewed tree), the space complexity is O(N). For a balanced tree, it is O(log N).
     */
}
