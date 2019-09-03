package leetcode;

import java.util.ArrayList;
import java.util.List;

public class UniqueBinarySearchTrees2 {

    public List<TreeNode> generateTrees(int n) {
        if (n<=0) return new ArrayList<>();
        return generateSubTree(1,n);
    }

    public List<TreeNode>generateSubTree(int start,int end){
        List<TreeNode>list=new ArrayList<>();
        if (start>end){
            list.add(null);
            return list;
        }

        for (int i = start; i <=end ; i++) {
            for (TreeNode left:generateSubTree(start,i-1))
                for (TreeNode right:generateSubTree(i+1,end)){
                    TreeNode root=new TreeNode(i);
                    root.left=left;
                    root.right=right;
                    list.add(root);
                }
        }
        return list;
    }
}
