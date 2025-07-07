class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String fullWord1 = "";
        for(int i = 0; i<word1.length;i++ ){
            fullWord1+= word1[i];
        }
        String fullWord2 = "";
        for(int i =0;i<word2.length;i++){
            fullWord2+=word2[i];
        }
        if(fullWord1.equals(fullWord2)){
            return true;
        } else{
            return false;
        }
    }
}