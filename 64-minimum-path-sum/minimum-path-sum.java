class Solution {
    int paths(int grid[][],int row,int col,int m ,int n,int [][]dp){

        if(row==m && col==n)return grid[row][col];
        if(row>m || col>n) return Integer.MAX_VALUE;

        if(dp[row][col]!=-1)return dp[row][col];

        int right = paths(grid,row,col+1,m,n,dp);
        int down = paths(grid,row+1,col,m,n,dp);

        return dp[row][col] = grid[row][col] + Math.min(right,down);
    }
    public int minPathSum(int[][] grid) {
        
        int[][] dp =new int[grid.length][grid[0].length];

        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                dp[i][j]=-1;
            }
        }

        return paths(grid,0,0,grid.length-1,grid[0].length-1,dp);
        
    }
}