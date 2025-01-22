import java.util.List;
import java.util.ArrayList;

public class Inorder_predecessor_and_successor {
    /**
     * Finds the predecessor and successor of a given key in a Binary Search Tree
     * 
     * Time Complexity: O(H) where H is height of the tree
     * - Best case (balanced BST): O(log N) where N is number of nodes
     * - Worst case (skewed BST): O(N)
     * 
     * Space Complexity: O(1) as we only use a constant amount of extra space
     * regardless of input size
     * 
     * @param root The root node of the BST
     * @param key The key value for which we need to find predecessor and successor
     * @return List containing [predecessor, successor]. Returns -1 if either doesn't exist
     */
    public static List<Integer> predecessorSuccessor(TreeNode root, int key) {
        // Initialize result list to store predecessor and successor
        List<Integer> ans = new ArrayList<>();
        
        // Keep track of potential predecessor and successor nodes
        TreeNode predecessor = null;
        TreeNode successor = null;
        
        // Start traversal from root
        TreeNode current = root;
        
        // First phase: Search for the key node while keeping track of potential
        // predecessor and successor
        // Time Complexity: O(H) where H is height of tree
        while (current != null) {
            if (key < current.data) {
                // If we go left, current node could be successor
                // because it's greater than the key we're looking for
                successor = current;
                current = current.left;
            } else if (key > current.data) {
                // If we go right, current node could be predecessor
                // because it's less than the key we're looking for
                predecessor = current;
                current = current.right;
            } else {
                // We found the key node, break to proceed to second phase
                break;
            }
        }
        
        // Second phase: If key node is found, check its subtrees
        if (current != null) {
            // Case 1: Find predecessor in left subtree
            // Predecessor will be the maximum value in left subtree
            if (current.left != null) {
                predecessor = findMax(current.left);
            }
            
            // Case 2: Find successor in right subtree
            // Successor will be the minimum value in right subtree
            if (current.right != null) {
                successor = findMin(current.right);
            }
        }
        
        // Convert TreeNode references to integers for result
        // Use -1 if predecessor/successor doesn't exist
        ans.add(predecessor != null ? predecessor.data : -1);
        ans.add(successor != null ? successor.data : -1);
        
        return ans;
    }

    /**
     * Helper method to find the maximum value node in a BST
     * Time Complexity: O(H) - traverses at most the height of the tree
     * Space Complexity: O(1) - uses constant extra space
     */
    private static TreeNode findMax(TreeNode root) {
        // Maximum value will be the rightmost node
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    /**
     * Helper method to find the minimum value node in a BST
     * Time Complexity: O(H) - traverses at most the height of the tree
     * Space Complexity: O(1) - uses constant extra space
     */
    private static TreeNode findMin(TreeNode root) {
        // Minimum value will be the leftmost node
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}