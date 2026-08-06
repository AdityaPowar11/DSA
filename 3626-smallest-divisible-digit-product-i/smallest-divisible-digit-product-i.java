class Solution {
    public int digitprod(int n){
        int product=1;

        while(n!=0){
            if(n%10==0) return 0;
            product = product * (n%10);
            n/=10;
        }

        return product;
    }
    public int smallestNumber(int n, int t) {



        for(int i = n;i<101;i++){

            int res = digitprod(i);
            
            if((res%t) ==0) return i;

        }

return 0;
        
    }
}