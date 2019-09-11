package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(-2);
        root.right=new TreeNode(-3);
        PathSumII p=new PathSumII();
        p.pathSum(root,-5);
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root==null)return new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        firstOder(root,0,sum,res,new ArrayList<>());
        return res;
    }

    public void firstOder(TreeNode root,int now,int sum,List<List<Integer>>res,List<Integer>nums){
        now+=root.val;
        nums.add(root.val);
        if (root.left==null&&root.right==null&&now==sum){
            res.add(new ArrayList<>(nums));
            return;
        }

        if (root.left!=null){
            firstOder(root.left,now,sum,res,nums);
            nums.remove(nums.size()-1);
        }
        if (root.right!=null){
            firstOder(root.right,now,sum,res,nums);
            nums.remove(nums.size()-1);
        }

    }
}
