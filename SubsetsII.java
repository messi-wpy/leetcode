package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubsetsII {
    public static void main(String[] args) {
        SubsetsII s=new SubsetsII();
        int[]nums={4,4,4,1,4};
        System.out.println(s.subsetsWithDup(nums));
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums.length==0)return new ArrayList<>();
        List<List<Integer>>res=new ArrayList<>();
        backTracking(res,new ArrayList<>(),nums,0,0);
        return res;
    }

    public void backTracking(List<List<Integer>>res,List<Integer>list,int []nums,int start,int last){
        res.add(new ArrayList<>(list));
        if (start>=nums.length)
            return;
        list.add(nums[start]);
        last=nums[start];
        backTracking(res,list,nums,start+1,last);
        list.remove(list.size()-1);
        for (int i = start+1; i <nums.length ; i++) {
            if (last==nums[i])
                continue;
            list.add(nums[i]);
            last=nums[i];
            backTracking(res, list, nums, i+1,last);
            list.remove(list.size()-1);

        }

    }

}
