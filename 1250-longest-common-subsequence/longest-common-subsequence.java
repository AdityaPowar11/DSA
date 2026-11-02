class Solution {



    int lcs(String t1,String t2,int i,int j,int dp[][]){

        if(i<0 || j<0)return 0;

        if(dp[i][j]!=-1)return dp[i][j];

        if(t1.charAt(i)==t2.charAt(j)) return dp[i][j]=1+lcs(t1,t2,i-1,j-1,dp);
            int skip_i = lcs(t1,t2,i-1,j,dp);
            int skip_j = lcs(t1,t2,i,j-1,dp);

        return dp[i][j]=Math.max(skip_i,skip_j);

    }
    public int longestCommonSubsequence(String text1, String text2) {

        int dp[][] = new int [text1.length() +1][text2.length()+1];
        int n =text1.length();
        int m =text2.length();

        for(int i =n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(text1.charAt(i)==text2.charAt(j))dp[i][j]=1+dp[i+1][j+1];
                else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
                }
            }
        }

        return dp[0][0];
        
    }
}