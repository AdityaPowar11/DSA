class Solution {

    boolean subset(int i ,int target,int[][]dp,int[] nums){

        if(i==nums.length){
            if(target==0)return true;
            else return false;
        }
        if(dp[i][target]!=-1) return dp[i][target]==1;
        boolean ans=false;

        boolean skip = subset(i+1,target,dp,nums);
        if(nums[i]>target) ans = skip;
        else{
        boolean take = subset(i+1,target-nums[i],dp,nums);
        ans = take || skip;
        }

        if(ans)dp[i][target]=1;
        else dp[i][target]=0;

        return ans;

    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2==1)return false;

        int [][] dp = new int [nums.length][sum/2 + 1];

        for(int i =0;i<dp.length;i++){
            for(int j =0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }

        return subset(0,sum/2,dp,nums);
    }
}