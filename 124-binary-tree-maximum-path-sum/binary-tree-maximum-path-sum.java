class Solution {
        public int linesum(TreeNode root,int []dp) {

            if(root==null) return 0;

            int leftsum = linesum(root.left,dp);
            int rightsum = linesum(root.right,dp);
            int pathsum = root.val;

            if(leftsum>0)pathsum+=leftsum;
            if(rightsum>0)pathsum+=rightsum;

            dp[0] = Math.max(dp[0],pathsum);
            return root.val + Math.max(0,Math.max(leftsum,rightsum));


 
    }
    public int maxPathSum(TreeNode root) {
        
        int []dp ={Integer.MIN_VALUE};
        linesum(root,dp);
        return dp[0];
    }
}