// Last updated: 08/02/2026, 19:46:12
class Solution {
    public int differenceOfSums(int n, int m) {
        int total=0;
        int k;
        int mul;
        total=n*(n+1)/2;
        k=n/m;
        mul=m*k*(k+1)/2;
        return total -2*mul;
        
    }
}