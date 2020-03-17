package exercise.LeetCode;

import java.util.Deque;

public class FlattenTree {
    private TreeNode  pre;
    public void flatten(TreeNode root) {
        if(root==null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right=pre;
        root.left=null;
        pre=root;

    }
}
