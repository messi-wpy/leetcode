package leetcode;

import java.util.Arrays;

public class ConstructBinaryTreefromPreorderandInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildHelp(0,0,inorder.length-1,preorder,inorder);
    }

    private TreeNode buildHelp(int preStart,int inStart,int inEnd,int []preorder,int []inorder){
        if (preStart>preorder.length-1||inStart>inEnd)
            return null;
        TreeNode root=new TreeNode(preorder[preStart]);
        int index=0;
        for (int i = inStart; i <inEnd ; i++) {
            if (inorder[i]==preorder[preStart]) {
                index = i;
            }
        }
        root.left=buildHelp(preStart+1,inStart,index-1,preorder,inorder);
        root.right=buildHelp(preStart+index-inStart+1,index+1,inEnd,preorder,inorder);
        return root;
    }
}
