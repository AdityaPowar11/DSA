class Solution {
    public boolean lemonadeChange(int[] bills) {

        int n = bills.length;
        int change_5 = 0;
        int change_10 = 0;


        for (int i = 0; i < n; i++) {

            if (bills[i] == 5)  change_5++;

            else if (bills[i] == 10){
                if(change_5>0){
                    change_5--;
                    change_10++;
                }
                else return false;
            }

            else{
                if(change_5>0 && change_10>0){
                    change_5--;
                    change_10--;
                }
                else if (change_5 >= 3) {
                    change_5-=3;
                }
                else return false;
            }
                
        }

        return true;

    }
}