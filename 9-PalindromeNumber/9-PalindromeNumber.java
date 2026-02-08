// Last updated: 08/02/2026, 19:47:44
class Solution {
    public boolean isPalindrome(int x) {
        int palin=0;
        int copy=x;
        int rem;
        if(x<0){
            return false;
        }while(x!=0){
            rem=x%10;
            palin=(10*palin)+rem;
            x/=10;
        }
        if(palin==copy)
        return true;
        else return false;
        
        
    }
}