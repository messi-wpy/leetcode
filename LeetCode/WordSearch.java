package exercise.LeetCode;

public class WordSearch {

    public static void main(String[] args) {
        WordSearch w=new WordSearch();
        char[][]board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};

        System.out.println(w.exist(board,"ABCCED"));
    }
    public boolean exist(char[][] board, String word) {
        if (word==""||board.length*board[0].length<word.length())
            return false;
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[0].length ; j++) {
                if (backTrackingFind(board,word,i,j,0,0,0))
                    return true;
            }
        }
        return false;
    }
    
    public boolean backTrackingFind(char[][] board, String word, int row, int column, int match,int lastR,int lastC){
        if (match==word.length())
            return true;
        if (row<0||row>=board.length||column<0||column>=board[0].length)
            return false;
        if (board[row][column]=='!')
            return false;
        if (board[row][column]==word.charAt(match)){
            char temp=board[row][column];
            board[row][column]='!';
            boolean res=backTrackingFind(board,word,row-1,column,match+1,row,column)||
                    backTrackingFind(board,word,row,column-1,match+1,row,column)||
                 backTrackingFind(board,word,row+1,column,match+1,row,column)||
                 backTrackingFind(board,word,row,column+1,match+1,row,column);

            board[row][column]=temp;
            return res;
        }else
            return false;
    }
}
