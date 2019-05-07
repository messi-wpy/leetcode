package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {
        int [][]matrix={{2,3}};
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix==null||matrix.length==0)return new ArrayList<>();

        List<Integer>list=new ArrayList<>();
        if (matrix.length==1)
        {
            for (int i = 0; i <matrix[0].length ; i++) {
                list.add(matrix[0][i]);
            }
            return list;
        }
        for (int i = 0; i < matrix[0].length&&i<matrix.length; i++) {
            if (i==matrix[i].length-i-1&&i==matrix.length-i-1)
                list.add(matrix[i][i]);
            for (int j = i; j <matrix[i].length-i-1 ; j++) {
                list.add(matrix[i][j]);
            }
            for (int j = i; j < matrix.length-i-1 &&matrix[i].length-1-i>=0; j++) {
                list.add(matrix[j][matrix[i].length-1-i]);
            }
            if (i!=matrix.length-1)
            for (int j = matrix[i].length-1-i; j >i&&matrix.length-1-i>=0 ; j--) {
                list.add(matrix[matrix.length-1-i][j]);
            }
            if (i!=matrix[i].length-1)
            for (int j = matrix.length-1-i; j >i ; j--) {
                list.add(matrix[j][i]);
            }
        }

        return list;
    }
}
