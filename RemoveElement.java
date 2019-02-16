public class RemoveElement {
    public static void main(String []args){
        int[] nums={1};
        System.out.print(removeElement(nums,1));

    }
    public static int removeElement(int[] nums, int val) {
        if (nums.length==0)return 0;
        int l=0;
        int last=nums.length-1;
        while (last>=0&&nums[last]==val)last--;
        for(int i=0;i<last;i++){
            if (nums[i]==val){
                nums[i]=nums[last--];
                while (nums[last]==val&&last>0)last--;

            }


        }
        return last+1;
    }

}
