class Solution {
    public int maxArea(int[] height) {


        int left =0;
        int right = height.length-1;

        int max_water=0;
        while(left<right){

            int curr_water = Math.min(height[left],height[right]) * (right-left);
            max_water = Math.max(max_water,curr_water);

            if(height[left]<height[right]){
                left++;
            }
            else {
                right--;
            }
        }


    return max_water;






        
    }
}