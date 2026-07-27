class Solution {
    public static void merge(int[] arr, int left, int mid, int right) {
    int[] temp = new int[right - left + 1];

    int i = left;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= right) {
        if (arr[i] <= arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
        }
    }

    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    while (j <= right) {
        temp[k++] = arr[j++];
    }

    // Copy back to original array
    for (int x = 0; x < temp.length; x++) {
        arr[left + x] = temp[x];
    }
}
public static void mergeSort(int[] arr, int left, int right) {
    if (left >= right) {
        return;
    }

    int mid = left + (right - left) / 2;

    mergeSort(arr, left, mid);       // Sort left half
    mergeSort(arr, mid + 1, right);  // Sort right half

    merge(arr, left, mid, right);    // Merge the two sorted halves
}
    public int maxProduct(int[] arr) {

        mergeSort(arr,0,arr.length-1);

        int ans = (arr[arr.length-1]-1) * (arr[arr.length-2]-1);

        return ans;

    
        
    }
}