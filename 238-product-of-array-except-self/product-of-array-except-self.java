class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int ans [] = new int[n];
        int Prodl =1;
        int Prodr =1;

        for(int i=n-1;i>=0;i--){
            ans[i]=Prodr;
            Prodr =Prodr*nums[i];
        }

        for(int i =0;i<n;i++){
            ans[i] = ans[i] * Prodl;
            Prodl = Prodl * nums[i];
        }

        return ans;  
    }
}