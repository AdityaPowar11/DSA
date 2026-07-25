class Solution:
    def reverse(self, x: int) -> int:
        INT_MAX = 2**31 - 1
        flag = 0 if (x>=0) else 1
        x = x if (x>=0) else abs(x)
        rev =0
        while(x!=0) :
            rev = (rev*10) + (x%10)
            x =x//10

        if rev > INT_MAX:
            return 0
        if (flag==0):
            return rev
        else :
             return -1 * rev


        
        
        