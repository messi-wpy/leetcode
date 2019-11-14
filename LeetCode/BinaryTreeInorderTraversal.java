package exercise.LeetCode;

import java.util.*;

public class BinaryTreeInorderTraversal {
    public static void main(String []args){
        TreeNode t=new TreeNode(1);
        TreeNode root=t;
        t.left=null;
        t.right=new TreeNode(2);
        t=t.right;
        t.left=new TreeNode(3);
        t.right=null;
        List<Integer>list=inorderTraversal(root);
        list.forEach(System.out::print);

    }
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
  }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        if (root==null)return list;
        HashSet<TreeNode>shouldTrave=new HashSet<>();

        Deque<TreeNode>stack=new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp=stack.pop();
            if (shouldTrave.contains(temp)){
                shouldTrave.remove(temp);
                list.add(temp.val);
            }else {
                if (temp.right!=null)
                    stack.push(temp.right);
                shouldTrave.add(temp);
                stack.push(temp);
                if (temp.left!=null)
                    stack.push(temp.left);
            }

        }
        return list;
    }

}
