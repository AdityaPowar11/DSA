class Solution {



    // int climb(int[]cost,int idx,int dp[]){
    //     if(idx>=cost.length)return 0;
    //     if(dp[idx]!=-1)return dp[idx];

    //     int one_step = cost[idx] + climb(cost,idx+1,dp);
    //     int two_step = cost[idx] + climb(cost,idx+2,dp);

    //     return dp[idx] = Math.min(one_step,two_step);
    // }
    public int minCostClimbingStairs(int[] cost) {

        int [] dp = new int[cost.length];
        dp[0]=cost[0];
        dp[1] = cost[1];

        for(int i =2;i<cost.length;i++){
            int one_step = cost[i] + dp[i-1];
            int two_step = cost[i] + dp[i-2];

            dp[i] = Math.min(one_step,two_step);
        }

        return Math.min(dp[cost.length-1],dp[cost.length-2]);
        
    }
}