package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubsetsII {
    public static void main(String[] args) {
        SubsetsII s = new SubsetsII();
        int[] nums = {4, 4, 4, 1, 4};
        System.out.println(s.subsetsWithDup(nums));
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backTracking(res, new ArrayList<>(), nums, 0);
        return res;
    }

    public void backTracking(List<List<Integer>> res, List<Integer> list, int[] nums, int start) {
        res.add(new ArrayList<>(list));

        for (int i = start; i <nums.length ; i++) {
            if (i!=start &&nums[i]==nums[i-1])
                continue;
            list.add(nums[i]);
            backTracking(res,list,nums,i+1);
            list.remove(list.size()-1);
        }
    }

}


