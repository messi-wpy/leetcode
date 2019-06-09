package leetcode;

import java.util.Arrays;
import java.util.List;

public class NQueens {

    public List<List<String>> solveNQueens(int n) {
        int queens[]=new int[n];
        for (int i = 0; i <queens.length ; i++) {
            queens[i]=-1;
        }
        int k=0;
        while (k>=0){

            queens[k]++;
            while ()



        }
    }

    public boolean isConflict(int k,int [] queens){
        for (int i = 0; i <k ; i++) {
            if (queens[i]==queens[k]||Math.abs(i-k)==Math.abs(queens[i]-queens[k]))
                return true;

        }
        return false;

    }
}
