class Solution {
    public int reverse(int x) {
        double ans=0;

        if(x<0){
            x = -1*x;
            while(x!=0){

                ans = (ans*10) + (x%10);
                x =x/10;
            }
            ans = -1 *ans;
            if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE) return 0;
            return (int)ans;
        }
        else{
                while(x!=0){

                ans = (ans*10) + (x%10);
                x =x/10;
            }
             if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE) return 0;
            return (int) ans;
        }
        
    }
}