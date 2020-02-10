package exercise.SwordRefersToOffer;

import exercise.LeetCode.TreeNode;


/**
 * 《剑指offer》
 * 27 二叉树镜像
 */
public class Mirror {

    public void Mirror(TreeNode root) {
        mirrorHelp(root);
    }

    public TreeNode mirrorHelp(TreeNode root){
        if (root==null)
            return null;
        TreeNode temp=root.left;
        root.left=mirrorHelp(root.right);
        root.right=mirrorHelp(temp);

        return root;
    }
}
