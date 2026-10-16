class Solution {



    List<Integer> helper(TreeNode root){

        ArrayList<Integer> arr = new ArrayList<>();
        TreeNode curr = root;

        while(curr!=null){
            if(curr.left!=null){
                TreeNode pred = curr.left;
                while(pred.right!=null && pred.right!=curr){
                    pred = pred.right;
                }

                if(pred.right==null){
                    pred.right = curr;
                    curr = curr.left;
                }
                else{
                    pred.right =null;
                    arr.add(curr.val);
                    curr = curr.right;
                }
            }
            else{
                arr.add(curr.val);
                curr=curr.right;
            }
        }

        return arr;



    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 =  new ArrayList<>();
        arr1 = helper(root1);
        arr2 = helper(root2);

        ArrayList<Integer> ans = new ArrayList<>();
        int p=0;
        int q=0;

        while(p<arr1.size() && q<arr2.size()){

            if(arr1.get(p)<arr2.get(q)){
                ans.add(arr1.get(p));
                p++;
            }
            else{
                ans.add(arr2.get(q));
                q++;
            }
        }

        while(p<arr1.size() ){

                ans.add(arr1.get(p++));
        }

        while(q<arr2.size() ){

                ans.add(arr2.get(q++));
        }

        return ans;


        
    }
}