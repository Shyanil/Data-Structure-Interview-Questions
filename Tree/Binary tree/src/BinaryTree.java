import java.util.Scanner;

public class BinaryTree {

    // the Node class the insert left or right
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node right, Node left) {
            this.value = value;
            this.right = right;
            this.left = left;
        }
    }

    Node root;


    public BinaryTree() {
    }


    // Method to insert a value at the root and initialize the tree structure
    public void insertU(Scanner sc) {
        // Reads the root value from the user input
        System.out.println("Please enter the root node ");
        int value = sc.nextInt();
        // Sets the root node with the given value
        root = new Node(value);
        // Calls the helper method to populate the tree with additional nodes
        insertPopulate(sc, root);
    }

    // Recursive helper method to populate nodes in the tree
    private void insertPopulate(Scanner sc, Node node) {
        // Asks the user if they want to insert a node to the left of the current node
        System.out.println("Do you want to insert in left? " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            // Prompts the user to enter a value for the left child node
            System.out.println("Please write the value you want to insert on left of " + node.value);
            int value = sc.nextInt();
            // Creates the left child node and recurses to populate further nodes
            node.left = new Node(value);
            insertPopulate(sc, node.left);
        }

        // Asks the user if they want to insert a node to the right of the current node
        System.out.println("Do you want to insert in right? " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            // Prompts the user to enter a value for the right child node
            System.out.println("Please write the value you want to insert on right of " + node.value);
            int value = sc.nextInt();
            // Creates the right child node and recurses to populate further nodes
            node.right = new Node(value);
            insertPopulate(sc, node.right);
        }
    }

    public void display() {
        displayM(this.root, "", true);
    }

    // Helper method to display the tree in a structured format
    private void displayM(Node node, String indent, boolean isRight) {
        if (node == null) {
            return;
        }

        // Increase indentation for each level, alternate for left and right branches
        String prefix = indent + (isRight ? "├── " : "└── ");

        // Print the current node's value with indentation
        System.out.println(prefix + node.value);

        // Recursively display left and right subtrees with increased indentation
        displayM(node.left, indent + (isRight ? "│   " : "    "), false);
        displayM(node.right, indent + (isRight ? "│   " : "    "), true);
    }



}
