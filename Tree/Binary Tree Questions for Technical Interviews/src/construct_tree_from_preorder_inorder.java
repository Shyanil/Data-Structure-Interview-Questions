/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
   public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
         map.put(inorder[i] , i);
        }

        return  buildTreeH(preorder , inorder , 0 , preorder.length - 1 , map, new int[]{0});
    }

    private TreeNode buildTreeH(int[] preorder, int[] inorder, int left, int  right, HashMap<Integer , Integer> map , int[] index) {
        if(left > right){
            return null;
        }

        int current = preorder[index[0]];
        index[0]++;

        TreeNode treeNode = new TreeNode(current);
        int inorderIndex = map.get(current);
        treeNode.left = buildTreeH(preorder , inorder ,  left,   inorderIndex - 1  , map , index);
        treeNode.right = buildTreeH(preorder , inorder , inorderIndex + 1 , right , map , index);
        return  treeNode;
    }
}