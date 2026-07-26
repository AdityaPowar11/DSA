class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        HashSet <Integer> set = new HashSet<>();
        List <Integer> l = new ArrayList<>();


        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                l.add(nums[i]);

            }
            else{
                set.add(nums[i]);
            }
        }

    return l;
        
    }
}