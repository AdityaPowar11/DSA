class Solution {

    void helper(TreeNode root, int targetSum, List<Integer> arr,List<List<Integer>> ans){
        if(root==null)return;

        if(root.left==null && root.right==null){

            arr.add(root.val);

            if(root.val==targetSum){

                List<Integer> a = new ArrayList<>();

                for(int i=0;i<arr.size();i++){
                    a.add(arr.get(i));
                }
                ans.add(a);
                
            }
            if (!arr.isEmpty()) arr.remove(arr.size() - 1);
            return;
        }

        arr.add(root.val);
        helper(root.left,targetSum-root.val,arr, ans);
        helper(root.right,targetSum-root.val,arr, ans);
        if (!arr.isEmpty())arr.remove(arr.size() - 1);
    }


    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        helper(root,targetSum,arr,ans);
        return ans;
        
    }
}