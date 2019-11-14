package exercise.LeetCode;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int nums[]={1,3};

        System.out.println(search(nums,3));
    }
    public static int search(int[] nums, int target) {
        if (nums==null)return -1;
        int left=0;
        int right=nums.length-1;

        while (left<=right){
            int mid=(right-left)/2+left;
            if (nums[mid]==target)return mid;
            if (nums[mid]<nums[right]){
                if (target>nums[mid]&&target<=nums[right]){
                    left=mid+1;
                    continue;
                }else{
                    right=mid-1;
                    continue;

                }

            }else {
                if (target<nums[mid]&&target>=nums[left]){

                    right=mid-1;
                    continue;
                }else {
                    left=mid+1;


                }


            }



        }
        return -1;
    }
}
