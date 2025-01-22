import java.util.*;
public class zigzag {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }

        List<List<Integer>> outer = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        boolean isReverse = false;

        while (!deque.isEmpty()){
            List<Integer> inner = new ArrayList<>();
            int levelSize = deque.size();
            for (int i = 0; i < levelSize; i++) {
                if (!isReverse){
                    TreeNode treeNode = deque.removeFirst();
                    inner.add(treeNode.val);

                    if (treeNode.left != null){
                        deque.addLast(treeNode.left);
                    }

                    if (treeNode.right != null){
                        deque.addLast(treeNode.right);
                    }
                }
                else {
                    TreeNode treeNode = deque.removeLast();
                    inner.add(treeNode.val);

                    if (treeNode.right != null){
                        deque.addFirst(treeNode.right);
                    }

                    if (treeNode.left != null){
                        deque.addFirst(treeNode.left);
                    }

                }

            }
            isReverse = !isReverse;
            outer.add(inner);
        }
        return  outer;

    }
}
