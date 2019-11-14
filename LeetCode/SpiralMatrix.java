package exercise.LeetCode;

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
        int rows=matrix.length-1;
        int cols=matrix[0].length-1;
        int startRow=0;
        int startCol=0;
        while (startRow<=rows&&startCol<=cols){
            int i=0;
            for (i=startCol; i <=cols ; i++) {
                list.add(matrix[startRow][i]);
            }
            for (i=startRow+1;i<=rows;i++){
                list.add(matrix[i][cols]);
            }
            for (i=cols-1;i>=startCol&&startRow!=rows;i--){
                list.add(matrix[rows][i]);
            }
            for (i=rows-1;i>startRow&&startCol!=cols;i--){
                list.add(matrix[i][startCol]);
            }

            rows--;
            cols--;
            startRow++;
            startCol++;

        }
        return list;
    }
}
