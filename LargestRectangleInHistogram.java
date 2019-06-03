package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        int [] nums={2,1,2};
        System.out.println(largestRectangleArea(nums));
    }

    public static int largestRectangleArea(int[] heights) {
        Deque<Integer>stack=new LinkedList<>();
        int res=0;
        for (int i = 0; i <heights.length ; i++) {
            if (stack.isEmpty()||stack.peek()<=heights[i]){
                stack.push(heights[i]);
            }
            else {
                int count=0;
                while (!stack.isEmpty()&&heights[i]<stack.peek()){
                    count++;
                    int temp=stack.pop();
                    res=Math.max(temp*count,res);
                }
                while (count>0){
                    stack.push(heights[i]);
                    count--;
                }
                stack.push(heights[i]);
            }


        }

        int count=1;
        while (!stack.isEmpty()){
            int temp=stack.pop();
            res=Math.max(temp*count,res);
            count++;
        }
        return res;
    }
}
