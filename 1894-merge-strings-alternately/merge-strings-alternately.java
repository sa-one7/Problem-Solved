class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder st = new StringBuilder("");
       for(int i = 0; i<word1.length() || i<word2.length();i++){
       if(i<word1.length()){
        st.append(word1.charAt(i));
       }
       if(i<word2.length()){
        st.append(word2.charAt(i));
       }
       }
       String ans = st.toString();
       return ans;
    }
}