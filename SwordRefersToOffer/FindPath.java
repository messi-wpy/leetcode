package exercise.SwordRefersToOffer;

import exercise.LeetCode.TreeNode;

import java.util.ArrayList;

public class FindPath {
    private ArrayList<ArrayList<Integer>>res=new ArrayList<>();
    private ArrayList<Integer>path=new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root==null)
            return res;
        path.add(root.val);
        target-=root.val;
        if (target==0&&root.left==null&&root.right==null){
            res.add(new ArrayList<>(path));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);

        path.remove(path.size()-1);
        return res;
    }
}
