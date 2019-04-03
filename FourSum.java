package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {

        int nums[]={1,0,-1,0,-2,2};

        System.out.println(fourSum(nums,0));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>>lists=new ArrayList<>();
        if (nums.length<4)return lists;

        Arrays.sort(nums);
        for (int i = 0; i <nums.length-3 ; i++) {
            if (i>0&&nums[i]==nums[i-1])continue;
            for (int j=i+1;j<nums.length-2;j++){
                if (j>i+1&&nums[j]==nums[j-1])continue;
                int lo=j+1,hi=nums.length-1;
                while (lo<hi){
                    int sum=nums[lo]+nums[hi]+nums[i]+nums[j];
                    if (sum==target){
                        lists.add(Arrays.asList(nums[lo],nums[hi],nums[i],nums[j]));
                        while (lo<hi-1&&nums[lo]==nums[lo+1])lo++;
                        while (hi>lo+1&&nums[hi]==nums[hi-1])hi--;
                        lo++;
                        hi--;
                    }else if (sum<target){
                        lo++;
                    }else
                        hi--;

                }

            }

        }
        return lists;
    }
}
