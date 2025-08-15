class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        int r;
        int q = n;
        while(q>1){
            r = q%4;
            if(r == 0) {
            q = q/4;
            }
            else if(r != 0){
                return false;
            }
        }
        if(q==1) return true;
        return false;
    }
}