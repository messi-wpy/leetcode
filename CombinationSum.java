import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static void main(String[]args){
        CombinationSum c=new CombinationSum();
        int []num ={2,3,5};
        System.out.print(c.combinationSum(num,8));

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        rfind(lists,candidates,target,temp,0);
        return lists;
    }

    public void rfind(List<List<Integer>>result,int [] nums,int target,List<Integer>list,int start){
        if (target <0)
            return;
        if (target==0){
            result.add(new ArrayList<>(list));
        }
        for (int i=start;i<nums.length&&target>=nums[i];i++){
            list.add(nums[i]);
            rfind(result,nums,target-nums[i],list,i);
            list.remove(list.size()-1);

        }

    }
}
