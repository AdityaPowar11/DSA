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

        int dp[][] = new int [text1.length()][text2.length()];

        for(int i =0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                dp[i][j] =-1;
            }
        }

        return lcs(text1,text2,text1.length()-1,text2.length()-1,dp);
        
    }
}