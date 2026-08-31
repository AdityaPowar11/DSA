class Solution {

    static int check =0;

    public boolean isValid(char[][] board, int row, int col, char num) {
        //check row
        // check column
        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][col] == num)
                return false;
        }

        // check row
        for (int j = 0; j < 9; j++) {
            if (j != col && board[row][j] == num)
                return false;
        }

        // check 3 x 3 box
        int sRow = row / 3 * 3;
        int sCol = col / 3 * 3;

        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if ((i != row || j != col) && board[i][j] == num)
                    return false;
            }
        }

        return true;
    }

    public void solve(char[][] board,int row,int col){
        if(row==9){
            check=1;
            return;
        }

        else if(board[row][col]!='.'){
            if(col!=8)solve(board,row,col+1);
            else solve(board,row+1,0);
        }
        else{

            for(char ch ='1';ch<='9';ch++){
                if(isValid(board,row,col,ch)){
                    board[row][col] = ch;
                    if(col!=8)solve(board,row,col+1);
                    else solve(board,row+1,0);    
                    if(check ==1)return ;
                    board[row][col] = '.';

                }
            }
        }
    }

    public void solveSudoku(char[][] board) {

        solve(board,0,0);
        check=0;
        
    }
}