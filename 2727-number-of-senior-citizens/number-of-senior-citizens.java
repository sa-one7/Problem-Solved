class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0;i<details.length;i++){
            String person = details[i];
            String age = person.substring(11,13);
            int numage = Integer.parseInt(age);
            if(numage>60)
            count++;
        }
        return count;
    }
}