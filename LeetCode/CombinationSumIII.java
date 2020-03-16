package exercise.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
        CombinationSumIII c=new CombinationSumIII();
        c.combinationSum3(7,3);
        System.out.println();

    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> lists=new ArrayList<>();
        combinationSumHelp(k,n,1,new ArrayList<>(),lists);
        return lists;
    }


    public void combinationSumHelp(int k,int n,int start,List<Integer>list,List<List<Integer>>res){
        if (n==0&&k==0){
            res.add(new ArrayList<>(list));

        }else if (n<=0){
            return;
        }
        else {

            for (int i = start; i <=9 ; i++) {
                if (k<i){
                    break;
                }
                list.add(i);
                combinationSumHelp(k-i,n-1,i+1,list,res);
                list.remove(list.size()-1);

            }


        }




    }
}


