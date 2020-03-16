package exercise.LeetCode;

public class LargestSquare {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0)
            return 0;
        int row=matrix.length;
        int col=matrix[0].length;
        int res=0;
        int [][]dp=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]!='1'){
                    dp[i][j]=0;
                    continue;
                }
                int left=j>0?dp[i][j-1]:0;
                int top=i>0?dp[i-1][j]:0;
                int leftAndTop=(i>0&&j>0)?dp[i-1][j-1]:0;
                dp[i][j]=Math.min(Math.min(left,top),leftAndTop)+1;
                if(dp[i][j]>res){
                    res=dp[i][j];
                }
            }
        }
        return res*res;
    }
}
