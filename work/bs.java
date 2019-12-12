package exercise.work;

public class bs {
    public static void main(String[] args) {
        int []nums={2,45,55,78,444,1000};
        System.out.println(search(nums,444));
    }
    public static int search(int nums[],int target){
        int first=0;
        int last=nums.length-1;
        while (last>=first){
            int mid=(last-first)/2+first;
            if (nums[mid]==target){
                return mid;
            }
            else if (nums[mid]<target){
                first=mid+1;
            }
            else
                last=mid-1;

        }
        return -1;

    }
}
