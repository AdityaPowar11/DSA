class Solution {

    static boolean isSym(int i){

        int n = String.valueOf(Math.abs(i)).length()/2;

        int res1=0;
        int res2=0;

        for(int j =0;j<n;j++){
            res1= res1+i%10;
            i=i/10;
        }

        for(int j =0;j<n;j++){
            res2= res2+i%10;
            i=i/10;
        }

        return res1==res2;

    }
    public int countSymmetricIntegers(int low, int high) {

        int count =0;

        for( int i = low;i<=high;i++){
            if(String.valueOf(Math.abs(i)).length()%2==0){
                if(isSym(i)){
                    count++;
                }
            }
        }

        return count;
        
    }
}