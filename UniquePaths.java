package leetcode;

public class UniquePaths {

    public static void main(String[] args) {
        UniquePaths s=new UniquePaths();
        System.out.println(s.uniquePaths(3,2));
    }



    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m][n];

        for (int i = 0; i <m ; i++) {
            dp[i][0]=1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i]=1;
        }

        for (int i = 1; i <m ; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }

        return dp[m-1][n-1];


    }
    //递归，超时
    public int  recursion(int m,int n,int curM,int curN){
        if (curM==m&&curN==n){
            return 1;
        }
        if (curM>m||curN>n) {
            return 0;
        }

        return recursion(m,n,curM+1,curN)+recursion(m,n,curM,curN+1);


    }
}
