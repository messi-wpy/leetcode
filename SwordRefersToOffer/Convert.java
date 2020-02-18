package exercise.SwordRefersToOffer;

import exercise.LeetCode.TreeNode;

public class Convert {

    TreeNode pre=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree==null)
            return null;
        convertHelper(pRootOfTree);

        TreeNode pnode=pRootOfTree;
        while (pnode.left!=null){
            pnode=pnode.left;
        }
        return pnode;
    }


    public void convertHelper(TreeNode cur){
        if (cur==null)
            return;

        convertHelper(cur.left);

        cur.left=pre;
        if (pre!=null)
            pre.right=cur;
        pre=cur;

        convertHelper(cur.right);

    }
}
