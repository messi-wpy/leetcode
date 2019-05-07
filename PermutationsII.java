package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PermutationsII {

    public static void main(String[] args) {
        PermutationsII p=new PermutationsII();
        int nums[]={1,1,2};
        List<List<Integer>>lists=p.permuteUnique(nums);
        for (int i = 0; i <lists.size() ; i++) {
            System.out.println(lists.get(i));
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        if(nums==null||nums.length==0)return new ArrayList<>();
        List<List<Integer>>lists=new ArrayList<>();
        dfs(new HashMap<>(),lists,nums,0);
        return lists;
    }

    public void dfs(Map<Integer,Integer>hashmap, List<List<Integer>>res, int []nums, int start){
        if (start>=nums.length){
            List<Integer>list=new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                list.add(nums[i]);
            }
            if (res.contains(list))return;
            res.add(list);
            return;
        }
        for (int i = start; i < nums.length ; i++) {
           if (i!=start&&nums[i]==nums[start]){
                    continue;
            }
            swap(nums,i,start);
            dfs(hashmap,res,nums,start+1);
            swap(nums,i,start);
        }


    }

    public void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;


    }
}
