class Solution {
  
    public int minInsertions(String s) {
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder reversed = new StringBuilder(s).reverse();

        int m = s1.length();

        int[][] dp = new int[m + 1][m + 1];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                if (s1.charAt(i) == reversed.charAt(j))
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }

        return s.length() - dp[0][0];

        
        
    }
}