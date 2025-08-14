class Solution {
    public String largestGoodInteger(String num) {
        if(num.length()<1) return "";
        int i=0;
        String maxGood = "";
        while(i<num.length()-2){
            if (num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)) {
            String triple = num.substring(i, i+3);
            if(maxGood.equals("") || triple.compareTo(maxGood) > 0){
                maxGood = triple;
            }
        }
        i++;
        }
        return maxGood;
    }
}