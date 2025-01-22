import java.util.Arrays;

public class BinaryTreeFromPreIn {

    /**
     * This method builds a binary tree from the given preorder and inorder traversal arrays.
     * @param preorder The preorder traversal of the binary tree.
     * @param inorder The inorder traversal of the binary tree.
     * @return The root of the constructed binary tree.
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // Base case: if the preorder array is empty, return null (no tree to build)
        if (preorder.length == 0) {
            return null;
        }

        // The root of the tree is always the first element in preorder traversal
        int root = preorder[0];

        // Find the index of the root in inorder traversal
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root) {
                index = i;
            }
        }

        // Create the root node of the tree
        TreeNode treeNode = new TreeNode(root);

        // Recursively build the left subtree (elements in preorder[1 ... index] and inorder[0 ... index-1])
        treeNode.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));

        // Recursively build the right subtree (elements in preorder[index+1 ... end] and inorder[index+1 ... end])
        treeNode.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));

        // Return the constructed tree
        return treeNode;
    }

    /*
     * Time Complexity:
     * - **O(N^2)** where N is the number of nodes in the tree.
     * - For each node, the method searches for the index of the root in the inorder array,
     * which takes O(N). This happens for each of the N nodes in the tree, so the total complexity is O(N^2).
     *
     * Space Complexity:
     * - **O(N)** for the recursion stack due to the recursive calls in the tree construction.
     * - Additionally, the copy of arrays using `Arrays.copyOfRange` creates new arrays for each subtree.
     * Thus, the total space complexity can be O(N) for the recursion stack and O(N) for array copies, making it O(N).
     */
}
