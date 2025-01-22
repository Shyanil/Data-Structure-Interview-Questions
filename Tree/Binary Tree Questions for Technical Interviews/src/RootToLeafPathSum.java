import java.util.ArrayList;
import java.util.List;

public class RootToLeafPathSum {

    // Main method to find all root-to-leaf paths with the target sum
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        // Result list to store all valid paths
        List<List<Integer>> resultList = new ArrayList<>();
        // Temporary list to build a path as we traverse
        List<Integer> list = new ArrayList<>();
        // Helper function to perform DFS traversal
        pathSumH(root, targetSum, resultList, list);
        return resultList;
    }

    // Helper function to recursively find the paths
    private void pathSumH(TreeNode root, int targetSum, List<List<Integer>> resultList, List<Integer> list) {
        // Base case: if the current node is null, return
        if (root == null) {
            return;
        }

        // Add the current node value to the path list
        list.add(root.val);

        // Check if we have reached a leaf node and if the current path sums to targetSum
        if (root.val == targetSum && root.left == null && root.right == null) {
            // If it's a valid path, add a copy of the path to the result list
            resultList.add(new ArrayList<>(list));
        } else {
            // Recurse for left and right subtrees, reducing the target sum by the current node's value
            pathSumH(root.left, targetSum - root.val, resultList, list);
            pathSumH(root.right, targetSum - root.val, resultList, list);
        }

        // Backtrack: remove the last element from the current path to explore other paths
        list.removeLast();
    }
}