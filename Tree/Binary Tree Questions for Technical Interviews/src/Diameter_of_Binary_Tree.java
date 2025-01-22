public class Diameter_of_Binary_Tree {
    int diameter = 0;
    public  int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }

    private  int height(TreeNode root) {
        if(root == null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);
        int dia = left + right + 1;
        diameter = Math.max(dia , diameter);
        return Math.max(left , right) + 1;
    }
}
