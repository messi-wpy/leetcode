package exercise.LeetCode;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        Deque<TreeNode>stack1=new LinkedList<>();
        Deque<TreeNode>stack2=new LinkedList<>();

        stack1.add(root);
        while (!stack1.isEmpty()||!stack2.isEmpty()){
            List<Integer>list=new ArrayList<>();
            if (!stack1.isEmpty()){
                while (!stack1.isEmpty()){
                    TreeNode temp=stack1.pollLast();
                    if (temp!=null){
                        list.add(temp.val);
                        if (temp.left!=null)
                            stack2.add(temp.left);
                        if (temp.right!=null)
                            stack2.add(temp.right);

                    }

                }

            }else {
                while (!stack2.isEmpty()){
                    TreeNode temp=stack2.pollLast();
                    if (temp!=null){
                        list.add(temp.val);
                        if (temp.right!=null)
                            stack1.add(temp.right);
                        if (temp.left!=null)
                            stack1.add(temp.left);

                    }

                }


            }
            if(list.size()!=0)
                res.add(list);
        }


        return res;
    }
}
