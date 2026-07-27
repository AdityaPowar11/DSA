class Solution {
    public double myPow(double x, int n) {
   long power = n; // avoid overflow
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double res = 1;

        while (power > 0) {
           if ((power & 1) == 1) { // if odd
                res *= x;
            }
            x *= x;
            power >>= 1; // divide by 2
        }

        return res;
    }
        
    }
