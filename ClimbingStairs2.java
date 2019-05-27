package leetcode;

public class ClimbingStairs2 {
    public int climbStairs(int n) {
        int []dp=new int[n>=2?n+1:3];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        if (n<=2)
            return dp[n];
        for (int i = 3; i <=n ; i++) {
            dp[i]=dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
}
