class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> h = new HashSet<>();

        for(int i =0 ; i<nums.length;i++){

            if(!h.contains(nums[i])){
                h.add(nums[i]);
            }
        }

        int currlen =0;
        int max =0;

        for(Integer i : h ){
            if(!h.contains(i-1)){
                currlen =1;
                int x = i;
                max = Math.max(currlen,max);
                while(h.contains(x+1)){
                    currlen++;
                    x++;
                    max = Math.max(currlen,max);
                }
            }
        }

        return max;
        
    }
}