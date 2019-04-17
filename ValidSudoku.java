package leetcode;

import java.util.HashSet;

public class ValidSudoku {
    /**
     *1. 查重用hashset
     *2. 遍历九宫格，只用一遍：
     * 利用二重循环，一行，一列
     * 然后一个一个九宫格，从左到右，从上到下九个
     *
     *
     *
     * @param board
     * @return
     */
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i <board.length ; i++) {
            HashSet<Character>row=new HashSet<>();
            HashSet<Character>col=new HashSet<>();
            HashSet<Character>nine=new HashSet<>();
            int rowIndex=3*(i/3);
            int colIndex=3*(i%3);
            for (int j = 0; j <board.length ; j++) {
                if (board[i][j]!='.'&&!row.add(board[i][j]))return false;
                if (board[j][i]!='.'&&!col.add(board[j][i]))return false;

               if (board[rowIndex+(j/3)][colIndex+(j%3)]!='.'&&!nine.add(board[rowIndex+(j/3)][colIndex+(j%3)]))return false;
            }
        }
        return true;
    }
}
