public class Segment_tree {

    private  static class  Node{
        int data;
        int startinterVal;
        int endinterVal;
        Node left;
        Node right;

        public Node(int startinterVal, int endinterVal) {
            this.startinterVal = startinterVal;
            this.endinterVal = endinterVal;
        }
    }
   Node root;
    public Segment_tree(int[] arr) {
      this.root = changeitSegment_tree(arr , 0 , arr.length - 1);
    }

    private Node changeitSegment_tree(int[] arr, int start, int end) {
        if(start ==  end){
            Node leaf = new Node(start , end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start , end);

        // find the end
        int mid = (start + end) / 2;

        node.left = this.changeitSegment_tree(arr , start , mid);
        node.right = this.changeitSegment_tree(arr , mid + 1 , arr.length - 1);
        node.data = node.left.data + node.right.data;
        return node;

    }

    public int queryInterval(int qSI, int qEI){
        return queryIntervalH(this.root , qSI ,qEI);
    }

    private int queryIntervalH(Node node, int qSI, int qEI) {
        if(node.startinterVal >= qSI && node.endinterVal <= qEI){
            return node.data;
        }

        else if(node.startinterVal > qEI || node.endinterVal < qSI){
            return 0;
        } else{
            return queryIntervalH(node.left , qSI , qEI) + queryIntervalH(node.right , qSI , qEI);
        }
    }

    public void updateIndex(int index , int value){
        this.root.data = updateIndexH(this.root , index , value);
    }

    private int updateIndexH(Node node, int index, int value) {
        if(index >= node.startinterVal  && index<= node.endinterVal){
            if(index == node.startinterVal && index == node.endinterVal){
                node.data = value;
                return node.data;
            } else {
                int left = updateIndexH(node.left , index , value);
                int right = updateIndexH(node.right , index , value);
                node.data = left + right;
                return node.data;
            }
        }
        return node.data;
    }

    // Display function to print the tree visually
    public void display() {
        displayTree(this.root, 0);
    }

    private void displayTree(Node node, int level) {
        if (node == null) {
            return;
        }

        // Indentation for each level
        String indent = "  ".repeat(level);

        // Print the current node
        System.out.println(indent + "Node [" + node.startinterVal + ", " + node.endinterVal + "] -> " + node.data);

        // Recurse for left and right child
        if (node.left != null || node.right != null) {
            System.out.println(indent + "  Left Child:");
            displayTree(node.left, level + 1);

            System.out.println(indent + "  Right Child:");
            displayTree(node.right, level + 1);
        }
    }
}
