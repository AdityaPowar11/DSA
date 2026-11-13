class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes,(a,b)->b[1]-a[1]);

        int totalUnits =0;

        for(int box[] : boxTypes){

            int noOfBoxes = box[0];
            int noOfunitsperBoxes = box[1];
            int toTake = Math.min(truckSize,noOfBoxes);

            totalUnits += toTake * noOfunitsperBoxes;
            truckSize -=toTake;

            if(truckSize==0)break;
        }

        return totalUnits;
        
    }
}