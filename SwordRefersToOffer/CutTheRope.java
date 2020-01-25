package exercise.SwordRefersToOffer;


/**
 * 剑指offer 14 剪绳子
 * 动态规划
 * 1. 求最优解（最大值最小值）
 * 2. 能分解为若干子问题,整个问题的最优解依赖于各个子问题最优解
 * 3. 大问题分解的小问题，小问题之间有重叠的更小子问题
 *
 */
public class CutTheRope {

    public int cutRope(int target) {
        if(target<2)
            return 0;
        if (target==2)
            return 1;
        if (target==3)
            return 2;

        int []dp=new int[target+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;


        for (int i = 4; i <=target ; i++) {
            int temp=0;
            for (int j = 1; j <=i/2 ; j++) {
                int mul=dp[j]*dp[i-j];
                if (mul>temp)
                    temp=mul;
            }
            dp[i]=temp;
        }

        return dp[target];
    }
}
