class Solution {

    // int house(int[] nums,int idx,int[] dp){

    //     if(idx>=nums.length)return 0;
        
    //     if(dp[idx]!=-1)return dp[idx];
    //     int dont_rob = house(nums,idx+1,dp);
    //     int rob = nums[idx] + house(nums,idx+2,dp);

    //     return dp[idx] = Math.max(rob,dont_rob);
    // }

    public int rob(int[] nums) {
        int[] dp = new int[3];
        dp[0] = nums[0];
        if(nums.length>1)dp[1] = Math.max(nums[1],nums[0]);

        for(int i =2;i<nums.length;i++){
            int dont_rob =dp[1];
            int rob = nums[i] + dp[0];

            dp[2] = Math.max(rob,dont_rob);
            dp[0]=dp[1];
            dp[1]=dp[2];
        }

        return Math.max(dp[0],dp[1]);
    }
}