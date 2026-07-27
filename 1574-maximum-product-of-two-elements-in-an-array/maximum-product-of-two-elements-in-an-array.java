class Solution {
   
    public int maxProduct(int[] arr) {

        int max1= 0;
        int max2 =0;


        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2){
                max2= arr[i];
            }
            if(max2>max1){
                int temp = max1;
                max1=max2;
                max2=temp;
            }
        }


        return (max1-1)*(max2-1);

    
        
    }
}