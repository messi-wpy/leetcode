package exercise.LeetCode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<>();
        Deque<TreeNode>nodeDeque=new LinkedList<>();
        nodeDeque.add(root);
        while (!nodeDeque.isEmpty()){
            int size=nodeDeque.size();
            List<Integer>list=new ArrayList<>();
            while (size>0){
                TreeNode temp=nodeDeque.poll();
                if (temp==null){
                    size--;
                    continue;
                }
                size--;
                list.add(temp.val);
                nodeDeque.add(temp.left);
                nodeDeque.add(temp.right);

            }
            if (list.size()!=0)
                res.add(list);

        }
        return res;
    }
}
