package exercise.LeetCode;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int[] a={2,3,-2,4};
        maxProduct(a);
    }
    public  static int maxProduct(int[] nums) {
        int maxProduct=1;
        int minProduct=1;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <nums.length ; i++) {
            int temp = maxProduct;
            maxProduct=Math.max(Math.max(maxProduct*nums[i],minProduct*nums[i]),nums[i]);
            minProduct=Math.min(Math.min(minProduct*nums[i],temp*nums[i]),nums[i]);
            if (maxProduct>max){
                max=maxProduct;
            }
        }
        return max;

    }
}
