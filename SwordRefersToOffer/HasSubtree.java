package exercise.SwordRefersToOffer;

import exercise.LeetCode.TreeNode;

public class HasSubtree {


    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean res=false;
        if (root1==null)
            return false;
        if (root2==null)
            return false;
        if (root1.val==root2.val){
            res=isSameTree(root1,root2);
            if (!res)
                res=HasSubtree(root1.left,root2);
            if (!res)
                res=HasSubtree(root1.right,root2);
        }
        return res;
    }


    public boolean isSameTree(TreeNode root1,TreeNode root2){
        if (root2==null)
            return true;
        if (root1==null)
            return false;

        if (root1.val==root2.val){
            return isSameTree(root1.left,root2.left)&&isSameTree(root1.right,root2.right);
        }else
            return false;


    }
}
