public class BinarySearchTree {
    private class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;
    public BinarySearchTree() {}

    public int heightAll(){
        return height(root);
    }
    private int height(Node node){
        if(root == null || node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value) {
        // Call the insertHelper function with the current root and the value to insert.
        // If an empty spot is found, insert the new node; otherwise, return the existing root.
        // The updated root is assigned back to 'root' to maintain the tree structure.
        root = insertHelper(root, value);
    }

    private Node insertHelper(Node node, int value) {

        // Base condition: if the current node is null, create a new node with the given value
        // and return it to link it where it was called.
        if (node == null) {
            node = new Node(value);
            return node;
        }

        // Check if the value to insert is less than the current node's value.
        // If so, traverse to the left child.
        // The left child call will return the node it connects to, whether new or existing.
        // This ensures we properly link the left child.
        // The line node.left = insertHelper(node.left, value); essentially checks if node.left is null (meaning there is no left child) by calling insertHelper with node.left.
        if (value < node.value) {
            node.left = insertHelper(node.left, value);
        }

        // If the value is greater than the current node's value, traverse to the right child.
        // Similar to the left case, it will return the correct node to attach.
        // If it reaches a null node, it creates and inserts the new node.
        if (value > node.value) {
            node.right = insertHelper(node.right, value);
        }

        // Update the height of the current node after insertion.
        // This considers the maximum height from left or right subtrees, ensuring the height is updated correctly.
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // Return the node after updates to maintain the correct tree structure up the recursion stack.
        return rotate(node);
    }

    private Node rotate(Node node) {
        // the rotate 4 cases
        // first left - >  left case and left  -  > right case

        // left heavy means left has more element
        // Checks from parent
        if(height(node.left) - height(node.right) > 1){
            // right rotate p
            // this case only occurs when the node grandchild at the left is is heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                return  rightRotate(node);
            }
            // the node grand child is right and its heady then occurs
            // if(height(node.left.right) - height(node.left.left) > 0 )
            // same as below
            if(height(node.left.left) - height(node.left.right) < 0){
                // left rotate child on left side
                // here parent.left is child
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        //My approach
         //right heavy means left has more element
        // now right - > right case and right - >  left case
        // here node right is heavier
        if(height(node.left) - height(node.right) < -1){
            // the grand child on right side its heavy then child
            // so left rotate p
            if(height(node.right.left) - height(node.right.right)  < 0){
               return leftRotate(node);
            }
            // grandchild on the right left and its heabu twp step right rotate the child node then
            // parent node left rotate
            if(height(node.right.left) - height(node.right.right) > 0){
                // first node.right assign the child then next i rotate
                node.right = rightRotate(node.right);
               return leftRotate(node);
            }
        }

//        // Kunal approach
//        if (height(node.left) - height(node.right) < -1) {
//            // right heavy
//            if(height(node.right.left) - height(node.right.right) < 0) {
//                // right - > right case
//                return leftRotate(node);
//            }
//            if(height(node.right.left) - height(node.right.right) > 0) {
//                // left right case
//                node.right = rightRotate(node.right);
//                return leftRotate(node);
//            }
//        }

        return node;
    }

    public Node rightRotate(Node p){
     Node c = p.left;
     Node t = c.right;

     c.right = p;
     p.left = t;

     // update the p height and c height
        p.height = Math.max(height(p.left) , height(p.right) + 1);
        c.height = Math.max(height(c.left) , height(c.right) + 1);
     return c;

    }

    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;


        p.left = c;
        c.right = t;


        // update the p height and c height
        p.height = Math.max(height(p.left) , height(p.right) + 1);
        c.height = Math.max(height(c.left) , height(c.right) + 1);

        return p;
    }
    public void populate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
                insert(arr[i]);

        }
    }

    public void insertSorted(int[] num) {
        // Start the recursive insertion with the entire array
        insertSortedH(num, 0, num.length);
    }

    private void insertSortedH(int[] num, int start, int end) {
        // Base case: if the start index is greater than or equal to the end index, return
        if (start >= end) {
            return;
        }

        // Calculate the middle index to divide the array
        int mid = start + (end - start) / 2;

        // Insert the middle element into the sorted structure
        insert(num[mid]);

        // Recursively process the first half of the array
        // calling the first half and second half based condition
        // first half break two small first half and second half then print
        insertSortedH(num, start, mid);

        // Recursively process the second half of the array
        insertSortedH(num, mid + 1, end);
    }



    // Checking if the binary tree is balanced or not
    public boolean balanced() {
        return balancedF(root); // Start the check from the root of the tree
    }

    private boolean balancedF(Node node) {
        if (node == null) {
            // If the current node is null, it means we've reached the end of a branch
            // Returning true because an empty tree (or branch) is balanced
            return true;
        }

        // Check the height difference between the left and right subtrees
        // The tree is considered balanced if the height difference is <= 1
        // Also, recursively check if the left and right subtrees are balanced
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balancedF(node.left) // Recursion for the left child
                && balancedF(node.right); // Recursion for the right child
    }

    public void display(){
        displayNode(this.root , "Root Node :");
    }

    private void displayNode(Node node, String details) {
        if(node == null){
            return;
        }
        System.out.println(details + node.value);
        displayNode(node.left , "The child left node is " + node.value + " : ");
        displayNode(node.right , "The child right node is " + node.value + " : ");
    }

    // Pre-order traversal: first print Node -> then go left -> then right
    public void preOrder(){
        preOrderR(root); // Start the recursive pre-order traversal from the root
    }

    private void preOrderR(Node node) {
        if(node == null){
            return; // Base case: if the node is null, return
        }

        System.out.println("The Node : " + node.value); // Process the current node
        preOrderR(node.left); // Recursively traverse the left subtree
        preOrderR(node.right); // Recursively traverse the right subtree
    }

    // In-order traversal is better for printing the Binary Search Tree as it prints in sorted order
    // first goes left -> node -> right
    public void inOrder(){
        inOrderR(root); // Start the recursive in-order traversal from the root
    }

    private void inOrderR(Node node) {
        if(node == null){
            return; // Base case: if the node is null, return
        }

        inOrderR(node.left); // Recursively traverse the left subtree
        System.out.println("The Node : " + node.value); // Process the current node
        inOrderR(node.right); // Recursively traverse the right subtree
    }

    // Post-order traversal is best for deleting an item in the tree
    // We can't directly delete the node; first, handle the child nodes
    // When we use the Pomodoro technique for calculations, we can use height or diameters
    public void postOrder(){
        postOrderH(root); // Start the recursive post-order traversal from the root
    }

    private void postOrderH(Node node) {
        if(node == null){
            return; // Base case: if the node is null, return
        }

        postOrderH(node.left); // Recursively traverse the left subtree
        postOrderH(node.right); // Recursively traverse the right subtree
        System.out.println("The Node : " + node.value); // Process the current node after its children
    }

}
