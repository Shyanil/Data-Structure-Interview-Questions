import java.util.Stack;

public class DFSWithStack {

    // Node class for binary tree, inside DFSWithStack
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
            left = right = null;
        }
    }

    // DFS using stack
    void dfsStack(Node node) {
     if(node == null){
         return;
     }

     Stack<Node> Snode = new Stack<>();
     Snode.push(node);

     while (!Snode.isEmpty()){
         Node r = Snode.pop();
         System.out.print(r.val + " ");

         if (r.right != null){
             Snode.push(r.right);
         }

         if (r.left != null){
             Snode.push(r.left);
         }
     }
    }

    public static void main(String[] args) {
        // Creating a sample tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Creating an instance of DFSWithStack
        DFSWithStack dfs = new DFSWithStack();
        System.out.print("DFS Traversal: ");
        dfs.dfsStack(root);
    }
}
