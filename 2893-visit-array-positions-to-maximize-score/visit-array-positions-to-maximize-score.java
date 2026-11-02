class Solution {
    long scores(int[] nums, int x, int prev, int i,long[][]dp) {

        if (i == nums.length) {
            return 0;
        }
        if(dp[i][prev]!=Long.MIN_VALUE) return dp[i][prev];

        long skip = scores(nums, x, prev, i + 1,dp);
        long penalty = (nums[i]%2==prev%2) ? 0:x; 

        long take =  nums[i] - penalty + scores(nums, x, nums[i]%2, i + 1,dp) ;            

        return dp[i][prev] = Math.max(skip,take);

    }

    public long maxScore(int[] nums, int x) {

        long[][]dp = new long[nums.length][2];

        for(int i =0;i<nums.length;i++){
 
            Arrays.fill(dp[i],Long.MIN_VALUE);
        }

        return nums[0] + scores(nums, x, nums[0]%2, 1,dp);

    }
}