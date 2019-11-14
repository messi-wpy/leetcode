package exercise.LeetCode;

import java.util.Arrays;

public class NQueensII {

    public static void main(String[] args) {
        NQueensII q=new NQueensII();
        q.totalNQueens(4);
    }

    public int totalNQueens(int n) {
        int queue[]=new int[n];
        Arrays.fill(queue,-1);
        int res=0;
        int k=0;
        res=dfs(queue,n,0);
        return res;
    }

    public int dfs(int []queuen,int n,int k){
        if (k>=n){
            return 1;
        }
        int res=0;
        for (int i = 0; i <n ; i++) {
            queuen[k]=i;
            if (!place(queuen,k)){
               res+=  dfs(queuen,n,k+1);
            }
        }
        return res;
    }
    public boolean place(int [] queuen,int k){
        for (int i = 0; i <k ; i++) {
            if (queuen[i]==queuen[k]||Math.abs(k-i)==Math.abs(queuen[k]-queuen[i]))
                return true;
        }
        return false;
    }
}
