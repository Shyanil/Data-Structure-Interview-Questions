public class Recover_Binary_Search_Tree {
    TreeNode first = null;
    TreeNode second = null;
    TreeNode prev = null;
    public void recoverTree(TreeNode root) {
      inOrder(root);
      int temp = first.val;
      first.val = second.val;
      second.val = temp;
    }
    private void inOrder(TreeNode root) {
      if(root == null) return;
      inOrder(root.left);
      if(prev != null && prev.val > root.val){
          if(first == null){
              first = prev;
          }
          second = root;
      }
      prev = root;
      inOrder(root.right);
    }
}
