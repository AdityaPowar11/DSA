class Solution {
    public int[] twoSum(int[] nums, int target) {

        int st =0;
        int end =nums.length-1;

        int []ans=new int[2];

 while (st < end) {

    if (nums[st] + nums[end] == target) {
        ans[0] = st+1;
        ans[1] = end+1;
        return ans;
    }

    if (nums[st] + nums[end] < target) {
        st++;      
    } else {
        end--;    
    }
}

return ans;
        
    }
}