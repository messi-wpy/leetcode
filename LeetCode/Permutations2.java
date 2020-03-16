package exercise.LeetCode;

import java.util.*;

public class Permutations2 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        permuteHelper(nums,0,res);
        return res;
    }

    public void permuteHelper(int[]nums,int start,List<List<Integer>>res){
        if (start==nums.length){
            List<Integer> array=new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                array.add(nums[i]);
            }
            res.add(array);
            return;
        }

        HashSet<Integer> set=new HashSet<>();
        for (int i = start; i <nums.length ; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                swap(nums, i, start);
                permuteHelper(nums, start + 1, res);
                swap(nums, i, start);
            }
        }

    }

    public void swap(int[]nums,int a,int b ){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
