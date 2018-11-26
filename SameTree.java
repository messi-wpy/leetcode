import java.util.Deque;
import java.util.LinkedList;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null&&q==null)return true;
        if (p==null||q==null)return false;
        Deque<TreeNode>deque=new LinkedList<>();
        deque.addLast(p);
        deque.addLast(q);
        while (!deque.isEmpty()){
            TreeNode first=deque.pollFirst();
            TreeNode second=deque.pollFirst();
            if (first==null)continue;
            if (first.val!=second.val)
                return false;
            if (first.left!=null&&second.left!=null||
                    first.left==null&&second.left==null){
                deque.addLast(first.left);
                deque.addLast(second.left);
            }else
                return false;
            if (first.right!=null&&second.right!=null||
                    first.right==null&&second.right==null){
                deque.addLast(first.right);
                deque.addLast(second.right);
            }else
                return false;

        }
        return true;

    }



    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
