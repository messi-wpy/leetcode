import java.util.Map;

public class BalanceTree {
    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
     }

    public boolean isBalanced(TreeNode root) {
        return balance(root)!=-1;
    }

    public int balance(TreeNode root){
        if (root==null)
            return 0;
        int left=balance(root.left);
        int right=balance(root.right);

        if(left == -1 || right == -1) return -1;

        if (Math.abs(left-right)>1){
            return -1;

        }
        return Math.max(left,right)+1;


    }

}
