import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String []args){
        int []test={4,8,9};
        System.out.print(Arrays.toString(plusOne(test)));

    }
    public  static  int firstMissingPositive(int[] nums) {
        int min=1;
        for (int a:nums
             ) {
            if(a>0&&a<=min&&a!=min-1)
                min++;
        }
        return min;
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
