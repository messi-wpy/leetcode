package exercise.SwordRefersToOffer;

import com.sun.source.tree.Tree;
import exercise.LeetCode.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class PrintFromTopToBottom {


    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root==null)return new ArrayList<>();
        Deque<TreeNode>queue=new LinkedList<>();
        ArrayList<Integer>res=new ArrayList<>();

        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode tree=queue.poll();
            if (tree!=null){
                res.add(tree.val);
                queue.offer(tree.left);
                queue.offer(tree.right);
            }

        }

        return res;
    }
}
