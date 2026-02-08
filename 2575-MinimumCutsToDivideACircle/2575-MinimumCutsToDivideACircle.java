// Last updated: 08/02/2026, 19:46:35
class Solution {
    public int numberOfCuts(int n) {
        int odd=0;
        int even=0;
        if(n==1){
            return 0;
        }else if(n%2==0){
            return n/2;
        }
        else{
            return n;
        }
        
    }
}