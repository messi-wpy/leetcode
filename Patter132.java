import java.util.Stack;

public class Patter132 {
    public static void main(String[]args){
        int a[]={2,4,3,1};
        System.out.print(find132pattern(a));

    }
    public static boolean find132pattern(int[] nums) {
        if (nums==null||nums.length<3) return false;
        Stack<Integer> stack=new Stack<>();
        int c=Integer.MIN_VALUE;
        for (int i=nums.length-1;i>=0;i--){
            if (nums[i]<c)return true;
            while (!stack.isEmpty()&&nums[i]>stack.peek()){
                c=stack.pop();
            }
            stack.push(nums[i]);

        }
        return false;
    }
}
