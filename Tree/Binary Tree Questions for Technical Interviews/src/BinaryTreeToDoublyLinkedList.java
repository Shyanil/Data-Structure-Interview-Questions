public class BinaryTreeToDoublyLinkedList {
    LLNode head;
    LLNode tail;
    public LLNode Convert(TreeNode root){
        if(root == null) return  null;
        helperCon(root);
        return head;
    }

    private void helperCon(TreeNode root) {
      if(root == null) return;
      helperCon(root.left);
      LLNode node = new LLNode(root.val);
      if(head == null){
          head = node;
          tail = node;
      } else {
          tail.next = node;
          node.prev = tail;
          tail = node;
      }

      helperCon(root.right);
    }
}


