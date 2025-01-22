import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PathSumFinder {
    // Function to find all paths that sum up to the target value
    public static List<List<Integer>> findPaths(TreeNode root, int sum) {
        // List to store the result of all valid paths
        List<List<Integer>> resultList = new ArrayList<>();

        // List to keep track of the current path
        List<Integer> innerList = new ArrayList<>();

        // Start the recursive search to find paths
        findPathsH(root, sum, resultList, innerList);

        return resultList;
    }

    // Helper function to explore all paths recursively
    private static void findPathsH(TreeNode root, int sum, List<List<Integer>> resultList, List<Integer> innerList) {
        // Base case: if the node is null, return
        if (root == null) {
            return;
        }

        // Add the current node value to the path
        innerList.add(root.val);

        // To store the sum of elements from the current node up to each previous node in the path
        int sumStep = 0;

        // Using ListIterator to traverse the path in reverse order (starting from the last element)
        ListIterator<Integer> listIterator = innerList.listIterator(innerList.size());

        // Check all sub-paths ending at the current node
        while (listIterator.hasPrevious()) {
            sumStep += listIterator.previous();

            // If a valid sub-path sum is found, add it to the result list
            if (sumStep == sum) {
                // Create a sublist for the valid path
                List<Integer> sublist = innerList.subList(listIterator.nextIndex(), innerList.size());
                resultList.add(sublist);  // Add this sublist to the result
            }
        }

        // Recur for the left and right subtrees
        findPathsH(root.left, sum, resultList, innerList);
        findPathsH(root.right, sum, resultList, innerList);

        // Backtrack: remove the current node from the path
        innerList.remove(innerList.size() - 1);
    }

    // Test case
    public static void main(String[] args) {
        // Constructing the binary tree for the test case
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);

        // Define the sum we are looking for
        int sum = 8;

        // Find all paths that sum up to the target value
        List<List<Integer>> paths = findPaths(root, sum);

        // Printing all valid paths
        System.out.println("All Valid Paths:");
        for (List<Integer> path : paths) {
            System.out.println(path);
        }
    }

    // TreeNode class definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }
}
