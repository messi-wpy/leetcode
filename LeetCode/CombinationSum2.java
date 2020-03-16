package exercise.LeetCode;

import java.util.*;

public class CombinationSum2 {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> lists=new ArrayList<>();
        combinationSum(candidates,target,0,new ArrayList<>(),lists);
        return lists;
    }

    public void combinationSum(int[]candidates,int target,int start,List<Integer>road,List<List<Integer>>res){
        if (target<0){
            return;
        }
        else if (target==0){
            res.add(new ArrayList<>(road));
            return;
        }

        HashSet<Integer>set=new HashSet<>();
        for (int i = start; i <candidates.length; i++) {
            if (target<candidates[i]){
                break;
            }
            if (set.contains(candidates[i]))
                continue;
            set.add(candidates[i]);
            road.add(candidates[i]);
            combinationSum(candidates, target-candidates[i], i+1, road, res);
            road.remove(road.size()-1);

        }

    }
}
