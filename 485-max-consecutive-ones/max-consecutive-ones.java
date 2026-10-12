class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int n = nums.length;
        if(n==1 && nums[0]==0)return 0;
        int p =0;
        int q;
        int count =0;
        int max_count = 0;

        
        while(p<n){

            while(p<n && nums[p]!=1){
                p++;
            }
            count =0;

            q= p;

            while(q<n && nums[p]== 1 && nums[q]==1){
                count++;
                max_count = Math.max(max_count ,count);
                q++;
            }
            p =q;

        }

        return max_count;
        
    }
}