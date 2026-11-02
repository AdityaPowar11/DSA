class Solution {
    int ways(int idx,int target,int[]nums){

        if(idx==nums.length){
            if(target==0)return 1;
            else return 0;
        }

        // if(dp[idx][target]!=Integer.MAX_VALUE)return dp[idx][target];

        int add = ways(idx+1,target-nums[idx],nums);
        int sub = ways(idx+1,target+nums[idx],nums);

        return  add + sub;

    }

    public int findTargetSumWays(int[] nums, int target) {  

        // int [][]dp =new int[nums.length][1];
        // for(int i =0;i<dp.length;i++){
        //     for(int j=0;j<dp[0].length;j++)
        //     dp[i][j]=Integer.MAX_VALUE;
        // }

        int ans = ways(0,target,nums);
        // if(ans==0)return -1;
        return ans;
    }
}