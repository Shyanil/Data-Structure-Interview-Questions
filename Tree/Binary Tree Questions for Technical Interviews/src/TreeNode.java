public class TreeNode {
    public  int val;
    TreeNode left;
    TreeNode right;
     public TreeNode(TreeNode peek) {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
