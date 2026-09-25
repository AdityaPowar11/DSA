class Solution {

    public int height(TreeNode root) {
        if (root == null || ((root.left == null) && (root.right == null)))
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public void nlevel1(TreeNode root, int n, List<Integer> arr) {
        if (root == null)
            return;
        if (n == 1) {
            arr.add(root.val);
            return;
        }
        nlevel1(root.left, n - 1, arr);
        nlevel1(root.right, n - 1, arr);
    }

    public void nlevel2(TreeNode root, int n, List<Integer> arr) {
        if (root == null)
            return;
        if (n == 1) {
            arr.add(root.val);
            return;
        }
        nlevel2(root.right, n - 1, arr);
        nlevel2(root.left, n - 1, arr);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int level = height(root)+1;

        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        if(root==null) return ans;

        for(int i =1;i<=level;i++){

            List<Integer> arr = new ArrayList<Integer>();
            if(i%2==0){
                nlevel2(root,i,arr);
            }
            else{
                nlevel1(root,i,arr);
            }

            ans.add(arr);
        }

        return ans;


    }
}