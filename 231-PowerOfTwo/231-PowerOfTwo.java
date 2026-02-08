// Last updated: 08/02/2026, 19:47:34
class Solution {
    public boolean isPowerOfTwo(int n) {
        return (n>0 && ((n&(n-1))==0));
       
    }
}