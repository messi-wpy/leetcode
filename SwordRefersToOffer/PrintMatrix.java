package exercise.SwordRefersToOffer;

import java.util.ArrayList;
import java.util.List;

public class PrintMatrix {

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer>res=new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        if (row==0||col==0)
            return res;

        int left,top,right,bottom;
        left=top=0;
        right=col-1;
        bottom=row-1;
        while (left<=right&&top<=bottom){
            for (int i = left; i <=right ; i++) {
                res.add(matrix[top][i]);
            }
            for (int i = top+1; i <=bottom ; i++) {
                res.add(matrix[i][right]);
            }
            if (bottom!=top){
                for (int i = right-1; i >=left ; i--) {
                    res.add(matrix[bottom][i]);
                }
            }
            if (left!=right){
                for (int i = bottom-1; i >top ; i--) {
                    res.add(matrix[i][left]);
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return res;
    }
}
