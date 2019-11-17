package exercise.LeetCode;

import java.util.Stack;

public class PathSum {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null)return false;
        sum-=root.val;
        if (root.left==null&&root.right==null)
            return sum==0;
        return hasPathSum(root.left,sum)||hasPathSum(root.right,sum);

    }

}