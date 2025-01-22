import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codec {
public class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
 }
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> stringList = new ArrayList<>();
        serializeH(root , stringList);
        return String.join("," ,stringList);
    }

    private void serializeH(TreeNode root, List<String> stringList) {
       if(root == null){
           stringList.add("null");
           return;
       }

       stringList.add(String.valueOf(root.val));
       serializeH(root.left , stringList);
       serializeH(root.right , stringList);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> list = new ArrayList<>(Arrays.asList(data.split(",")));
        return deserializeH(list);
    }

    private TreeNode deserializeH(List<String> list) {
       if(list.isEmpty()){
           return null;
       }

       String value = list.remove(0);
       if(value.equals("null")){
           return null;
       }

       TreeNode treeNode = new TreeNode(Integer.parseInt(value));
       treeNode.left = deserializeH(list);
       treeNode.right = deserializeH(list);
       return treeNode;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));