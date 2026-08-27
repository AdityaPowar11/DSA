class Solution {

    static void swap(int i ,int j ,int[]nums){
        int temp = nums[i];
        nums[i] =nums[j];
        nums[j] =temp;
    }

    public static void solution(int nums[],int idx ,List<List<Integer>> ans){

        int n = nums.length;

        if(idx ==n-1){
            List<Integer> l = new ArrayList<>();

            for(int i =0;i<n;i++){
                l.add(nums[i]);
            }
            ans.add(l);
            return ;
        }

        for(int i =idx;i<n;i++){
            swap(i,idx,nums);
            solution(nums,idx+1,ans);
            swap(i,idx,nums);
        }

    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        solution(nums,0,ans);
        return ans;
        
    }
}