class Solution {
    public int tribonacci(int n) {

        if(n==0){
            return 0;
        }
        if(n==1|| n==2){
            return 1;
        }

        int sum= 1;
        int a = 0;
        int b =1;

        for (int i =2 ;i<n;i++){

            int temp = sum;
            sum = sum + a+b ;
            a=b;
            b=temp;

        }



        return sum;
    }
}