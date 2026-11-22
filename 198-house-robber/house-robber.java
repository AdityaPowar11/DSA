class Solution {

    int house(int[] nums,int idx,int[] dp){

        if(idx>=nums.length)return 0;
        
        if(dp[idx]!=-1)return dp[idx];
        int dont_rob = house(nums,idx+1,dp);
        int rob = nums[idx] + house(nums,idx+2,dp);

        return dp[idx] = Math.max(rob,dont_rob);
    }

    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return Math.max(house(nums,0,dp),house(nums,1,dp));
    }
}