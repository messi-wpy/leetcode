package exercise.LeetCode;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int nums[]={1,1};
        nextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void nextPermutation(int[] nums) {
        if (nums.length<=1)return;
        int i;
        int index=nums.length-1;
        int small=nums.length-1;
        for (i = nums.length-1; i >0 ; i--) {
            if (nums[i]>nums[i-1]) {
                index = i;
                break;
            }
        }

        for (int j = small; j >=index ; j--) {
            if (nums[j]>nums[index-1]) {
                small = j;
                break;
            }
        }

        if (i==0){
            for (int j = 0,k=nums.length-1; j <k ; j++,k--) {
                int temp=nums[j];
                nums[j]=nums[k];
                nums[k]=temp;
            }

        }else {
            int temp=nums[index-1];
            nums[index-1]=nums[small];
            nums[small]=temp;
            Arrays.sort(nums,index,nums.length);
        }
    }
}
