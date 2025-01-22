import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Serialize_and_Deserialize_Binary_Tree {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        serializeH(root , list); // Call helper method to perform the serialization
        return String.join("," , list); // Join the list into a string with commas
    }

    // Helper function to recursively serialize the tree
    private void serializeH(TreeNode root, List<String> list) {
        if(root == null) {
            list.add("null"); // Add "null" for empty nodes
            return;
        }
        list.add(String.valueOf(root.val)); // Add the current node's value
        serializeH(root.left , list); // Recursively serialize the left subtree
        serializeH(root.right , list); // Recursively serialize the right subtree
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> stringList = new ArrayList<>(Arrays.asList(data.split(","))); // Split the string into a list
        return deserializeH(stringList); // Call helper method to perform the deserialization
    }

    // Helper function to recursively deserialize the string into a tree
    private TreeNode deserializeH(List<String> stringList) {
        if(stringList.isEmpty()) {
            return null; // Return null if the list is empty (no more nodes to process)
        }

        String treeNodeVal = stringList.removeFirst(); // Get the first value from the list
        if(treeNodeVal.equals("null")) {
            return null; // Return null if the value is "null" (indicating no node)
        }

        TreeNode treeNode = new TreeNode(Integer.parseInt(treeNodeVal)); // Create a new node with the parsed value
        treeNode.left = deserializeH(stringList); // Recursively create the left child
        treeNode.right = deserializeH(stringList); // Recursively create the right child
        return treeNode; // Return the created node
    }
}
