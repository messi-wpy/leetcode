package exercise.LeetCode;

import java.util.*;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        if (nums==null||nums.length==0)return new ArrayList<>();
        List<List<Integer>>lists=new ArrayList<>();
        backtracking(lists,nums,new ArrayList<>());
        return lists;
    }

    public  void backtracking(List<List<Integer>>res, int []nums, List<Integer> list){
        if (list.size()==nums.length){
            List<Integer> temp=new ArrayList<>(list);
            res.add(temp);
            return;
        }
        for (int i = 0; i <nums.length ; i++) {
            if (list.contains(nums[i]))continue;
            list.add(nums[i]);
            backtracking(res,nums,list);
            list.remove(list.size()-1);

        }

    }

    /**
     * 前一种方法由于要判断list.contains()所以时间复杂度增加 n*n!
     * 要思考另一种方法，避免这个，
     * 利用交换避免重复，而不是一个一个加
     *
     */
    public void backtracking2(List<List<Integer>>res,int []nums,int start){
        if (start==nums.length){
            List<Integer>list=new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            res.add(list);
            return;
        }

        for (int i = start; i <nums.length ; i++) {
            swap(nums,i,start);
            backtracking2(res,nums,start+1);
            swap(nums,i,start);
        }




    }

    public void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;


    }
}
