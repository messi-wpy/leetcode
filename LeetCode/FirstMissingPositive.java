package exercise.LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class FirstMissingPositive {
    public static void main(String []args){
        int []test={4,8,9};
        System.out.print(Arrays.toString(plusOne(test)));

    }
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        int res=1;
        for (int a:nums) {
            if (a<=0)continue;
            if (a>max)
                max=a;
            set.add(a);
        }
        while (set.contains(res)){
            res++;
        }
        return res;



    }
    public static int[] plusOne(int[] digits) {
        int n=digits.length;
        for (int i=n-1;i>=0;i--){
            if (digits[i]<9){
                digits[i]++;
                return digits;
            }
            else
                digits[i]=0;
        }
        int[]newInt=new int[n+1];
        newInt[0]=1;
        return newInt;
    }
}
