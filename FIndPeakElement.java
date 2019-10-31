package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class FIndPeakElement {

    public int findPeakElement(int[] nums) {
        if (nums.length==1)return  0;
        int lastMax=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if (nums[i]>lastMax)
                lastMax=nums[i];
            else
                return i-1;
        }
        return nums.length-1;
    }

    public int binarySearch(int []nums){
        if (nums.length==1)return 0;
        int left=0,right=nums.length-1;
        while (left<right){
            int mid=left+(right-left)/2;
            if (nums[mid]<nums[mid+1])left=right+1;
            else
                right=mid;
        }
        return right;

    }
}
