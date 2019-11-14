package exercise.LeetCode;

public class SearchA2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null||matrix.length==0||matrix[0].length==0)return false;
        int r1=matrix.length-1,l1=0;
        int r2=matrix[0].length-1,l2=0;
        int length=r2;
        int targetRow=0;
        while (l1<=r1){
            int mid1=(r1-l1)/2+l1;

            if (target==matrix[mid1][0]||matrix[mid1][length]==target)
                return true;
            if (target>matrix[mid1][0]&&target<matrix[mid1][length]){
                targetRow=mid1;
                break;
            }
            if (target>matrix[mid1][length]){
                l1=mid1+1;
                continue;
            }
            if (target<matrix[mid1][0]){
                r1=mid1-1;
            }

        }
        while (l2<=r2){
            int mid2=(r2-l2)/2+l2;
            int value=matrix[targetRow][mid2];
            if (target==value)
                return true;
            else if (target<value){
                r2=mid2-1;
            }
            else
                l2=mid2+1;
        }
        return false;

    }


}
