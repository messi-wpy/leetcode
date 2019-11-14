package exercise.LeetCode;

public class RotateImage {

    /**
     * 法一，依次移动，第一个-->第二个-->第三个-->第四个循环为一次，
     * 且只需要一个额外空间
     *
     * @param matrix
     */
    public void rotate_1(int[][] matrix) {
        int n=matrix.length;
        for (int i = 0; i <n/2 ; i++) {
            for (int j = i; j <n-1-i ; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-1-j][i];
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                matrix[j][n-1-i]=temp;
            }
        }
    }

    /**
     *
     *法二：先对矩阵转秩，然后再将每行元素倒置即可
     * @param matrix
     */

    public void rotate_2(int [][]matrix){
        for (int i = 0; i <matrix.length ; i++) {
            for (int j=i+1;j<matrix.length;j++){
                swap(matrix,i,j,j,i);
            }
        }
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0,k=matrix.length-1; j <k ; j++,k--) {
                swap(matrix,i,j,i,k);
            }
        }


    }


    public void swap(int [][]matrix,int a,int b,int c,int d){
        int temp=matrix[a][b];
        matrix[a][b]=matrix[c][d];
        matrix[c][d]=temp;

    }
}
