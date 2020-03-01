package exercise.LeetCode;

/**
 *
 * 接雨水
 * 第二遍
 * dp
 */
public class TrappingRainWater2 {

    public int trap(int[] height) {
        int left[]=new int[height.length];
        int right[]=new int[height.length];


        for (int i = 1; i < height.length; i++) {
            left[i]=Math.max(height[i-1],left[i-1]);
        }
        for (int i = height.length-2; i >=0 ; i--) {
            right[i]=Math.max(height[i+1],right[i+1]);
        }

        int res=0;
        for (int i = 1; i <height.length ; i++) {
            int deep=Math.max(left[i],right[i]);
            deep=deep-height[i];
            res+=deep>0?deep:0;
        }
        return res;
    }


}
