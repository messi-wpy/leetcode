package exercise.SwordRefersToOffer;

import exercise.LeetCode.TreeNode;

public class ConstructBinaryTree {

    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        if (pre.length==0||in.length==0)
            return null;
        return recursionBuild(pre,in,0,pre.length-1,0,in.length-1);

    }

    public TreeNode recursionBuild(int[] pre,int []in,int preStart,int preEnd,int inStart,int inEnd){
        //前序遍历第一个即为根节点
        TreeNode root=new TreeNode(0);
        root.val=pre[preStart];

        //排除不中序遍历和先序遍历不符合的情况
        if (preStart==preEnd){
            if (inStart==inEnd&&pre[preStart]==in[inStart]){
                return root;
            }else
                throw new IllegalArgumentException();
        }

        //中序遍历寻找根节点：
        int rootIndex=inStart;
        while (rootIndex<=inEnd&&in[rootIndex]!=root.val){
            rootIndex++;
        }

        //排除先序与中序不符合的情况
        if (rootIndex==inEnd){
            if (in[rootIndex]!=root.val){
                throw  new IllegalArgumentException();
            }
        }

        int leftLength= rootIndex-inStart;
        int leftEnd=preStart+leftLength;
        if (leftLength>0){
            root.left=recursionBuild(pre,in,preStart+1,leftEnd,inStart,rootIndex-1);
        }
        if (leftLength<preEnd-preStart){
            root.right=recursionBuild(pre,in,leftEnd+1,preEnd,rootIndex+1,inEnd);
        }
        return root;
    }
}
