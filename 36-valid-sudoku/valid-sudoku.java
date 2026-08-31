class Solution {

    public boolean isvalid(char[][] board, int row, int col, char num) {
        //check row
        for (int i = 0; i < 9; i++) {
            if (i != row  && board[i][col] == num)
                return false;
        }

        //check row
        for (int j = 0; j < 9; j++) {
            if (j != col && board[row][j] == num)
                return false;
        }

        int sRow = row / 3 * 3;
        int sCol = col / 3 * 3;

        for (int i = sRow; i < sRow + 3; i++) {
            for (int j = sCol; j < sCol + 3; j++) {
                if ((i != row || j != col) &&board[i][j] == num)
                    return false;
            }
        }

        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (board[i][j] == '.' || board[i][j] == ',')
                    continue;

                char num = board[i][j];

                if (isvalid(board, i, j, num) == false)
                    return false;

                board[i][j] = num;
            }
        }


        return true;

    }
}