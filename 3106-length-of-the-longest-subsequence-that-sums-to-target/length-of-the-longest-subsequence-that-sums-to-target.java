class Solution {

    int length(int i ,List<Integer> nums,int target,int[][]dp){

        if(i==nums.size()){
            if(target==0)return 0;
            else return -1;
        }
        if(dp[i][target]!=-2) return dp[i][target];
        int skip = length(i+1,nums,target,dp);
        if(target - nums.get(i)<0) return dp[i][target]=skip;
        int take =-1;

        int temp = length(i+1,nums,target-nums.get(i),dp);
        if(temp!=-1)take = 1 +temp ;

        return dp[i][target] = Math.max(skip,take);
    }


    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {

        int [][]dp = new int [nums.size()][target +1];

        if(nums.size()==1 && nums.get(0)==target)return 1;

        for(int i =0;i<dp.length;i++)
            for(int j =0;j<dp[0].length;j++)dp[i][j]=-2;

        
        int ans = length(0,nums,target,dp);
        if(ans==0)return -1;
        return ans;
        
    }
}