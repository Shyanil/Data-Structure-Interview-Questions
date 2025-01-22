import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class PathSumCounter {
    public int countPaths(TreeNode root, int sum) {
        List<Integer> paths = new ArrayList<>();
        return countPathsH(root , sum , paths);
    }

    private int countPathsH(TreeNode root, int sum, List<Integer> paths) {
        if(root == null){
            return 0;
        }
        paths.add(root.val);
        int count = 0;
        int stepSum = 0;
        ListIterator<Integer> listIterator = paths.listIterator(paths.size());
        while (listIterator.hasPrevious()){
            stepSum += listIterator.previous();
            if(stepSum == sum){
                count++;
            }
        }
        count += countPathsH(root.left , sum , paths) + countPathsH(root.right , sum , paths);
        paths.removeLast();
        return  count;

    }
}
