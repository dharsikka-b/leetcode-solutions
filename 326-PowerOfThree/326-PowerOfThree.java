// Last updated: 08/02/2026, 19:47:23
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0) return false;
        while(n%3==0){
            n/=3;
        }if(n==1) return true;
        else return false;

        
    }
}