class Solution {

    long coin(int i ,int amount ,int[]coins,long[][]dp){
        if(i==coins.length){
            if(amount==0)return 0;
            else return Integer.MAX_VALUE;
        }

        if(dp[i][amount]!=-1)return dp[i][amount];

        long skip = coin(i+1,amount,coins,dp);
        if(amount-coins[i]<0)return dp[i][amount] = skip;

        long take = 1 + coin(i,amount - coins[i],coins,dp);
        return dp[i][amount] = Math.min(skip,take);

    }

    public int coinChange(int[] coins, int amount) {

        long [][] dp = new long[coins.length][amount+1];

        for(int i =0;i<dp.length;i++)
            for(int j=0;j<dp[0].length;j++)dp[i][j]=-1;

    
    int ans = (int) coin(0 ,amount ,coins,dp);
    if(ans==Integer.MAX_VALUE)return -1;
    return ans;
        
    }
}