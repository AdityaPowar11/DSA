class Solution {

    int helper(int [] cost , int n,int [] dp ){
        if(n<=1) return cost[n];
        if(dp[n]!=-1)return dp[n];
        dp[n] = cost[n] + Math.min(helper(cost,n-1,dp),helper(cost,n-2,dp));
        return dp[n];
    }
    public int minCostClimbingStairs(int[] cost) {

        int n = cost.length-1;
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        return Math.min(helper(cost,n,dp),helper(cost,n-1,dp));


        
    }
}