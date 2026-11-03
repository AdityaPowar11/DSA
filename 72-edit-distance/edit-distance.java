class Solution {

    int minsteps(int i ,int j , StringBuilder s1 , StringBuilder s2,int[][]dp){

        if(i==-1)return j+1;
        if(j==-1)return i+1;

        if(dp[i][j]!=-1) return dp[i][j];


        if(s1.charAt(i) == s2.charAt(j)) return dp[i][j] = minsteps(i-1,j-1,s1,s2,dp);
        else{
            int del = 1 + minsteps(i-1,j,s1,s2,dp);
            int ins = 1 + minsteps(i,j-1,s1,s2,dp);
            int rep = 1 + minsteps(i-1,j-1,s1,s2,dp);

            return dp[i][j] =  Math.min(del,Math.min(rep,ins));
        }
    }


    public int minDistance(String word1, String word2) {
        StringBuilder s1 = new StringBuilder(word1);
        StringBuilder s2 = new StringBuilder(word2);

        int m = s1.length();
        int n = s2.length();

        int [][] dp = new int [m][n];

        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++) 
            dp[i][j] = -1;
        }

        return minsteps(m-1,n-1,s1,s2,dp);

    }
}