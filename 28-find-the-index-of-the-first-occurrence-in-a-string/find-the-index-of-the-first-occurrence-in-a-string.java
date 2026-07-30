class Solution {
    public int strStr(String haystack, String needle) {

        int p=0;
        int q = needle.length();


        while(q<=haystack.length()){

            String sub =haystack.substring(p,q);
            if(sub.equals(needle)){
                return p;
            }
            else{
                p++;
                q++;
            }
        }
        return -1;
        
    }
}