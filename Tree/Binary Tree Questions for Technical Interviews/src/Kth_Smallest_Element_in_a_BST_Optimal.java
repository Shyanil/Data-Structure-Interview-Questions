public class Kth_Smallest_Element_in_a_BST_Optimal {
    // A global variable to track the count of visited nodes
    public int COUNT = 0;

    /**
     * Main method to find the kth smallest element in a Binary Search Tree (BST)
     * @param root The root of the BST
     * @param k The k-th position of the element we want to find
     * @return The k-th smallest element in the BST
     */
    public int kthSmallest(TreeNode root, int k) {
        // We call the helper method to find the kth smallest element and return its value
        return kthSmallestHelper(root, k).val;
    }

    /**
     * Helper method to perform an in-order traversal of the BST
     * and find the k-th smallest element
     * @param root The current node in the BST
     * @param k The k-th position of the element we want to find
     * @return The node containing the k-th smallest element
     */
    private TreeNode kthSmallestHelper(TreeNode root, int k) {
        // Base case: if the current node is null, return null
        if (root == null) {
            return null;
        }

        // Recursive call to explore the left child (in-order traversal)
        TreeNode leftChild = kthSmallestHelper(root.left, k);

        // If we found the result in the left subtree, return it
        if (leftChild != null) {
            return leftChild;
        }

        // Increment the counter when we visit a node
        COUNT++;

        // If the current node is the kth smallest, return it
        if (COUNT == k) {
            return root;
        }

        // Recursive call to explore the right child (in-order traversal)
        return kthSmallestHelper(root.right, k);
    }

    /*
     * Time Complexity: O(H), where H is the height of the binary search tree.
     * In the worst case, it could be O(N) if the tree is skewed (like a linked list),
     * but in the best case, it is O(log N) for a balanced BST.
     *
     * Space Complexity: O(H), due to the recursion stack used in the in-order traversal.
     * In the worst case, it could be O(N) for a skewed tree, but O(log N) for a balanced BST.
     */
}
