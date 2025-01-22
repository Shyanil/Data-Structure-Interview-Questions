class Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root) {
      return isValidBSTHelper(root , null , null);
    }

    public static boolean isValidBSTHelper(TreeNode root, Integer low, Integer high){
      if(root == null){
        return true;
      }

      if(low != null && root.val <= low){
        return false;
      }
      
      if(high != null && root.val >= high ){
        return false;
      }

      boolean left =  isValidBSTHelper(root.left , low , root.val);
      boolean right = isValidBSTHelper(root.right , root.val , high);
      return left && right;


    }
}