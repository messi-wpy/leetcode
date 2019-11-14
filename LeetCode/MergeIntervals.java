package exercise.LeetCode;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int [][]test={{1,3},{2,6},{8,10},{15,18}};
        System.out.println(merge(test));

    }
    public static int[][] merge(int[][] intervals) {
        if (intervals==null||intervals.length==0)
            return new int[0][0];
        Arrays.sort(intervals,(row1,row2)->(row1[0]-row2[0]));
        Deque<Integer>stack=new LinkedList<>();
        stack.push(intervals[0][0]);
        stack.push(intervals[0][1]);
        for (int i = 1; i <intervals.length ; i++) {
            int right=stack.pop();
            int left=stack.pop();

            if (intervals[i][0]<=right){
                right=Math.max(right,intervals[i][1]);
                stack.push(left);
                stack.push(right);

            }else {
                stack.push(left);
                stack.push(right);
                stack.push(intervals[i][0]);
                stack.push(intervals[i][1]);

            }
        }
        int [][]res=new int[stack.size()/2][2];
        for (int i = 0; i <res.length ; i++) {
            res[i][0]=stack.pollLast();
            res[i][1]=stack.pollLast();
        }
        return res;

    }
}
