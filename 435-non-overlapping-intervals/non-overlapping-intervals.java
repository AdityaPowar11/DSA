class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->a[1]-b[1]);

        int count =0;
        int last_ending_time=intervals[0][1];

        for(int i =1;i<intervals.length;i++){

            if(last_ending_time > intervals[i][0]) count++;
            else last_ending_time = intervals[i][1] ;
        }

        return count;
        
    }
}