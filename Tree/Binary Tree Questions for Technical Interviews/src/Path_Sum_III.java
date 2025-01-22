// Method to return the number of paths that sum to targetSum
public int pathSum(TreeNode root, int targetSum) {
    List<Integer> list = new ArrayList<>(); // Initialize an empty list to store the nodes on the current path
    return pathSumH(root, targetSum, list); // Call the helper function with the root, target sum, and the empty list
}

// Helper function to count the paths in the binary tree that sum to targetSum
public int pathSumH(TreeNode root, int targetSum, List<Integer> list) {
    if (root == null) { // Base case: If the current node is null, return 0 as there are no paths
        return 0;
    }

    list.add(root.val); // Add the current node's value to the list

    int count = 0; // Initialize the count of paths that sum to targetSum
    long sum = 0; // Variable to store the cumulative sum as we traverse the path

    // ListIterator to traverse the list from the end (last node) to the first node
    ListIterator<Integer> itr = list.listIterator(list.size());
    
    // Traverse the path from the last node to the first node
    while (itr.hasPrevious()) {
        sum += itr.previous(); // Add the node's value to the sum
        
        // If the cumulative sum equals the target sum, increment the count
        if (sum == targetSum) {
            count++;
        }
    }

    // Recurse for the left and right subtrees, adding the counts from both
    count += pathSumH(root.left, targetSum, list) + pathSumH(root.right, targetSum, list);

    list.remove(list.size() - 1); // Remove the current node's value from the list before returning

    return count; // Return the total count of paths that sum to targetSum
}
