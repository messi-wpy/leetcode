package exercise.SwordRefersToOffer;

public class RectPath {

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix==null||matrix.length<rows*cols)
            return false;
        boolean []visits=new boolean[rows*cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (findPath(matrix,rows,cols,str,0,i,j,visits))
                    return true;
            }
        }
        return false;


    }

    public boolean findPath(char[]matrix,int rows,int cols,char[]str,int index,
                                int row,int col,boolean []visits){
        if (index==str.length)
            return true;
        boolean isFound=false;
        int cur=row*cols+col;
        if (row<0||row>=rows||col<0||col>=cols|| visits[cur]||matrix[cur]!=str[index]){

            return false;
        }

        visits[cur]=true;
        isFound=findPath(matrix,rows,cols,str,index+1,row,col+1,visits)
                ||findPath(matrix,rows,cols,str,index+1,row,col-1,visits)
                ||findPath(matrix,rows,cols,str,index+1,row+1,col,visits)
                ||findPath(matrix,rows,cols,str,index+1,row-1,col,visits);
        visits[cur]=isFound;
        return isFound;

    }
}
