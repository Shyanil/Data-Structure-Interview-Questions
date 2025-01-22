import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
public class Average_of_Levels_in_Binary_Tree {
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> doubleList =  new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int levelSize = queue.size();
            double sum = 0.0;
            for (int i = 0; i < levelSize; i++) {
                TreeNode treeNode =  queue.remove();
                sum += treeNode.val;
                if (treeNode.left != null){
                    queue.add(treeNode.left);

                }
                if (treeNode.right != null){
                    queue.add(treeNode.right);

                }
            }

            double avg = sum / levelSize;
            doubleList.add(avg);
        }
        return doubleList;
    }
}
