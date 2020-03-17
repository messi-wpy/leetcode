package exercise.LeetCode;

public class MinDiffINBST {
    TreeNode pre;
    int res=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        help(root);
        return res;
    }

    public void help(TreeNode root){
        if(root==null)return;
        help(root.left);
        if(pre!=null){
            res=Math.min(root.val-pre.val,res);
        }
        pre=root;

        help(root.right);


    }
}
