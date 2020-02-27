package exercise.SwordRefersToOffer;

import com.sun.source.tree.Tree;
import exercise.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BalancedBT {
    private  boolean isBalanced=true;
    public boolean IsBalanced_Solution(TreeNode root) {
       deepAndBalance(root);
       return isBalanced;


    }
    public int height(TreeNode root){
        if (root==null)
            return 0;
        int h=Math.max(height(root.left),height(root.right))+1;
        return h;

    }

    //后序遍历
    public int deepAndBalance(TreeNode root){
        if (root==null)
            return 0;
        int left=deepAndBalance(root.left);
        int right=deepAndBalance(root.right);

        if (Math.abs(left-right)>1){
            isBalanced=false;
        }

        return Math.max(left,right)+1;

    }

}
