package leetcode;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n<=0)return 0;
        return climb(n);
    }

    public int climb(int remain){
        if (remain ==0)
            return 1;
        if (remain<0)
            return 0;

        int one=climb(remain-1);
        int two=climb(remain-2);

        return one+two;
    }

    //dp


}
