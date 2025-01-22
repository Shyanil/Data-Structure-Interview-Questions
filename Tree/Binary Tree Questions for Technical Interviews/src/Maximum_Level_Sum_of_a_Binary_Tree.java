import java.util.LinkedList;
import java.util.Queue;

public class Maximum_Level_Sum_of_a_Binary_Tree {
    public static int maxLevelSum(TreeNode root) {
      int maxSum = Integer.MIN_VALUE;
      int maxLevel = 0;
      int currLevel = 1;
      Queue<TreeNode> nodeQueue = new LinkedList<>();
      nodeQueue.add(root);
      while (!nodeQueue.isEmpty()){
          int sum = 0;
          int levelSize = nodeQueue.size();
          for (int i = 0; i < levelSize; i++) {
              TreeNode treeNode = nodeQueue.remove();
              sum += treeNode.val;
              if (treeNode.left != null){
                  nodeQueue.add(treeNode.left);
              }

              if (treeNode.right != null){
                  nodeQueue.add(treeNode.right);
              }
          }

          if (sum > maxSum){
              maxSum = sum;
              maxLevel = currLevel;
          }
          currLevel++;

      }
      return maxLevel;
    }
}
