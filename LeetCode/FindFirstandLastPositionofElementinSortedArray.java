package exercise.LeetCode;

public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] result={-1,-1};
        if (nums==null||nums.length==0)return result;
        int left=extraSearch(nums,target,false);
        if (left==nums.length||nums[left]!=target)
            return result;

        result[0]=left;
        result[1]=extraSearch(nums,target,true)-1;

        return result;


    }

    public int extraSearch(int[] nums, int tartget, boolean isRight) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if ((nums[mid] < tartget )||(isRight&&nums[mid]==tartget)){
                left=mid+1;

            }else
                right=mid;


        }

        return left;

    }
}
