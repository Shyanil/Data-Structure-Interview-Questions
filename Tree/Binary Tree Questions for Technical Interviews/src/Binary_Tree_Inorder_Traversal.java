class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        // If the root is null, return an empty list as there are no nodes to traverse
        if (root == null) {
            return new ArrayList<>();
        }

        // List to store the inorder traversal result
        List<Integer> list = new ArrayList<>();
        
        // Stack to help with the traversal
        Stack<TreeNode> stack = new Stack<>();
        
        // Current node starts at the root
        TreeNode curr = root;
        
        // Traverse while there are nodes to process (either in the stack or the current node is not null)
        while (curr != null || !stack.isEmpty()) {
            
            // Traverse the left subtree first
            while (curr != null) {
                // Push the current node onto the stack and move to its left child
                stack.push(curr);
                curr = curr.left;
            }
            
            // When there are no more left children, process the node
            if (!stack.isEmpty()) {
                // Pop the node from the stack and process it
                TreeNode node = stack.pop();
                
                // Add the node's value to the list
                list.add(node.val);
                
                // Move to the right child of the node
                curr = node.right;
            }
        }
        
        // Return the result of the inorder traversal
        return list;
    }
}

/* 
Time Complexity: 
    O(n) 
    - We visit each node once. For each node, we push and pop it from the stack exactly once.

Space Complexity: 
    O(n) 
    - The space complexity is O(n) due to the stack and the result list that stores the inorder traversal. 
    - In the worst case, the tree is skewed, and the stack may hold all the nodes at once.
*/
