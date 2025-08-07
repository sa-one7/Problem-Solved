class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        if(needle.length() > haystack.length()) return -1;
        int i = 0;
        int j = 0;
        while(i<haystack.length()){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
                if(j == needle.length()){
                    return i-j; //match found 
                }
            }
            else{
                i = i-j+1;
                j=0;
            }
        }
        return -1;
    }
}