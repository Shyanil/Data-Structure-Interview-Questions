/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        // If the root is null, return null immediately as there's nothing to connect
        if (root == null) {
            return null;
        }

        // Start with the leftmost node of the current level, beginning at the root
        Node leftMost = root;

        // Continue until we reach a level where there are no children (leaf level)
        while (leftMost.left != null) {
            // Initialize a pointer to traverse nodes at the current level
            Node currNode = leftMost;

            // Traverse all nodes at the current level
            while (currNode != null) {
                // Connect the left child to the right child of the current node
                currNode.left.next = currNode.right;

                // If the current node has a `next` pointer, connect the current node's
                // right child to the left child of the next node
                if (currNode.next != null) {
                    currNode.right.next = currNode.next.left;
                }

                // Move to the next node at the current level
                currNode = currNode.next;
            }

            // Move to the leftmost node of the next level
            leftMost = leftMost.left;
        }

        // Return the modified tree
        return root;
    }
}
