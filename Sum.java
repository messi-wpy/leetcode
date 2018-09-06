import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[]args){
        Sum s=new Sum();
        int []test={0,0,0};
        System.out.println(s.threeSum(test).toString());
    }
    public List<List<Integer>> threeSum(int[] nums) {
        int a,b,c;
        List<List<Integer>>l=new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++){
            if(nums[i] > 0) break;
            if(i != 0 && nums[i] == nums[i - 1]) continue;
            b=i+1;c=nums.length-1;
            while (b<c){
                int temp = nums[i]+nums[b]+nums[c];
                if (temp==0) {
                    l.add(Arrays.asList(nums[i], nums[b], nums[c]));
                    b++;
                    c--;
                    while (b<nums.length&&nums[b]==nums[b-1])b++;
                    while (c>=0&&nums[c]==nums[c+1])c--;
                    continue;
                }
                if (temp>0){
                    c--;
                    while (c>=0&&nums[c]==nums[c+1])c--;
                    continue;
                }
                if (temp<0){
                    b++;
                    while (b<nums.length&&nums[b]==nums[b-1])b++;
                }
            }
        }
        return l;
    }
}
