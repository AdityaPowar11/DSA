class Solution {

        
    public static boolean isSafe(char[][] board, int i, int j) {

        int n = board[i].length;

        for (int row = 0; row < n; row++) {
            if (board[row][j] == 'Q')
                return false;
        }

        for (int col = 0; col < n; col++) {
            if (board[i][col] == 'Q')
                return false;
        }

        int row = i;
        int col = j;
        while (row > 0 && col > 0) {
            row--;
            col--;
            if (board[row][col] == 'Q')
                return false;

        }

        row = i;
        col = j;
        while (row > 0 && col < n - 1) {

            row--;
            col++;

            if (board[row][col] == 'Q')
                return false;
        }

        return true;

    }

        public static void Solution(int row, List<List<String>> ans, char[][] board) {

        int n = board.length;

        if (row == n) {

            ArrayList<String> l = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String s = "";

                for (int j = 0; j < n; j++) {
                    s = s + board[i][j];
                }

                l.add(s);
            }

            ans.add(l);

            return;
        }

        for (int j = 0; j < n; j++) {

            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                Solution(row + 1, ans, board);
                board[row][j] = '.';
            }
        }

    }
    
    public int totalNQueens(int n) {

      char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        List<List<String>> ans = new ArrayList<>();

        Solution(0, ans, board);

        return ans.size();
        
    }
}