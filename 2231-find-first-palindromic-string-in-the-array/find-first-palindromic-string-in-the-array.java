class Solution {

     public static String Palindrome(String word){
            int start=0;
            int end = word.length()-1;
            while(start<end){
                if(word.charAt(start) != word.charAt(end) ){
                    return "";
                }
                start++;
                end--;
            }
            return word;
        }

    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            String ans = Palindrome(words[i]);
            if(!ans.equals("")){
                return ans;
            }
        }
        return "";
    }
}