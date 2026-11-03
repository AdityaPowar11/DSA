class Solution {
    public int minDistance(String word1, String word2) {
        
        StringBuilder s1 = new StringBuilder(word1);
        StringBuilder s2 = new StringBuilder(word2);


        int dp[][]= new int[s1.length()+1][s2.length()+1];

        for(int i = s1.length()-1 ;i>=0;i--){
            for(int j = s2.length()-1;j>=0;j--){

                if(s1.charAt(i)==s2.charAt(j)) dp[i][j] = 1+ dp[i+1][j+1];
                else{
                    dp[i][j] = Math.max(dp[i+1][j] , dp[i][j+1]);
                }
            }
        }
        int  ans = ( s1.length() > s2.length() ) ? s1.length() : s2.length();

        return  s1.length() + s2.length() -  2 * dp[0][0];


    }
}