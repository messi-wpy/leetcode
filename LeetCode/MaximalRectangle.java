package exercise.LeetCode;

import java.util.Deque;
import java.util.LinkedList;

public class MaximalRectangle {

    public int maximalRectangle(char[][] matrix) {
        int res=0;
        for (int i = 0; i <matrix.length ; i++) {
            int []histogram=generateHistogram(matrix,i);
            Deque<Integer>stack=new LinkedList<>();
            for (int j = 0; j < histogram.length; j++) {
                if (stack.isEmpty()||histogram[j]>=stack.peek()){
                    stack.push(histogram[j]);
                }else {
                    int count=0;
                    while (!stack.isEmpty()&&stack.peek()>histogram[j]){
                        int temp=stack.pop();
                        count++;
                        res=Math.max(temp*count,res);
                    }
                    while (count>0){
                        stack.push(histogram[j]);
                        count--;
                    }
                    stack.push(histogram[j]);

                }

            }
            int count=1;
            while (!stack.isEmpty()){
                res=Math.max(stack.pop()*count,res);
                count++;
            }
        }
        return res;
    }

    public int [] generateHistogram(char[][]matrix,int row){
        int[] histogram=new int[matrix[0].length];
        for (int i = 0; i <matrix[0].length ; i++) {
            if (matrix[row][i]=='0')
                histogram[i]=0;
            else {
                int temp=row;
                int height=1;
                while (temp>0){
                    temp--;
                    if (matrix[temp][i]=='1')
                        height++;
                    else
                        break;

                }
                histogram[i]=height;
            }
        }
        return histogram;


    }
}
