public class Cousins_in_Binary_Tree {

    // Method to determine if two nodes are cousins
    public static boolean isCousins(TreeNode root, int x, int y) {
        // Find the nodes corresponding to values x and y
        TreeNode xNode = findNode(root, x);
        TreeNode yNode = findNode(root, y);

        // Check if they are at the same level and not siblings
        return (level(root, xNode, 0) == level(root, yNode, 0) && !isSibling(root, xNode, yNode));
    }

    // Helper method to find a node with the given value
    private static TreeNode findNode(TreeNode root, int num) {
        if (root == null) {
            return null;
        }

        if (root.val == num) {
            return root;
        }

        TreeNode leftC = findNode(root.left, num);
        if (leftC != null) {
            return leftC;
        }

        return findNode(root.right, num);
    }

    // Helper method to check if two nodes are siblings
    private static boolean isSibling(TreeNode root, TreeNode xNode, TreeNode yNode) {
        if (root == null) {
            return false;
        }
        return (root.left == xNode && root.right == yNode) ||
                (root.left == yNode && root.right == xNode) ||
                isSibling(root.left, xNode, yNode) ||
                isSibling(root.right, xNode, yNode);
    }

    // Helper method to find the level of a node
    private static int level(TreeNode treeNode, TreeNode x, int level) {
        if (treeNode == null) {
            return 0;
        }

        if (treeNode == x) {
            return level;
        }

        int l = level(treeNode.left, x, level + 1);
        if (l != 0) {
            return l;
        }

        return level(treeNode.right, x, level + 1);
    }
}

/*
Time Complexity:
1. `findNode`: O(N)
   - In the worst case, it traverses all nodes in the tree to locate the target node.
2. `level`: O(N)
   - Similarly, it may traverse all nodes to determine the level of the target node.
3. `isSibling`: O(N)
   - Traverses the tree to check sibling relationships.

Overall Time Complexity: O(N)
   - Since the methods `findNode`, `level`, and `isSibling` are all called independently.

Space Complexity:
1. Recursive calls in `findNode`, `level`, and `isSibling` use stack space proportional to the height of the tree.
2. For a balanced tree, the height is O(log N), and for a skewed tree, it is O(N).

Overall Space Complexity: O(H), where H is the height of the tree.
*/
