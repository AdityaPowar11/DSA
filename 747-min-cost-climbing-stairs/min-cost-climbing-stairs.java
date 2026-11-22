class Solution {



    int climb(int[]cost,int idx,int dp[]){
        if(idx>=cost.length)return 0;
        if(dp[idx]!=-1)return dp[idx];

        int one_step = cost[idx] + climb(cost,idx+1,dp);
        int two_step = cost[idx] + climb(cost,idx+2,dp);

        return dp[idx] = Math.min(one_step,two_step);
    }
    public int minCostClimbingStairs(int[] cost) {

        int [] dp = new int[cost.length];
        Arrays.fill(dp,-1);

        return Math.min(climb(cost,0,dp),climb(cost,1,dp));
        
    }
}