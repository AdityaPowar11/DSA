class Solution {
    int helper(int[] nums,int n,int[]dp ){
        if(n<0)return 0;
        if(dp[n]!=-1)return dp[n];
        dp[n] = nums[n] + Math.max(helper(nums,n-2,dp),helper(nums,n-3,dp));
        return dp[n];
    }
    public int rob(int[] nums) {
        int [] dp = new int [nums.length];
        Arrays.fill(dp,-1);
        return Math.max(helper(nums,nums.length-1,dp),helper(nums,nums.length-2,dp));
        
    }
}