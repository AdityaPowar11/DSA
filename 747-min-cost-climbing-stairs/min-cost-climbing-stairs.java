class Solution {



    // int climb(int[]cost,int idx,int dp[]){
    //     if(idx>=cost.length)return 0;
    //     if(dp[idx]!=-1)return dp[idx];

    //     int one_step = cost[idx] + climb(cost,idx+1,dp);
    //     int two_step = cost[idx] + climb(cost,idx+2,dp);

    //     return dp[idx] = Math.min(one_step,two_step);
    // }
    public int minCostClimbingStairs(int[] cost) {

        int [] dp = new int[3];
        dp[0]=cost[0];
        dp[1] =cost[1];

        for(int i =2;i<cost.length;i++){
            int one_step = cost[i] + dp[0];
            int two_step = cost[i] + dp[1];

            dp[2] = Math.min(one_step,two_step);
            dp[0]=dp[1];
            dp[1]=dp[2];
        }

        return Math.min(dp[0],dp[1]);
        
    }
}