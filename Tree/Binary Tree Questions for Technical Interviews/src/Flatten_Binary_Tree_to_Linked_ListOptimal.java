public class Flatten_Binary_Tree_to_Linked_ListOptimal {
    public static void flatten(TreeNode root) {
        if(root == null){
            return;
        }

        TreeNode current = root;
        while (current != null){
            if(current.left != null){
                TreeNode treeNode = current.left;
                while (treeNode.right != null){
                    treeNode = treeNode.right;
                }
                treeNode.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }
}
