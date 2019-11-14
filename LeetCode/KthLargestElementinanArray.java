package exercise.LeetCode;

public class KthLargestElementinanArray {
    public static void main(String[] args) {
        int a[]={2,1};
        KthLargestElementinanArray k=new KthLargestElementinanArray();
        System.out.println(k.findKthLargest(a,2));
    }

    public int findKthLargest(int[] nums, int k) {
        if (nums==null||nums.length==0)return 0;
        return quickChoose(nums,k,0,nums.length-1);

    }

    public int quickChoose(int []nums,int k,int left,int right){
        int position=patition(nums,left,right);
        if (position+1==k)
            return nums[position];
        else if(position+1>k){
           return quickChoose(nums,k,left,position-1);

        }else {
           return quickChoose(nums,k,position+1,right);

        }


    }

    private int patition(int nums[],int left,int right){
        int num=nums[left];
        int position=left;

        while (left<right){
            while (left<right&&nums[right]<num)
                right--;
            if (left<right){
                nums[left++]=nums[right];
            }

            while (nums[left]>num&&left<right)
                left++;
            if (left<right){
                nums[right--]=nums[left];
            }
        }
        nums[left]=num;
        return left;

    }

    private void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;

    }


}
