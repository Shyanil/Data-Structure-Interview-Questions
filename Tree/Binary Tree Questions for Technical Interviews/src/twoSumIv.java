class Solution {
    // Main function that starts the process
    public boolean findTarget(TreeNode root, int k) {
        // HashSet to store the values of the nodes we have visited
        HashSet<Integer> set = new HashSet<>();
        // Helper function that recursively checks for the target sum
        return findTargetH(root, k, set);
    }

    // Helper function for recursion
    private boolean findTargetH(TreeNode root, int k, HashSet<Integer> set) {
        // If the current node is null, no pair exists
        if (root == null) return false;
        
        // Check if the complement of the current node's value exists in the set
        if (set.contains(k - root.val)) return true;
        
        // Add the current node's value to the set
        set.add(root.val);
        
        // Recursively search in the left and right subtrees
        return findTargetH(root.left, k, set) || findTargetH(root.right, k, set);
    }

    /*
    Time Complexity:
    - The function processes each node once. For each node, we check if its complement exists in the set and add its value to the set.
    - Each operation inside the function is constant time O(1).
    - Since we process all N nodes in the tree, the time complexity is O(N).
    
    Space Complexity:
    - The space complexity is determined by the size of the HashSet used to store node values.
    - In the worst case, we will store all the node values in the HashSet.
    - Therefore, the space complexity is O(N), where N is the number of nodes in the tree.
    */
}
