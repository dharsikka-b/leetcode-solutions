// Last updated: 08/02/2026, 19:46:41
class Solution {
    public int smallestEvenMultiple(int n) {

        if(n%2==0&&n%n==0){
            return n;
        }
        else {
            return 2* n;
        }
        
    }
}