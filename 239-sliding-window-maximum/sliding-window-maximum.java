class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        // NGE array
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        st.push(n - 1);
        nge[n - 1] = n;

        for (int i = n - 2; i >= 0; i--) {

            while (!st.isEmpty() && nums[i] >= nums[st.peek()]) {
                st.pop();
            }

            if (st.isEmpty())
                nge[i] = n;
            else
                nge[i] = st.peek();

            st.push(i);
        }

        // Find maximum for every window
        int j = 0;

        for (int i = 0; i < ans.length; i++) {

            if (j < i)
                j = i;

            while (nge[j] < i + k) {
                j = nge[j];
            }

            ans[i] = nums[j];
        }

        return ans;
    }
}