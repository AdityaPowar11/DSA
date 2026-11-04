class Solution {
    public String longestPalindrome(String s) {

        int n = s.length();
        int i;
        int j;
        int[][]dp = new int [n][n];
        int max=0;
         String ans="";

        for (int k =0 ; k < n; k++) {
            i = 0;
            j = k;
            while (j < n) {

                if (i == j) {
                    dp[i][j] = 1;
                } else if (j == i + 1) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = 1;
                    }
                } else {
                    if(s.charAt(i) == s.charAt(j)) {
                        if(dp[i + 1][j - 1]==1) {
                            dp[i][j] = 1;
                        }
                    }
                }

                
                if (dp[i][j]==1) {
                    if(j-i>=max){
                        max=j-i;
                        ans = s.substring(i,j+1);
                    }
                } 
                i++;
                j++;

            }

        }

        return ans;
        
    }
}