class Solution {
    // int paths(int row,int col,int m ,int n,int[][]dp){
    //     if(row==m && col==n) return 1;
    //     if(row>m || col>n)return 0;
    //     if(dp[row][col]!=-1)return dp[row][col];
    //     int rightWays = paths(row,col+1,m,n,dp);
    //     int leftWays =paths(row+1,col,m,n,dp);
    //     return dp[row][col] = rightWays+leftWays;
    // }
    public int uniquePaths(int m, int n) {
        
        int dp[][] = new int[m][n];

        for(int i =0;i<n;i++){
            dp[0][i] = 1;
        }
        
        for(int  j =0;j<m;j++){
                dp[j][0] = 1;
            }


        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){

                int rightWays = dp[i][j-1];
                int leftWays = dp[i-1][j];

                dp[i][j]=rightWays + leftWays;
            }
        }

        return dp[m-1][n-1];

    }
}