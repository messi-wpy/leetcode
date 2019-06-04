package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx=m+n-1, idx1=m-1, idx2=n-1;

        while(idx1>=0 || idx2>=0) {
            int val1 = idx1>=0?nums1[idx1]:Integer.MIN_VALUE;
            int val2 = idx2>=0?nums2[idx2]:Integer.MIN_VALUE;
            if(val1>val2) {
                nums1[idx] = val1;
                idx--;idx1--;
            }
            else{
                nums1[idx] = val2;
                idx--;idx2--;
            }
        }

    }
}
