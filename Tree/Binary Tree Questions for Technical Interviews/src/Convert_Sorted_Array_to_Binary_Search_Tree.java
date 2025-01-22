public class Convert_Sorted_Array_to_Binary_Search_Tree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTH(nums , 0 , nums.length - 1);
    }

    public static
    TreeNode sortedArrayToBSTH(int nums[] , int start , int end){
        if(start > end){
            return null;
        }

        int mid = start + (end - start)/2;

        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBSTH(nums , start , mid - 1);
        root.right = sortedArrayToBSTH(nums , mid + 1 , end);

        return root;
    }
}
