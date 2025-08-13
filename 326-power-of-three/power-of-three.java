class Solution {
    public boolean isPowerOfThree(int n) {
        int q=n;
        if ( n < 1) return false;
        if (n == 1) return true;
        while(q % 3 == 0){
            q = q/3;
            if(q == 1) return true;
        }
        return false;
    }
}