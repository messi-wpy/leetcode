package exercise.SwordRefersToOffer;

import exercise.LeetCode.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class PrintZHI {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Deque<TreeNode>stack1=new ArrayDeque<>();
        Deque<TreeNode>stack2=new ArrayDeque<>();

        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        if (pRoot==null){
            return res;
        }
        stack1.push(pRoot);
        ArrayList<Integer>list;
        while (!stack1.isEmpty()||!stack2.isEmpty()){
            TreeNode temp;
            list=new ArrayList<>();
            if (!stack1.isEmpty()){
                while (!stack1.isEmpty()){
                    temp=stack1.pop();
                    list.add(temp.val);
                    if (temp.left!=null)
                        stack2.push(temp.left);
                    if (temp.right!=null)
                        stack2.push(temp.right);
                }
                res.add(list);

            }else {
                while (!stack2.isEmpty()){
                    temp=stack2.pop();
                    list.add(temp.val);
                    if (temp.right!=null)
                        stack1.push(temp.right);
                    if (temp.left!=null)
                        stack1.push(temp.left);

                }
                res.add(list);
            }
        }

        return res;
    }
}
