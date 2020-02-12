package exercise.SwordRefersToOffer;

import exercise.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Print {

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>>res=new ArrayList<>();
        if (pRoot==null){
            return res;
        }

        Deque<TreeNode>queue=new LinkedList<>();
        int curNum,nextNum;
        curNum=nextNum=0;
        queue.offer(pRoot);
        curNum=1;
        ArrayList<Integer>list=new ArrayList<>();
        while (!queue.isEmpty()){
            curNum--;
            TreeNode temp=queue.poll();
            list.add(temp.val);
            if (temp.left!=null) {
                queue.offer(temp.left);
                nextNum++;
            }
            if (temp.right!=null) {
                queue.offer(temp.right);
                nextNum++;
            }
            if (curNum==0){
                curNum=nextNum;
                nextNum=0;
                res.add(list);
                list=new ArrayList<>();
            }
        }
        return res;
    }
}
