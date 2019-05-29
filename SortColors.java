package leetcode;

public class SortColors {

    public void sortColors(int[] nums) {
        int[] color=new int[3];
        for (int i = 0; i < nums.length; i++) {
            color[nums[i]]++;
        }
        int index=0;
        for (int i = 0; i <color.length ; i++) {

            while (color[i]>0){
                nums[index]=i;
                index++;
                color[i]--;
            }
        }
        return ;
    }
}
