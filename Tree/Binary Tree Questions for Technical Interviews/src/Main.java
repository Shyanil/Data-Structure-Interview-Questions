public class Main {
    public static void main(String[] args) {
        Successor.Node root = Successor.newNode(1);
        Successor.Node node2 = Successor.newNode(2);
        Successor.Node node3 = Successor.newNode(3);
        Successor.Node node4 = Successor.newNode(4);

        // Build the tree
        root.left = node2;
        root.right = node3;
        node2.left = node4;

        // Test for level-order successor of node 2
        Successor.Node successor = Successor.levelOrderSuccessor(root, node2);

        // Print the successor value
        if (successor != null) {
            System.out.println("Level order successor of node " + node2.value + " is: " + successor.value);
        } else {
            System.out.println("No successor found.");
        }
    }
}