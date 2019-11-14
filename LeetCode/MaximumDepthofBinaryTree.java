package exercise.LeetCode;

public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        if (root.left==null&&root.right==null)
            return 1;
        int leftDepth=maxDepth(root.left);
        int rigthDepth=maxDepth(root.right);
        return leftDepth>rigthDepth?leftDepth+1:rigthDepth+1;

    }
}
