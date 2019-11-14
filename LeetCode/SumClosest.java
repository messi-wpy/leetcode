package exercise.LeetCode;

import java.util.Arrays;

public class SumClosest {
    public static void main(String[] orgs){
        SumClosest s=new SumClosest();
        int []n={6,-18,-20,-7,-15,9,18,10,1,-20,-17,-19,-3,-5,-19,10,6,-11,1,-17,-15,6,17,-18,-3,16,19,-20,-3,-17,-15,-3,12,1,-9,4,1,12,-2,14,4,-4,19,-20,6,0,-19,18,14,1,-15,-5,14,12,-4,0,-10,6,6,-6,20,-8,-6,5,0,3,10,7,-2,17,20,12,19,-13,-1,10,-1,14,0,7,-3,10,14,14,11,0,-4,-15,-8,3,2,-5,9,10,16,-4,-3,-9,-8,-14,10,6,2,-12,-7,-16,-6,10};
        System.out.println(s.threeSumClosest(n,-52));
    }
    public int threeSumClosest(int[] nums, int target) {
        int b=0;
        int c=0;
        int closet;
        Arrays.sort(nums);
        if (nums[0]>=target&&nums[0]>0)
            return nums[0]+nums[1]+nums[2];
        if(nums[nums.length-1]<=target&&nums[nums.length-1]<0)
            return nums[nums.length-1]+nums[nums.length-2]+nums[nums.length-3];
            closet=nums[0]+nums[1]+nums[nums.length-1];
        for (int i=0;i<nums.length-2;i++){
            b=i+1;
            c=nums.length-1;
            while (b<c){
                int temp=nums[i]+nums[b]+nums[c];
                if (temp==target)return target;
                if (Math.abs(temp-target)<Math.abs(closet-target))
                    closet=temp;
                if (temp>target){
                    c--;
                }else
                    b++;
            }

        }
        return closet;
    }
}
