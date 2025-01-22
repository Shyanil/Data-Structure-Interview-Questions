import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SD {

    class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }


    public List<String> serialize(Node node){
        List<String> list = new ArrayList<>();
        helper(node , list);
        return  list;
    }

    private void helper(Node node, List<String> list) {
        if(node == null){
            list.add("null");
            return;
        }

        list.add(String.valueOf(node.val));
        helper(node.left , list);
        helper(node.right , list);
    }


    public  Node deserialize(List<String> list){
        Collections.reverse(list);
        Node node = helper2(list);
        return  node;
    }

    private Node helper2(List<String> list) {
      String value = list.removeLast();

      if(value.charAt(0) == 'n'){
          return  null;
      }

      Node node = new Node(Integer.parseInt(value));
      node.left = helper2(list);
      node.right = helper2(list);

      return node;
    }
}
