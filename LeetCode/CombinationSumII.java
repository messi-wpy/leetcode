package exercise.LeetCode;

import java.util.*;

public class CombinationSumII {

    public static void main(String[] args) {
        int [] array={10,1,2,7,6,1,5};
        List<List<Integer>>lists;
        lists=combinationSum2(array,8);
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i));
        }
    }
    public  static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        if (candidates==null||candidates.length==0)return  res;
        Arrays.sort(candidates);
        dfs(res,new ArrayList<>(),candidates,target,0);
        return res;

    }

    public static void dfs(List<List<Integer>>lists,List<Integer>list,int[] candidates, int target,int start) {
        if (target<0)return;
        if (target==0) {
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <candidates.length ; i++) {
            if (i!=start&&candidates[i]==candidates[i-1])continue;
            list.add(candidates[i]);
            dfs(lists,list,candidates,target-candidates[i],i+1);
            list.remove(list.size()-1);
        }


    }
    public static List<List<Integer>> combinationSum3(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> lists=new ArrayList<>();
        Deque<Integer> stack=new LinkedList<>();
        for (int i = 0; i <candidates.length ; i++) {

            int sum=candidates[i];
            int index=i+1;
            int last=i;
            stack.push(candidates[i]);
            while (!stack.isEmpty()){
                if (sum==target){
                    lists.add(new ArrayList<>(stack));

                    stack.pop();
                    index=last+1;
                    sum=0;
                    continue;
                }
                else if (sum<target){
                    if (index < candidates.length) {
                        stack.push(candidates[index]);
                        sum+=candidates[index];
                        last=index;
                        index++;
                    }
                    else
                        stack.pop();
                }
                else{
                    stack.pop();

                }


            }
        }
        return lists;
    }
}
