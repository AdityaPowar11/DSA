class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);

        int totalUnits =0;

        for(int box[] : boxTypes){
            int toTake = Math.min(truckSize,box[0]);

            totalUnits += toTake * box[1];
            truckSize -=toTake;

            if(truckSize==0)break;
        }

        return totalUnits;
        
    }
}