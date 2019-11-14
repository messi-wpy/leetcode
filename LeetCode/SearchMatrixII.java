package exercise.LeetCode;

public class SearchMatrixII {

    public static void main(String[] args) {
        int [][]mat={{-5}};
        SearchMatrixII s=new SearchMatrixII();
        System.out.println(s.searchMatrix(mat,-5));
    }
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix.length==0)return false;
            int column=0;
            int max=matrix.length;

            while (column<max) {
                int left=0;
                int right=matrix[column].length-1;
                int mid=(right-left)/2+left;
                while (left <= right) {
                    if (matrix[column][mid] == target) return true;

                    else if (matrix[column][mid] < target) {
                        left = mid + 1;
                        mid = (right - left) / 2 + left;

                    } else {
                        right = mid - 1;
                        mid = (right - left) / 2 + left;

                    }
                }
                column++;
            }
            return false;
        }
}
