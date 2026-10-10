class Solution {

    void reverse(int arr[], int i,int j){

        while(i<j){
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];

            i++;
            j--;
        }

    }
    public void rotate(int[] arr, int k) {

        int n = arr.length;
        if(k!=0)k = k%n;

        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);


        
    }
}