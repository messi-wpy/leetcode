package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        if (k>n)return new ArrayList<>();

        List<List<Integer>>res=new ArrayList<>();
        backtracking(n,k,1,new ArrayList<>(),res);
        return res;
    }

    public void backtracking(int n,int k,int start,List<Integer>list,List<List<Integer>>res){
        if (k==list.size()){
            List<Integer>temp=new ArrayList<>(list);
            res.add(temp);
        }
        for (int i = start; i <=n ; i++) {
            list.add(i);
            backtracking(n,k,i+1,list,res);
            list.remove(list.size()-1);
        }
    }
}
