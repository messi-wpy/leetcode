package exercise.LeetCode;

public class RemoveDuplicatesfromSortedArrayII {
    public  static void main(String []args){
        int[] nums={0,0,1,1,1,1,2,3,3};
        System.out.print(removeDuplicates(nums));

    }
    public static int removeDuplicates(int[] nums) {
        int start=0;
        int i=0;
        int flag =0;
        for (;i<nums.length;i++){
            if (i>=1&&nums[i]!=nums[i-1]){
                flag=1;
                nums[start++]=nums[i];
                continue;
            }
            if (flag<2){
                nums[start++]=nums[i];
                flag++;
            }
            else {
                flag=0;
                while ((i+1)<nums.length&&nums[i]==nums[i+1])
                    i++;


            }



        }
        return start;
    }


}
