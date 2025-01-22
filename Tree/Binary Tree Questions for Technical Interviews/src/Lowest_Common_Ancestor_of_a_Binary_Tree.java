class Lowest_Common_Ancestor_of_a_Binary_Tree{
	
	 // This function finds the Lowest Common Ancestor (LCA) of two nodes p and q
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // If the root is null, return null (base case)
        if(root == null){
            return null;
        }

        // If the current node is either p or q, return the current node as the ancestor
        if(root == p || root == q){
            return root;
        }

        // Recursively search for the LCA in the left subtree
        TreeNode left = lowestCommonAncestor(root.left , p , q);
        
        // Recursively search for the LCA in the right subtree
        TreeNode right = lowestCommonAncestor(root.right , p , q);

        // If LCA is found in both left and right subtrees, the current node is the LCA
        if(left != null && right != null){
            return root;
        }

        // If one of the subtrees has the LCA, return it. Otherwise, return the other subtree.
        // If left is null, return right, otherwise return left.
        return left == null ? right : left;
    }
}