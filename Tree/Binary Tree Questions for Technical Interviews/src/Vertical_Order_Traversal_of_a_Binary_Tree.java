import java.util.*;

public class Vertical_Order_Traversal_of_a_Binary_Tree {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ANS = new ArrayList<>();
        if (root == null) return ANS;
        int col = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        Queue<Map.Entry<TreeNode, Integer>> entryQueue = new ArrayDeque<>();
        Map<Integer, ArrayList<int[]>> listMap = new HashMap<>();
        entryQueue.add(new AbstractMap.SimpleEntry<>(root, col));
        int row = 0;
        while (!entryQueue.isEmpty()){
            int size = entryQueue.size();
            for (int i = 0; i < size; i++) {
                Map.Entry<TreeNode , Integer> removedE = entryQueue.poll();
                TreeNode currNode = removedE.getKey();
                col = removedE.getValue();
                if (currNode != null) {
                    if (!listMap.containsKey(col)) {
                        listMap.put(col, new ArrayList<int[]>());
                    }

                    listMap.get(col).add(new int[]{row, currNode.val});

                    min = Math.min(min, col);
                    max = Math.max(max, col);

                    entryQueue.add(new AbstractMap.SimpleEntry<>(currNode.left, col - 1));
                    entryQueue.add(new AbstractMap.SimpleEntry<>(currNode.right, col + 1));
                }
            }
            row++;
        }

        for(int i=min ; i<=max;i++){
            ArrayList<int[]> collist = listMap.get(i);
            collist.sort((a,b)-> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

            ArrayList<Integer> sublist =  new ArrayList<>();
            for (int[] cols : collist){
                sublist.add(cols[1]);
            }

            ANS.add(sublist);
        }
        return ANS;

    }
    }

