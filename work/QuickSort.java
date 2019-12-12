package exercise.work;

public class QuickSort {
    public static void main(String[] args) {
        int []nums={3,34,32,2,43,333,4,32,432,3,432,324,33,22,4322,34,3,44,23};
        QuickSort quickSort=new QuickSort();
        quickSort.sort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
        ;
    }
    public void sort(int[] nums){
        sortImpl(nums,0,nums.length-1);
    }

    private void sortImpl(int[]nums,int start,int end){
        if(end>start){
            int p=partition(nums,start,end);
            sortImpl(nums,start,p-1);
            sortImpl(nums,p+1,end);
        }

    }
    private int partition(int []nums,int start,int end){
        int origin=nums[start];
        while (end>start){
            while (end>start&&nums[end]>origin){
                end--;
            }
            if (end>start){
                nums[start]=nums[end];
                start++;
            }
            while (end>start&&nums[start]<origin){
                start++;
            }
            if (end>start){
                nums[end]=nums[start];
                end--;
            }
        }
        nums[start]=origin;
        return start;
    }
}
