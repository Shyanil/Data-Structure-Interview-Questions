import java.util.LinkedList;
import java.util.Queue;

public class Successor {
    static class Node {
        Node left, right;
        int value;
    }

    // Utility function to create a
// new node with given value
    static Node newNode(int value)
    {
        Node temp = new Node();
        temp.left = null;
        temp.right = null;
        temp.value = value;

        return temp;
    }

    static Node levelOrderSuccessor(Node root, Node key){
        if(root == null){
            return null;
        }

        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()){
            Node currNode = nodeQueue.remove();
            if(currNode.left != null){
                nodeQueue.add(currNode.left);
            }
            if(currNode.right != null){
                nodeQueue.add(currNode.right);
            }

            if(currNode.value == key.value){
                break;
            }
        }
        return  nodeQueue.peek();
    }
}
