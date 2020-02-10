package exercise.SwordRefersToOffer;

import exercise.LeetCode.TreeNode;

public class IsSymmetrical {

    boolean isSymmetrical(TreeNode pRoot) {
        return isSymmetrical(pRoot,pRoot);

    }
    boolean isSymmetrical(TreeNode root1,TreeNode root2){
        if (root1==null&&root2==null){
            return true;
        }
        if (root1==null||root2==null){
            return false;
        }

        if (root1.val!=root2.val){
            return false;
        }
        return isSymmetrical(root1.left,root2.right)&&
                isSymmetrical(root1.right,root2.left);

    }
}


