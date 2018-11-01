
//贪心算法
public class JumpGame  {
    public static void  main(String[]args){
        int a[]={1,2,3};
        System.out.println(canJump(a));
    }
    public static boolean canJump(int[] nums) {
        int max=nums[0];
        for (int i=1;i<nums.length&&i<=max;i++){
            if (i+nums[i]>max)max=i+nums[i];
        }
        return max >= nums.length-1;
    }
}
