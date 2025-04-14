class Solution {
    public boolean isPowerOfTwo(int n) {
            double res = Math.log(n) / Math.log(2);
            int round = (int)Math.round(res);
             if(Math.pow(2,round) == n) return true;
             else return false;                           
    }
}