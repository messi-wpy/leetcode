package exercise.LeetCode;

public class MinimumDepthofBinaryTree {

    /**
     *注意是从root 到一个叶子节点，不能直接就是root节点没有叶子节点，所以
     * 如果l或r等于零则不能直接上0
     */
    public int minDepth(TreeNode root) {
        if (root==null)return 0;
        int l=minDepth(root.left);
        int r=minDepth(root.right);
        return (l==0||r==0)?l+r+1:Math.min(l,r)+1;
    }

}
