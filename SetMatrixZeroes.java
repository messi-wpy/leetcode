package leetcode;

public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        boolean []raw=new boolean[matrix.length];
        boolean []column=new boolean[matrix[0].length];

        for (int i = 0; i < raw.length; i++) {
            for (int j = 0; j <column.length ; j++) {
                if (matrix[i][j]==0){
                    raw[i]=true;
                    column[j]=true;
                }
            }
        }
        for (int i = 0; i <raw.length ; i++) {
            for (int j = 0; j <column.length ; j++) {
                if (raw[i]||column[j]){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
