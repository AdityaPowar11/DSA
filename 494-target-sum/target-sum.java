class Solution {
    static int sum;
    int ways(int idx,int target,int res,int[]nums,int[][]dp){

        if(idx==nums.length){
            if(res==target)return 1;
            else return 0;
        }

        if(dp[idx][res+sum]!=-1)return dp[idx][res+sum];

        int add = ways(idx+1,target,res-nums[idx],nums,dp);
        int sub = ways(idx+1,target,res+nums[idx],nums,dp);

        return dp[idx][res+sum] = add + sub;

    }

    public int findTargetSumWays(int[] nums, int target) {  

        
        sum =0;
        for(int n :nums){
            sum+=n;
        }

        int [][]dp =new int[nums.length][2*sum+1];

        for(int i =0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++)
            dp[i][j]=-1;
        }

        return ways(0,target,0,nums,dp);
    }
}