import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    Node left, right;

    Node(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class SolutionfindPaths {
    public List<List<Integer>> findPaths(Node node, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(node, sum, path, paths);
        return paths;
    }

    private void helper(Node node, int sum, List<Integer> path, List<List<Integer>> paths) {
        if (node == null) {
            return;
        }

        // Add the current node value to the path
        path.add(node.val);

        // If it's a leaf node and the sum is met, add the path to paths list
        if (node.val == sum && node.left == null && node.right == null) {
            paths.add(new ArrayList<>(path));
        } else {
            // Continue to the left and right subtrees
            helper(node.left, sum - node.val, path, paths);
            helper(node.right, sum - node.val, path, paths);
        }

        // Backtrack: Remove the current node from the path
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        // Example usage with a binary tree
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.left = new Node(5);
        root.right.right.right = new Node(1);

        SolutionfindPaths solution = new SolutionfindPaths();
        int sum = 22;  // Sum to find
        List<List<Integer>> paths = solution.findPaths(root, sum);

        // Printing the result
        System.out.println(paths);
    }
}
