// Last updated: 08/02/2026, 19:47:21
class Solution {
    public boolean isPowerOfFour(int n) {
        return (n>0 && ((n&(n-1))==0)&(n&0b01010101010101010101010101010101)!=0);

    }
}