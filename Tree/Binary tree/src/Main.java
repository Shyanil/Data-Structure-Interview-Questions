import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        BinaryTree binaryTree = new BinaryTree();
//        Scanner sc = new Scanner(System.in);
//        binaryTree.insertU(sc);
//        binaryTree.display();
//        BinarySearchTree searchTree = new BinarySearchTree();
////        int[] arr = {10 , 20  , 30 , 4 , 3  , 1 , 100};
////        searchTree.populate(arr);
////        searchTree.display();
////        System.out.println("This is balanced tree ? "+ searchTree.balanced());
//        int [] demo = {1 , 2, 3 , 4};
//        searchTree.populate(demo);
//        searchTree.preOrder();
//        searchTree.inOrder();
//        searchTree.postOrder();
//        searchTree.display();


//        BinarySearchTree bst = new BinarySearchTree();
//        for (int i = 0; i < 10; i++) {
//            bst.insert(i);
//        }
//        bst.display();
//        System.out.println(bst.heightAll()); // log(n)

        /*
                * // Calculate the height of node 10
        int height10 = height(node10); // Height(10) = max(Height(10.left), Height(10.right)) + 1
        // Assuming node 10 has no left child (null) and its right child is node 20,
        // height(10.left) = -1 (since it's null) and height(10.right) = height(20).
        // Height(20) needs to be calculated next to determine height(10).

        // Calculate the height of node 20
        int height20 = height(node20); // Height(20) = max(Height(20.left), Height(20.right)) + 1
        // Node 20 has no left child (null) and has a right child (node 30).
        // height(20.left) = -1 (null) and height(20.right) = height(30), which also needs to be calculated.

        // Finally, calculate the balance factor for node 10
        int balance10 = balanceFactor(node10); // Balance Factor(10) = Height(10.left) - Height(10.right)
        // Here, Height(10.left) = -1 and Height(10.right) = Height(20) = 2 (after calculating it).
        // Thus, Balance Factor(10) = -1 - 2 = -3, indicating that node 10 is right-heavy.
//
//        *
//        * */
//
//
//        // Sample array for the segment tree
//        int[] arr = {1, 3, 5, 7, 9, 11};
//
//        // Creating the Segment Tree
//        Segment_tree segmentTree = new Segment_tree(arr);
//
//        // Display the constructed segment tree
//        System.out.println("Segment Tree:");
//        segmentTree.display();
//
//        // Query example: sum of elements in range [1, 3]
//        int queryResult = segmentTree.queryInterval(1, 3);
//        System.out.println("Query [1, 3] result: " + queryResult);
//
//        // Update example: update index 2 with value 10
//        segmentTree.updateIndex(2, 10);
//
//        // Display the segment tree after the update
//        System.out.println("\nSegment Tree after update:");
//        segmentTree.display();
//
//        // Query after update: sum of elements in range [1, 3]
//        queryResult = segmentTree.queryInterval(1, 3);
//        System.out.println("Query [1, 3] result after update: " + queryResult);

        AVL tree = new AVL();

        for(int i=0; i < 1000; i++) {
            tree.insert(i);
        }

        System.out.println(tree.height());
    }

    }

