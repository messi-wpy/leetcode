package exercise.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Combinations2 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>res=new ArrayList<>();
        if (n<k)
            return res;
        combineHelp(n,k,1,new ArrayList<>(),res);
        return res;
    }

    public void combineHelp(int n,int k,int start,List<Integer>cur,List<List<Integer>>res){
        if (cur.size()==k){
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = start; i <=n ; i++) {
            cur.add(i);
            combineHelp(n, k, i+1, cur, res);
            cur.remove(cur.size()-1);
        }


    }
}
