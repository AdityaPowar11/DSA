class Solution {


    public String shortestCommonSupersequence(String str1, String str2) {



        int m = str1.length();
        int n = str2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        
        StringBuilder str = new StringBuilder("");

        int i =m;
        int j =n;

        while(i>0 && j>0){

            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                str.append(str1.charAt(i - 1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]) i--;
            else j--;
        }

        str.reverse();

        StringBuilder lcs = new StringBuilder(str);
        StringBuilder ans = new StringBuilder("");
        System.out.println(lcs);

        i =0;
        j =0;
        int k =0;

        while( k < lcs.length()){

            while(i<str1.length() && str1.charAt(i) != lcs.charAt(k)){
                ans.append(str1.charAt(i));
                i++;
            }

            while( j < str2.length() && str2.charAt(j) != lcs.charAt(k)){
                ans.append(str2.charAt(j));
                j++;
            }

            ans.append(lcs.charAt(k));
            i++;
            j++;
            k++;
        }

        while (i < str1.length()) {
            ans.append(str1.charAt(i));
            i++;
        }

        while (j < str2.length()) {
            ans.append(str2.charAt(j));
            j++;
        }

        return ans.toString() ;

    }
}