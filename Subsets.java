package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        Subsets s=new Subsets();
        List<List<Integer>>res;
        int []nums={1,2,3};
        res=s.subsets(nums);
        for (int i = 0; i <res.size() ; i++) {
            System.out.println(res.get(i));
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        backtracking(new ArrayList<>(),res,nums,0);
        return res;
    }

    public void backtracking(List<Integer>list,List<List<Integer>>res,int []nums,int start){
        res.add(new ArrayList<>(list));
        for (int i = start; i <nums.length ; i++) {

            list.add(nums[i]);
            backtracking(list, res, nums, i+1);
            list.remove(list.size()-1);
        }

    }
}
