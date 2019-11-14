package exercise.LeetCode;

public class TrappingRainWater {
    public int trap(int[] height) {
        if (height==null||height.length==0)return 0;
        int left=0,right=height.length-1;
        int leftMax=0,rightMax=0;
        int res=0;
        while (left<right){
            if (height[left]<height[right]){
                leftMax=Math.max(height[left],leftMax);
                res+=leftMax-height[left];
                left++;


            }else {
                rightMax=Math.max(height[right],rightMax);
                res+=rightMax-height[right];
                right--;

            }


        }
        return res;
    }
}
