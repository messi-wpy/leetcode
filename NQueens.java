package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>>res=new ArrayList<>();
        int queens[]=new int[n];
        for (int i = 0; i <queens.length ; i++) {
            queens[i]=-1;
        }
        int k=0;
        while (k>=0){

            queens[k]++;
            while (queens[k]<n&&isConflict(k,queens)){
                queens[k]++;
            }
            if (queens[k]<n&&k==n-1){
                List<String>temp=new ArrayList<>();
                for (int i = 0; i <n ; i++) {
                    StringBuilder sb=new StringBuilder();
                    for (int j = 0; j <n ; j++) {
                        if (j==queens[i])
                            sb.append('Q');
                        else
                            sb.append('.');
                    }
                    temp.add(sb.toString());
                }
                res.add(temp);
            }
            else if (queens[k]<n&&k<n-1){
                k++;
            }
            else {
                queens[k] = -1;
                k--;
            }


        }
        return res;
    }

    public boolean isConflict(int k,int [] queens){
        for (int i = 0; i <k ; i++) {
            if (queens[i]==queens[k]||Math.abs(i-k)==Math.abs(queens[i]-queens[k]))
                return true;

        }
        return false;

    }
}
