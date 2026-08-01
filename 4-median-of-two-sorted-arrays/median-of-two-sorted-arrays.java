class Solution {



    static void merge(int [] arr,int [] nums1,int nums2[]){

        int n1 = nums1.length;
        int n2 = nums2.length;

        int i=0; int j=0; int k=0;

        while(i<n1 && j <n2){
            if(nums1[i]<nums2[j]){
                arr[k++] = nums1[i++];
            }
            else {
                arr[k++] = nums2[j++];
            }
        }

    while(i<n1)arr[k++] = nums1[i++];

    while(j<n2)arr[k++] = nums2[j++];

        
    }
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int [] arr= new int [nums1.length + nums2.length];

        merge(arr,nums1,nums2);

        int n = arr.length;

        if (n%2 != 0){

            double ans = arr[n/2];
            return ans;
        }
        else {
            double x   = arr[n/2] + arr[(n/2)-1];
            double ans = x/2.0;
            return ans;
        }
    }
}