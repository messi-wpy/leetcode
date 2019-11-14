package exercise.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(1);
        List<TreeNode> l=new ArrayList<>();
    l.add(null);
        ValidateBinarySearchTree v=new ValidateBinarySearchTree();
        System.out.println(v.inOrderCheck(root,l));
    }
    public   boolean isValidBST(TreeNode root) {
        if (root==null)return true;
        if (root.left!=null){
            if (root.left.val>=root.val)
                return false;
        }
        if (root.right!=null){
            if (root.right.val<=root.val)
                return false;
        }
        return check(root.left,root.val,true)&&check(root.right,root.val,false);

    }

    public boolean check(TreeNode root,int r,boolean isLeft){
        if (root==null)return true;
        boolean left=true,right=true;
        if (root.left!=null) {
            if (!isLeft)
                if (root.left.val<=r)
                    left=false;
           else if (root.val <= root.left.val)
                left = false;
            else
                left=check(root.left,r,isLeft);
        }
        if (root.right!=null){
            if (isLeft)
                if (root.right.val>=r)
                    right=false;
            else if (root.val >= root.right.val)
                right= false;
            else
                right=check(root.right,r,isLeft);
        }
        return left&&right;

    }

    public boolean isBST(TreeNode node,Integer lower_limit,Integer upper_limit){
        if (lower_limit!=null&&node.val<=lower_limit)
            return false;
        if (upper_limit!=null&&node.val>=upper_limit)
            return false;

        boolean left= node.left == null || isBST(node.left, lower_limit, node.val);
        if (left){
            boolean right=node.right ==null||isBST(node.right,node.val,upper_limit);
            return right;
        }
        else
            return false;


    }

    public Boolean booleanisValidBST2(TreeNode treeNode){
        if (treeNode==null)
            return true;
        return isBST(treeNode,null,null);

    }

    public boolean inOrderCheck(TreeNode root, List<TreeNode> pre){
        if (root==null)return true;
        boolean isBTS=inOrderCheck(root.left,pre);
        if (!isBTS)return false;
        if (pre.get(0)!=null) {
            if (root.val <= pre.get(0).val) return false;

        }
        pre.set(0,root);
        return inOrderCheck(root.right,pre);

    }

}
