package exercise.LeetCode;

public class Maximumsubordersum {

    public int maxSubArray(int[] nums) {
        int []dp=new int[nums.length];
        int res=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                dp[i]=nums[i];
                res=nums[i];
            } else{
                dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
                if(dp[i]>res){
                    res=dp[i];
                }
            }
        }
        return res;

    }
}
