import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Leetcode1 {
    public static void main(String[] orgs) {
        Leetcode1 test=new Leetcode1();
        int []a=new int[]{-10,-1,-18,-19};
        System.out.println(Arrays.toString(test.toSum(a,-19)));
    }


    public  int[] toSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int sum;
        Num []num=new Num[nums.length];
        for (int i=0;i<nums.length;i++){
            num[i]=new Num(nums[i],i);

        }
        Arrays.sort(num);
        sum=num[left].num+num[right].num;
        while (sum!=target){
            if (sum>target)
                right--;
            if(sum<target)
                left++;
            sum=num[left].num+num[right].num;
        }
        int []re=new int[2];
        re[0]=num[left].order;
        re[1]=num[right].order;
        return re;
    }
    private static class Num implements Comparable<Num>{

        private int num;
        private int order;

        public Num(int num,int order){
            this.num=num;
            this.order=order;
        }
        @Override
        public int compareTo(Num o) {
            return this.num-o.num;
        }
    }
}